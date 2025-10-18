package org.example;

import org.example.Vehiculo.Vehiculo;

import java.util.ArrayList;

public class Agencia {

    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    public Agencia() {
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }


    public void registrarVehiculo(Vehiculo vehiculo) {
        if (existeVehiculo(vehiculo.getPatente())){
            throw new PatenteDuplicadaError();
        }
        this.vehiculos.add(vehiculo);
    }

    public boolean existeVehiculo(String patente) {
        return vehiculos.stream()
                .anyMatch(vehiculo -> vehiculo.getPatente().equals(patente));
    }

    public boolean existeCliente(int id) {
        return clientes.stream()
                .anyMatch(cliente -> cliente.getID() == id);
    }

    public void registrarCliente(Cliente cliente) {
        if (existeCliente(cliente.getID())){
            throw new ClienteDuplicadoError();
        }
        this.clientes.add(cliente);
    }

    public Alquiler asignarAlquiler(Vehiculo vehiculo, Cliente cliente, int dias) {
        return cliente.alquilar(vehiculo, dias);
    }

    private ArrayList<Alquiler> obtenerAlquileresCliente(Cliente cliente) {
        if (!existeCliente(cliente.getID())){
            throw new ClienteNoRegistradoError();
        }
        return cliente.getAlquileres();
    }

    public double obtenenerPrecioTotalAgenciaAlquileres() {
        return clientes.stream()
                .flatMap(cliente -> cliente.getAlquileres().stream())
                .mapToDouble(Alquiler::obtenerPrecio)
                .sum();
    }

    public double obtenerPrecioTotalClienteAlquileres(Cliente cliente) {
        ArrayList<Alquiler> alquileres = this.obtenerAlquileresCliente(cliente);
        return (alquileres.stream()
                .mapToDouble(Alquiler::obtenerPrecio)
                .sum());
    }
}
