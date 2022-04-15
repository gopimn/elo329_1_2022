import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Readfile {

    public static void main(final String[] args)  {
        writeread(args[0]);
    }
    public static void writeread(String filename){
        try{
            Path fileName = Path.of(filename);
            String content = "hello world !!";
            Files.writeString(fileName, content);
            String actual = Files.readString(fileName);
            System.out.println(actual);
        }
        catch (IOException e){
            System.out.println("ERROR de entrada y salida" + e);
        }
    }
}
