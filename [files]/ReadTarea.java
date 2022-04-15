import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class ReadTarea {

    public static void main(final String[] args)  {
        readTarea(args[0]);
    }
    public static void readTarea(String filename){
        try{
            Path fileName = Path.of(filename);
            String actual = Files.readString(fileName);
            System.out.println(actual);
            String[] lines = actual.split("\n");
            int actualLine =0;
            while(actualLine < lines.length) {
                if (actualLine == 0)
                    {
                        String[] params = lines[actualLine].split("\t");
                        System.out.println("cortinas " + params[0]);
                        System.out.println("lamparas " + params[1]);
                        System.out.println("control cortinas " + params[2]);
                        System.out.println("control lamparas " + params[3]);
                    }
                actualLine++;
            }
        }
        catch (IOException e){
            System.out.println("ERROR de entrada y salida" + e);
        }
    }
}
