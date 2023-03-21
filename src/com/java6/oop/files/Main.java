package com.java6.oop.files;

import com.java6.oop.encapsulation.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        //File file = new File("Hello.txt");
        //System.out.println(file.getAbsolutePath());
        //File file = new File("Hello1.txt");
        File file = new File("Hello2.txt");

        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /*try {
            Person p = new Person("Anis", 29);
            FileOutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(p);
            objectOutputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person p = (Person) objectInputStream.readObject();
            p.printData();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


       /* try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Hello from Java".getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


       /* try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c= fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/




        /*FileWriter fileWriter = null;
        try {
            char[] ww = {'a', 'b', 'c'};
             fileWriter = new FileWriter(file);
            fileWriter.write("Hello my name is anis\n");
            fileWriter.write('A');
            fileWriter.write(ww);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

        /*try {
            FileReader fileReader = new FileReader(file);

            int c = fileReader.read();
            while (c!=-1){
                System.out.print((char) c);
                c= fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


    }
}
