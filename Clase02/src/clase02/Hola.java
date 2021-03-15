package clase02;

import javax.swing.JOptionPane;

/**
 * Henrry G.
 */
public class Hola {

    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        //JOptionPane.showMessageDialog(null, "Hola Mundo!");

        //Clase 02 Programacion Orientada a Objetos.
        /*
        
        CLASE:::::
        Que es una clase? Una clase se encuentra como un sustantivo...
        Ejemplos: Cliente, Factura, Articulo, Auto
        
        Una clase en java es un Objeto de l aclase java.lang.Class
        
        ********************
        ATRIBUTO:::::
        Que es un atributo? Un Atributo describe a la clase, es un ...Adjetivo... de la clase
        son variables contenidas dentro de una clase.
                      
        Un Atributo en Java es un Objeto de la clase java.lang.reflect.Field
        Los atributos tiene un proceso de inicializacion.
        Los atributos numericos, se inicializan en = 0.
        Los atributos String se inicializan en = null
        *************************
        
        METODO:::::
        Que es un Metodo? un metodo es una accion que realiza la clase.
        Se expresa como un .....VERBO...
        Un metodo en Java es un Objeto de clase java.lang.reflect.Method
        
        *****************************
        OBJETO::::
        Que es un objeto? Un Objeto representa una situacion en particular
        ( tambien se llama .....Instancia.....)de una clase
        tiene un estado propio( tiene valor en sus atributos)
        Las clases declaran los atributos y los objetos completan el estado de los atributos
        
        Metodos Sobrecargados:::
        son metodos dentro de una misma clase que se llaman igual, 
        pero tienen distinta firma de parametros de entrada
        
        Metodos COnstructores:::
        Son metodos que se ejecutan al contruir un objeto e inicializan el objeto 
        Existe la sobrecarga de constructore.
        Si la clase no tiene constructor Java agrega un constructor vacio al compilar
        los constructores
        
        
        En java los constructores con objetos de la clase java.lang.reflect.Constructor
         */
        System.out.println("...auto1...");
        Auto auto1 = new Auto(); //se llama al constructor
        auto1.marca = "Fiat";
        auto1.modelo = "Doblo";
        auto1.color = "Rojo";

        auto1.acelerar();   //10
        auto1.acelerar();   //20
        auto1.acelerar();   //30
        auto1.frenar();     //20

        System.out.println(auto1.marca + ", " + auto1.modelo + ", " + auto1.color + ", " + auto1.velocidad + ", ");

        System.out.println("...auto2...");

        Auto auto2 = new Auto();
        auto2.marca = "Rebault";
        auto2.modelo = "Kangoo";
        auto2.color = "Azul";

        for (int a = 0; a <= 50; a++) auto2.acelerar();
        
        System.out.println(auto2.marca + ", " + auto2.modelo + ", " + auto2.color + ", " + auto2.velocidad + ", ");

        auto2.imprimirVelocidad();
        System.out.println(auto2.getVelocidad());
        //JOptionPane.showMessageDialog(null, "Velocidad: "+auto2.getVelocidad());
        
        //Metodo Constructores
        System.out.println("...Auto3...");
        Auto auto3 = new Auto("Pegeout","Partner", "Blanco");
        auto3.acelerar(11);
        
        //Metodo toString()
        System.out.println(auto3.toString());
        System.out.println(auto3);
        System.out.println(auto3.getEstado());
            
        
        int x;
        String x2;
        //System.out.println(x);  //Error hay que inicializar la variable
        //System.out.println(x2);  //
    }
}
