package com.Applicant.practice.CoreJava.codeWithVirendra;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeExample {
    public static void main(String[] args) throws IOException {
        MyClass m=new MyClass(100,"Mohan");
        FileOutputStream fo=new FileOutputStream("file.text");
        ObjectOutputStream ob=new ObjectOutputStream(fo);
        ob.writeObject(m);
        System.out.println("Object is serialize.....");
        ob.flush();
    }
}
