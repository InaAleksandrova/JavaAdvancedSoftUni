package streamsFilesDirectoriesLab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) {
        Path path = Paths.get("input.txt");
        Path outputPath = Paths.get("sorted-lines.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l ->
                    !l.isBlank())
                    .collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(outputPath, lines);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
