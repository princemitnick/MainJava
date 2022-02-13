package com.prince.files_rw.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFiles {

    public static void main(String... args){
        Path path = Path.of("/home/princemitnick/java/nio/sonnet-UTF8.txt");

        boolean exists = Files.exists(path);
        System.out.println("Exists = "+ exists);

        try {
            BufferedReader read = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            String line =  read.readLine();
            while (line != null){
                System.out.println("Line = "+ line);
                line = read.readLine();
            }

        } catch (IOException e) {
            System.out.println("Exception : "+ e.getMessage());
        }

    }
}
