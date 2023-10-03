package vehiculos;

public class Vehiculo{
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    public Fabricante fabricante;
    private int CantidadVehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMAxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
        this.placa= placa;
        this.puertas= puertas;
        this.velocidadMaxima= velocidadMaxima;
        this.nombre= nombre;
        this.precio= precio;
        this.peso= peso;
        this.traccion= traccion;
        this.fabricante= fabricante;
        CantidadVehiculos++;
    }
}