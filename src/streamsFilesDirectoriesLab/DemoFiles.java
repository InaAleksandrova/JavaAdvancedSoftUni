package streamsFilesDirectoriesLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;

public class DemoFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("input.txt");

        //BufferedReader reader = Files.newBufferedReader(path);

        List<String> strings = Files.readAllLines(path);

        Files.write(Paths.get("files-demo.txt"), strings);



    }
}
