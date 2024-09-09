import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("***Concesionario de vehiculos***");

Carro carro1 = new Carro();


System.out.println();

carro1.crearCarro("chevrolet", "auto1", 2023, 1000000, 4);
System.out.println();

  carro1.CalcularValor(2023,10000000);
  
System.out.println("*********************************************");

Moto moto1= new Moto();

System.out.println();

moto1.crearMoto("susuki", "sus23", 2023, 1500000, "Deportiva");
   
   System.out.println();
moto1.CalcularValor(2022,1500000);

}
    
}