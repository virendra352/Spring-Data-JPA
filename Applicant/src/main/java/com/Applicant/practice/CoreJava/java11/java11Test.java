package com.Applicant.practice.CoreJava.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class java11Test {
    public static void main(String[] args) throws IOException {
      Path path= Path.of("file.txt");
      Files.writeString(path, "Java 11 File Handling");
      String content = Files.readString(path);
      System.out.println(content);
      // String class changes
        String s=" Hello Java ";
        System.out.println(s.isBlank()); // empty or contains whitespace
        System.out.println(s.isEmpty()); //String length is 0 return true
        System.out.println(s.strip());
        System.out.println(s.repeat(3));

    }
}
