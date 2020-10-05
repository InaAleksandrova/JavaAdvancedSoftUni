package streamsFilesDirectoriesLab;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File file = new File("D:\\JavaAdvancedMaterials\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");


        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    if (!file1.isDirectory()) {
                        System.out.printf("%s: [%s]%n", file1.getName(), file1.length());
                    }
                }
            }
        }

    }
}
