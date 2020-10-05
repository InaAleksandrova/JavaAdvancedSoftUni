package streamsFilesDirectoriesLab;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JavaAdvancedMaterials\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources");
        System.out.println(file.isDirectory());
        File[] files = file.listFiles();

        new File(file.getAbsolutePath() + "demo.txt").createNewFile();
    }
}
