public class CreacionVehiculos {

    String marca;
    String modelo;
    int añoFabricacion;
    double precio;
   

    public void crearVehiculo(String marca, String modelo, int añoFabricacion, double precio){
        
this.marca=marca;
this.modelo=modelo;
this.añoFabricacion=añoFabricacion;
this.precio=precio;

        
    }

    public void CalcularValor(int añoFabricacion,double precio){
        
        if (añoFabricacion>5) {
            double CalculoDescuento=precio*0.1;
            double descuento=precio-CalculoDescuento;
            double valorFinal=descuento;
        } if (añoFabricacion<1) {
            double calculoImpuesto=precio*0.15;
            double impuesto=precio+calculoImpuesto;
           double valorFinal=impuesto;
        }
}
public void imprimir(){
    System.out.println("Marca del vehiculo: "+marca);
    System.out.println("Modelo del vehiculo: "+modelo);
    System.out.println("Año fabricación del vehiculo: "+añoFabricacion);
    System.out.println("Precio del vehiculo "+precio);
   
        
}

}