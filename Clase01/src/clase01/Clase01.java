package clase01;

/**
 * Comentario JAVA DOC son comentarios que se ven fuera del codigo binario se
 * debe colocar este comentario delante de la declaracion de metodos o clases.
 */
public class Clase01 {

    /**
     * Punto de entrada al proyecto
     *
     * @param args - argumentos de entrada de consola HG.
     */
    public static void main(String[] args) {
        System.out.println("Hola Henrry");
        System.out.println("Longitud de vector args: " + args.length);
        for (int a = 0; a < args.length; a++) {
            System.out.println(args[a]);
        }
    }
}
