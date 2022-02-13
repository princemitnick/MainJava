package com.prince.files_rw.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteInFiles {

    public static void main(String... args){
        Path path = Path.of("/home/princemitnick/java/nio/debug.log");

        try (BufferedWriter writer = Files.newBufferedWriter(path);
            BufferedWriter writer2 = new BufferedWriter(writer);
            PrintWriter pw = new PrintWriter(writer2);)
        {
            writer.write("Hello World");

            pw.printf("\ni = %d\n", 12);
            pw.printf("\n Hello Everyone");

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
