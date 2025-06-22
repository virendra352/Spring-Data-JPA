package com.medium.java.sftp.Thread;

import com.medium.java.sftp.javaPractice.Student;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s=new Student(99,"java");
        FileOutputStream fileOutputStream=new FileOutputStream("serialize.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s);
        objectOutputStream.flush();

        FileInputStream fileInputStream=new FileInputStream("serialize.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student s2=(Student)objectInputStream.readObject();
        System.out.println(s2);
    }
}
