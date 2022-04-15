import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class leer {
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of("demo.txt");
        String content = "hello world !!";
        Files.writeString(fileName, content);

        String actual = Files.readString(fileName);
        System.out.println(actual);
    }
}
