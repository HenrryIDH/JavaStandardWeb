package clase02;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Clase principal del proyecto.
 * @author carlos
 */
public class Clase02 {

    /**
     * Punto de entrada al proyecto.
     * @param args argumentos de entrada de consola.
     */
    public static void main(String[] args) {
        /*
        Curso: Java Standard Web Programing 11.X    40 hs
        Días:   Lunes Y Miércoles 10:00 a 13:00 hs
        Profe: Carlos Ríos      carlos.rios@educacionit.com
        
        Materiales: alumni.educacionit.com
                user: email     pass: dni
        github: https://github.com/crios2020/JavaSEMarzo
        
        Software:       JDK LTS 8.X o sup.
        
        JDK: Java Development Kit
        
        IDE: Integrated Development Enviroment
            Netbeans - Eclipse - STS - IntelliJ - JDeveloper
        
        */
        
        // Linea de comentarios
        /* Bloque de Comentarios */
        
        /**
         * Comentario JavaDOC
         * Puede ser visible por fuera del código binario.
         * Se debe colocar este comentario delante de la declaración de métodos o clases.
         */
        
        // Tipo de datos primitivos.
        
        // Tipo de datos numericos entero
        
        // Tipo de datos boolean                1 byte
        boolean bo=true;
        System.out.println(bo);
        bo=false;
        System.out.println(bo);
        
        // Tipo de datos byte signed            1 byte
        byte by=100;
        System.out.println(by);
        
        // Tipo de datos short                  2 bytes
        short sh=-30000;
        System.out.println(sh);
        
        // Tipo de datos int                    4 bytes
        int in=2000000000;
        System.out.println(in);
        
        // Tipo datos long                      8 bytes
        long lo=3000000000L;
        System.out.println(lo);
        
        // Tipo datos char  (unicode)           2 bytes unsigned
        char ch=65;
        System.out.println(ch);
        ch+=32;
        System.out.println(ch);
        ch='t';
        System.out.println(ch);
        
       
        // Tipo de datos float 32 bits
        float fl=3.45f;
        System.out.println(fl);
        
        // Tipo de datos double 64 bits
        double dl=3.45;
        System.out.println(dl);
        
        fl=10;
        dl=10;
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        fl=100;
        dl=100;
        System.out.println(fl/3);
        System.out.println(dl/3);        
        
        // DigDecimal
        BigDecimal bg=new BigDecimal("0000000000000");
        
        
        // DecimalFormat
        double precio=1000000.50;
        System.out.println(precio);
        DecimalFormat df=new DecimalFormat("###,###,###.00");
        System.out.println(df.format(precio));
                
        // String
        String st="hola";
        System.out.println(st);
        //System.out.println(st.value[0]);
        System.out.println(st.charAt(0));
        
        /*
        
            JDK 9 o inf.
            private final char[] value;            "hola"      8 bytes
        
            JDK 10 o sup                           "hola"      4 bytes
            private final byte[] value;
        
        */
        
        // tipo de datos var JDK 9 o sup
        var var1=2;                         //int
        //var1="hola";      //error
        var var2=true;                      //boolean
        var var3=2.35;                      //double
        var var4=2.35d;                     //double
        var var5=2.35f;                     //float
        var var6=2L;                        //long
        var var7='A';                       //char
        var var8="A";                       //String
  
        metodo(true);
        
        String texto="Esto es una cadena de texto!";
        System.out.println(texto);
        
        //Recorrer el vector texto e imprimirlo
        for(int a=0;a<texto.length();a++) System.out.print(texto.charAt(a));
        System.out.println();
        
        //Imprimir texto en mayusculas
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }
        System.out.println();
        
        //Operador ternario ?
        for(int a=0;a<texto.length();a++){
            char car=texto.charAt(a);
            System.out.print((car>=97 && car<=122)?car-=32:car);
        }
        System.out.println();
        
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
        
        
        // Pendiente Estructura de proyecto!!
        
        
    }
    
    public static void metodo(int x){
        System.out.println("Entero");
    }
    
    public static void metodo(long x){
        System.out.println("long");
    }
    
    public static void metodo(boolean x){
        System.out.println("boolean");
    }
    
    public static void metodo(float x){
        System.out.println("float");
    }
    
    public static void metodo(double x){
        System.out.println("double");
    }
    
    public static void metodo(char x){
        System.out.println("char");
    }
    
    public static void metodo(String x){
        System.out.println("String");
    }

}
