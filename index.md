# Programación Orientada a Objetos
Programación del curso: [programacion ELO329 1er SEM 2022.xlsx](https://github.com/gopimn/elo329_1_2022/files/8427191/programacion.ELO329.1er.SEM.2022.xlsx)

## Clase 9-03-2022
Estos son los del semestre pasado pero no los he actualizado:
- [Presentacion](https://github.com/gopimn/elo329_1_2022/files/8279382/00-Presentacion.pdf)
- [Concepts](https://github.com/gopimn/elo329_1_2022/files/8279389/1-OOP_Concepts.pdf)

## Clase 14-03-2022
También del semestre pasado:
- [2-JavaIntroduction.pdf](https://github.com/gopimn/elo329_1_2022/files/8279401/2-JavaIntroduction.pdf)

## Clase 16-03-2022
### La clase del semestre pasado
[3-BasicJavaLanguage.pdf](https://github.com/gopimn/elo329_1_2022/files/8279424/3-BasicJavaLanguage.pdf)
### El código que vimos
Con la parte de la distancia, le agregue también entrada de datos por el usuario:
```java
import java.util.Scanner;  // Import the Scanner class

public class Main {
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
``` 
para correr el codigo:

``` 
> javac Main.java && java Main
########## Jugando con puntos ######## 
ingrese su abscisa(x)
0
ingrese su ordenada(y)
0
su punto es el origen
```

## Clase 21-03-2022
La presentación que revisamos (semestre pasado):
- [04.JavaClassesAndObjects.pdf](https://github.com/gopimn/elo329_1_2022/files/8328068/04.JavaClassesAndObjects.pdf)

Me pille con este video, lo encontre bueno:
- [Java Full Course ☕【𝙁𝙧𝙚𝙚】](https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4234s)

El ayudante termino el tutorial de vscode+java en windows (ubuntu pendiente por ahora):
- [capsulas-elo329-SJ](https://github.com/cnilo/capsulas-elo329-SJ)
- [videotutorial](https://drive.google.com/file/d/17Ns_GZTskopNOLs3Lix6TtX20U4OzuDm/view)

Si yo fuera ustedes, me vería esta serie que es vieja pero es super deep:
- [Programming Paradigms (Stanford)](https://www.youtube.com/watch?v=Ps8jOj7diA0&list=PL9D558D49CA734A02)

También creo que esta app es buena para aprender desde cero:
- [SoloLearn](https://www.sololearn.com/home)

El código que analizamos en clase, ademas del de la clase pasada:

```java
/**
   @version 1.00 2000-01-27
   @author Cay Horstmann
*/

import java.util.*;

public class ConstructorTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Harry", 40000);
      staff[1] = new Employee(60000);
      staff[2] = new Employee();

      // print out information about all Employee objects
      for (int i = 0; i < staff.length; i++)
      {
         Employee e = staff[i];
         System.out.println("name=" + e.getName()
            + ",id=" + e.getId()
            + ",salary=" + e.getSalary());
      }
   }
}

class Employee
{
   // three overloaded constructors
   public Employee(String n, double s)
   {
      name = n;
      salary = s;
   }

   public Employee(double s)
   {
      // calls the Employee(String, double) constructor
      this("Employee #" + nextId, s);
   }

   // the default constructor
   public Employee()
   {
      // name initialized to ""--see below
      // salary not explicitly set--initialized to 0
      // id initialized in initialization block
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public int getId()
   {
      return id;
   }

        // object initialization block
	// llamado cada vez que un nuevo objeto es creado
   {
      id = nextId;
      nextId++;
   }

   // static initialization block
	// ejecutado una vez tan pronto parte el programa y antes de main.
   static {
      Random generator = new Random();
      // set nextId to a random number between 0 and 9999
      nextId = generator.nextInt(10000);
   }
   private int id;
   private static int nextId;
   private String name = ""; // instance variable initialization
   private double salary;
}
```
## Clase 23-03-2022
Vamos a trabajar con esta presentación:
- [05.JavaInheritance.pdf](https://github.com/gopimn/elo329_1_2022/files/8328111/05.JavaInheritance.pdf)

### Noticias
- en la mañana no hay laboratorio, por lo que se ve dificil que nos den uno para la tarde.
- metanse porfa al link que hizo María para cambiarse de paralelo.

## Clase 28-03-2022
- miercoles no hay clase
- esta es la presentación que revisaremos hoy:
    + [06.DynamicBinding_AbstractClasses.pdf](https://github.com/gopimn/elo329_1_2022/files/8365718/06.DynamicBinding_AbstractClasses.pdf)
- la planificación del curso:
    + [programacion ELO329 1er SEM 2022.xlsx](https://github.com/gopimn/elo329_1_2022/files/8365726/programacion.ELO329.1er.SEM.2022.xlsx)
- el profesor Werner ha estado subiendo las grabaciones de sus clases:
    + [canal del profe](https://www.youtube.com/channel/UCjQTa48YyXQaVVxSIWBlsBQ)


## Clase 04-04-2022
- esta fue la presentacion que revisamos:
  + [07.Classes_Object_ArrayList_Class.pdf](https://github.com/gopimn/elo329_1_2022/files/8427138/07.Classes_Object_ArrayList_Class.pdf)
  + capsula interesante de como usar git [ACA!](https://drive.google.com/file/d/1ZH8IUr5LVH5nLKY9nG6ZoZgwLefBdazb/view)
  + la tarea [T1_ELO329_1s22(1).docx](https://github.com/gopimn/elo329_1_2022/files/8427174/T1_ELO329_1s22.1.docx)

## Clase 06-04-2022
- La presentacion:
  + [08.JavaInterfaces.pdf](https://github.com/gopimn/elo329_1_2022/files/8427183/08.JavaInterfaces.pdf)
- Howto VScode+ java ubuntu
  + [video](https://drive.google.com/file/d/18pbAxgkTohrkWFToxzIqXP-4CAC62slS/view) 

## CLases 11-13_04_2022
Las presentaciones:
- [09.Java_InternalClasses_clone.pdf](https://github.com/gopimn/elo329_1_2022/files/8497368/09.Java_InternalClasses_clone.pdf)
- [10.Java_LambdaExpressions.pdf](https://github.com/gopimn/elo329_1_2022/files/8497370/10.Java_LambdaExpressions.pdf)
- [11.JavaExceptions.pdf](https://github.com/gopimn/elo329_1_2022/files/8497372/11.JavaExceptions.pdf)
Los videos estan en AULA:
- [inner class](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/InnerclAss.mp4) 
- [Exceptions 1](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/primera%20excepciones.mp4?time=1650046455427)
- [Exceptions 2](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/second.mp4)
- [files](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/files.mp4)
Por favor revisen la carpeta en este repo, con el codigo 11-13

## JavaFX 02/05/2022 + 

Presentaciones:
- [12.JavaEventBasedProgramming.pdf](https://github.com/gopimn/elo329_1_2022/files/8612609/12.JavaEventBasedProgramming.pdf)
- [13.JavaFXGraphicsProgramming.pdf](https://github.com/gopimn/elo329_1_2022/files/8636405/13.JavaFXGraphicsProgramming.pdf)
- [14.JavaFXGraphicsProgramming_Part2.pdf](https://github.com/gopimn/elo329_1_2022/files/8636410/14.JavaFXGraphicsProgramming_Part2.pdf)



y el video que explica como generar un proyecto con maven:

- [maven vid](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/vid.mp4)

- [java fx 00 01](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/video1895592790.mp4)
- [java fx 00 02](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/video1294040240.mp4)
- [java fx 01 01](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/javafx_01_01.mp4)
- [java fx 01 02](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/javafx_01_02.mp4)
- [java fx 02 01](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/javafx_02_01.mp4)
- [java fx 02 02](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/javafx_02_02.mp4)
- [java fx 03 01](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/javafx_03_01.mp4)
- [java fx 03 02](https://aula.usm.cl/pluginfile.php/3424763/mod_label/intro/javafx_03_02.mp4)

## Curso Profe agustin:
- [presentacion](https://youtu.be/GW18agYAj_o)
- [intro java](https://youtu.be/tvVA1Nf-jq4)
- [tipos](https://youtu.be/Q7AdpDr2CKM)
- [clases](https://youtu.be/MWJbtShDfnc)
- [herencia](https://youtu.be/e6KPfsxULOg)
- [ligado dinamico](https://youtu.be/IxxNYWL5nOA)
- [abstract class](https://youtu.be/14Mo2g857GM)
- [arraylist](https://youtu.be/7PN6p8VAQRM)
- [interfaces](https://youtu.be/Fz2FlDaFocA)
- [makefile](https://youtu.be/QyQox-rpQVE)
- [anidadas](https://youtu.be/3g6HJzrWeDQ)
- [lambda](https://youtu.be/fc6xY_Z8fh0)
- [event based](https://youtu.be/ZdcyIqZwfmM)
- [javaFX 1](https://youtu.be/1TnRdo6Qs1Y)
- [javaFX 2](https://youtu.be/5lY0fV_4ECw)
- [java FX 3](https://youtu.be/oOrJDIAMUrE)
- [android](https://youtu.be/zK51aQ9iogU)

## Certamenes anteriores:
[certamenes elo.zip](https://github.com/gopimn/elo329_1_2022/files/8636420/certamenes.elo.zip)
