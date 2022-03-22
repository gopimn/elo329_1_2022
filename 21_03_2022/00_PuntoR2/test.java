import java.util.Scanner;  // Import the Scanner class

public class test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Create a Scanner object
        System.out.println("########## Jugando con puntos ######## \ningrese su abscisa(x)");
        int x = reader.nextInt();  // Read user input
        System.out.println("ingrese su ordenada(y)");
        int y = reader.nextInt();  // Read user input
        Punto first = new Punto();
        Punto second = new Punto(x, y);
        if (first.equals(second))
            System.out.println("su punto es el origen");
        else
            System.out.println("su punto es distinto al origen\ncon una distancia de:" + first.distance(second));
        reader.close(); // importante cerrar el reader
    }
}

class Punto { // nombre de la clase
    private int x, y;

    // atributos para almacenar el estado.
    public Punto() { // método, define estado inicial,al momento de
        x = y = 0; // ser creado, lo llamamos método constructor.
    } // fin de constructor

    public Punto(int _x, int _y) { // otro constructor
        x = _x;
        y = _y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Punto p) {
        if (p == null)
            return false;
        return ((x == p.getX()) && (y == p.getY()));
    }

    // Obtiene la distancia sqrt((x1-x2)^2 + (y1-y2)^2)
    public double distance(Punto p) {
        if (p == null)
            return -1; // distancia negativa, punto inexistente
        double xx = x - p.getX(); // pow acepta double asi que lo guardamos de esta manera
        double yy = y - p.getY(); // pow acepta double asi que lo guardamos de esta manera
        return (Math.sqrt(Math.pow(xx, 2) + Math.pow(yy, 2)));
    }
}