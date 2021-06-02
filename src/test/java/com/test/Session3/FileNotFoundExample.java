package com.test.Session3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExample {

    public static void main(String[] args)   {

        try {
            FileReader file = new FileReader("D:\\Fileconcepts\\a.txt");
            BufferedReader fileInput = new BufferedReader(file);

            // Print first 3 lines of file "C:\test\a.txt"
            for (int counter = 0; counter < 1; counter++)
                System.out.println(fileInput.readLine());

            fileInput.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        finally{
            System.out.println("The finally code executes");
        }
    }
}
