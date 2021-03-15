package clase02;

//declaracion de Clase
public class Auto {

    // Atributos
    String marca;
    String modelo;
    String color;
    int velocidad;

    /**
     * Este metodo constructor fue deprecado por Autor y Fecha Razon = por
     * considerarse inseguro Usar en su reemplazazo Auto(String marca, String
     * modelo, String color)
     *
     * @deprecated
     */
    @Deprecated
    Auto() {
    } //constructor vacio

    //Constructores
    Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

    }

    //Metodos
    void acelerar() {
        velocidad += 10;
        if (velocidad > 100) {
            velocidad = 100;
        }
    }

    //metodo sobrecargado
    void acelerar(int kilometros) {  //acelerar Int

    }

    void frenar() {
        velocidad -= 10;
    }

    void imprimirVelocidad() {
        System.out.println(velocidad);
    }

    //metodo que retorna un valor
    int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return marca + ", " + modelo + ", " + color + "," + velocidad;
    }

    public String getEstado() {
        return marca + ", " + modelo + ", " + color + "," + velocidad;
    }
}//end class
