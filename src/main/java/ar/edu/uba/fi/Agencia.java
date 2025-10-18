package ar.edu.uba.fi;

import ar.edu.uba.fi.Inmueble.Inmueble;
import ar.edu.uba.fi.Vehiculo.Vehiculo;

import java.util.ArrayList;

public class Agencia {

    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Inmueble> inmuebles;

    public Agencia() {
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.inmuebles = new ArrayList<>();
    }


    public void registrarVehiculo(Vehiculo vehiculoNuevo) {
        if (existeVehiculo(vehiculoNuevo)){
            throw new PatenteDuplicadaError();
        }
        this.vehiculos.add(vehiculoNuevo);
    }

    public void registrarInmueble(Inmueble inmuebleNuevo) {
        if (existeInmueble(inmuebleNuevo)){
            throw new InmuebleDuplicadoError();
        }
        this.inmuebles.add(inmuebleNuevo);
    }

    public boolean existeInmueble(Inmueble  inmuebleNuevo) {
        return inmuebles.stream()
                .anyMatch(inmueble -> inmueble.esIgual(inmuebleNuevo));
    }

    public boolean existeVehiculo(Vehiculo vehiculoNuevo) {
        return vehiculos.stream()
                .anyMatch(vehiculo -> vehiculo.esIgual(vehiculoNuevo));
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

    public Alquiler asignarAlquiler(Alquilable alquilable, Cliente cliente, int dias) {
        return cliente.alquilar(alquilable, dias);
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
