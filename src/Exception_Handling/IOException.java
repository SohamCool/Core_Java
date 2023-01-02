package Exception_Handling;

import java.io.*;

// Example of FileNotFoundException
public class IOException {

    public static void main(String[] args) throws java.io.IOException {
        // Creating an instance of FileReader class
        FileReader fileReader = new FileReader("Test.java");

        System.out.println(fileReader.read());

        fileReader.close();
    }
}