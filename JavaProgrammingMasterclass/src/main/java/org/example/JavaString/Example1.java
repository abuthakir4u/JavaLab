package org.example.JavaString;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\abuth\\IdeaProjects\\CoreJavaApp\\src\\JavaString\\oneMbText.txt";
        String payload = readAllBytesJava7(filePath);
        System.out.println(payload.getBytes(StandardCharsets.UTF_8).length);
    }

    private static String readAllBytesJava7(String filePath) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
