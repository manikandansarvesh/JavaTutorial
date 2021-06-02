package com.test.Session3.fileconcepts;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderExample {

    private static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) throws Exception {

      /*  File file = new File("D:\\Fileconcepts\\test1.xlsx");
        boolean result = file.createNewFile();
        System.out.println(result);*/

        //Path path = Paths.get("D:\\Fileconcepts\\sample.txt");
       // writeFile(path, "Welcome to Java Training" + NEW_LINE);
      //  readFile(path);

        File sourceFile =new File("D:\\Fileconcepts\\sample.txt");
        File destinationFile=new File("D:\\Fileconcepts\\test.txt");

        FileUtils.copyFile(sourceFile,destinationFile);
        Path path = Paths.get("D:\\Fileconcepts\\test.txt");
        readFile(path);

    }

    private static void writeFile(Path path, String content)
            throws IOException {

        // file does not exist, create and write it
        // if the file exists, override the content
        Files.write(path, content.getBytes(StandardCharsets.UTF_8));
    }

    private static void readFile(Path path)
            throws IOException {

        // file does not exist, create and write it
        // if the file exists, override the content
        List list =Files.readAllLines(path);
        System.out.println(list);
    }
}


