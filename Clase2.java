package clase2;
import java.util.Scanner;
public class Clase2 {
    static Scanner sc=new Scanner(System.in);
    //Determinar si un número es positivo, negativo o neutro
    static void mayor(){
        System.out.print("Ingrese un número: ");
        int a=sc.nextInt();
        
        if(a<0){
            System.out.println("Es negativo");}
        if(a>0){
            System.out.println("Es positivo");}
        if(a==0){
            System.out.println("Es neutro");}
    }
    
    static void amigo(){
        //Ingresar un carácter con el sexo (M o F) de una persona, si es M, que sea tu AMIGO, y si es F tu AMIGUIS.
        char sexo=' ';
        System.out.println("M si es masculino y F si es Femenino");
        sexo=sc.next().charAt(0);
        
        if(sexo=='M'){
            System.out.println("Amigo");
        }
        if (sexo=='F') {
            System.out.println("Amiguis");
        }   
    }
    
    static void salir(){
        //Elabora un programa donde puedas saber si la edad de una persona te conviene para salir.
        
        System.out.print("Ingrese la edad: ");
        int edad=sc.nextInt();
        
        if(edad>=20 && edad<=23){
            System.out.println("Si pueden salir");
        }
        else{
            System.out.println("No es para ti");
        }   
    }
    static void par(){
        System.out.print("Ingrese un número: ");
        int a=sc.nextInt();
        int resulatado;
        if(a%2==0){
            resulatado= a*3;
            System.out.println("Es par, x3 es "+resulatado);
        }
        else{
            resulatado= a*2;
            System.out.println("Es par, x2 es "+resulatado);
        }      
    }
    static void restaurant(){
//        Un restaurante ofrece un descuento del 10% para consumos hasta S/. 100.00 
//        y un descuento de 20% para consumos mayores; para ambos casos se aplica 
//         un impuesto del 19%. Determinar el monto de descuento, el impuesto 
//         y el total a pagar
        System.out.println("Ingrese el costo del consumo: ");
        double costo = sc.nextDouble();
        double descuento,impuesto,total;
        
        if(costo<100){
            descuento=costo*0.1;}
        else {
          descuento=costo*0.2;}
        
        impuesto=(costo-descuento)*0.19;
        total=(costo-descuento)+impuesto; 
        System.out.println("El descuento es: "+descuento);
        System.out.println("El impuesto es: "+impuesto);
        System.out.println("El otal a pagar es: "+total);
    }
  
    public static void main(String[] args) {
        restaurant();
    }
    
}
