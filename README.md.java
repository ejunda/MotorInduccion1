/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorinduccion1;

/**
 *
 * @author Erick Unda
 */
class Motor{
public void GenerarPotencia(){
System.out.println("Torque");
}
}
class Trifasico extends Motor{
public void GenerarPotencia(){
System.out.println("35Kw");
}
}
class Monofasico extends Motor{
public void GenerarPotencia(){
System.out.println("65Kw");
}
}
class RotorBobinado extends Motor{
public void GenerarPotencia(){
System.out.println("25Kw");
}
}
class FasePartida extends Motor{
public void GenerarPotencia(){
System.out.println("36Kw");
}
}
public class MotorInduccion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("____________________________________________________________");
        System.out.println("---------[UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE]---------");
        System.out.println("ASIGNATURA: PROGRAMACION");
        System.out.println("DOCENTE: ING. LUIS ALBERTO GUERRA CRUZ");
        System.out.println("NRC: 7450");
        System.out.println("ERICK UNDA");

        Motor Objeto1=new Trifasico();
        Motor Objeto2=new Monofasico();
        Motor Objeto3=new RotorBobinado();
        Motor Objeto4=new FasePartida();


        System.out.println("Motor de Inducción : Trifasico"+'\n'
        +"Un motor monofásico funciona a través de una fuente de potencia monofásica." +'\n'
        + "En el cableado de un motor monofásico, podemos encontrar dos tipos de cables: uno caliente y otro neutro.");
        Objeto1.GenerarPotencia();


        System.out.println("Motor de Inducción : Monofasico"+'\n'
        + "Funciona a través de una fuente de potencia trifásica."+'\n'
        + "Es impulsado por tres corrientes alternas de la misma frecuencia, los cuales alcanzan sus valores máximos de forma alternada.");
        Objeto2.GenerarPotencia();

        System.out.println("Motor de Inducción : RotorBobinado"+'\n'
        + "En los motores de rotor bobinado,"+'\n'
        + "el arrollamiento rotórico está constituido por unas bobinas de hilo de cobre por lo general y cuyos extremos están conexionados a unos anillos  (anillos rozantes)"+'\n'
        + "por los que se alimentaran las bobinas.");
        Objeto1.GenerarPotencia();


        System.out.println("Motor de Inducción : FasePartida"+'\n'
        +"Entre los procedimientos para iniciar el arranque o giro de este tipo de motores de inducción,"+'\n'
        + "Entre los procedimientos para iniciar el arranque o giro de este tipo de motores de inducción,");
        Objeto2.GenerarPotencia();
    }

}
