package ejercicio3;

public class Ventas{
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUni;
    private double precioTotal;

    public Ventas(int id, String descripcion, int cantidad, double precioUni, double precioTotal){
        this.id=id;
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        this.precioUni=precioUni;
        this.precioTotal=precioTotal;
    }


    public int getId(){ return id; }
    public void setDescripcion(String descripcion){this.descripcion=descripcion;}
    public String getDescripcion(){ return descripcion; }
    public void setCantidad(int cantidad){ this.cantidad=cantidad;}
    public int getCantidad(){return cantidad; }
    public void setPrecioUni(double precioUni){ this.precioUni=precioUni; }
    public double getPrecioUni(){ return precioUni; }
    public void setPrecioTotal(double precioTotal){ this.precioTotal=precioTotal; }
    public double getPrecioTotal(){return  precioTotal; }

    public double calcularPrecioTotal(){return this.precioUni*this.cantidad;}

    @Override///nos va a mostrar el mensaje completo por pantalla
    public String toString(){

        return "\n ID: " + this.id + "\n Descripcion: " + this.descripcion +"\n cantidad: " + this.cantidad + "\n precio Unitario: $"+ this.precioUni + "\n precio Total: $"+ calcularPrecioTotal();

    }

}
