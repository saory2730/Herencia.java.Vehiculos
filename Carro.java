public class Carro extends CreacionVehiculos {

    double valorFinal;
    int cantPuertas;
    public void crearCarro(String marca, String modelo, int añoFabricacion, double precio,int cantPuertas){
System.out.println(marca);
System.out.println(modelo);
System.out.println(añoFabricacion);
System.out.println(precio);
System.out.println(cantPuertas);
    }

    public void CalcularValor(int añoFabricacion, double precio){

        if (añoFabricacion>5) {
            double CalculoDescuento=precio*0.1;
            double descuento=precio-CalculoDescuento;
             valorFinal=descuento;
        } if (añoFabricacion<1) {
            double calculoImpuesto=precio*0.15;
            double impuesto=precio+calculoImpuesto;
            valorFinal=impuesto;
        }
} 
public void imprimir(){
    System.out.println("Marca del vehiculo: "+marca);
    System.out.println("Modelo del vehiculo: "+modelo);
    System.out.println("Año fabricación del vehiculo: "+añoFabricacion);
    System.out.println("Precio del vehiculo "+precio);
    System.out.println("Número de puertas del vehiculo: "+ cantPuertas);
}


}
