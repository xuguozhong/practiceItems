package org.example.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class io_practice2 {

    public static void main(String[] args) {
//        inputSteamTest1();
        inputSteamTest2();
    }


    public static void inputSteamTest1(){
        String filePath = "E:\\A_practice\\hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1){
                System.out.println((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void inputSteamTest2(){
        String filePath = "E:\\A_practice\\hello.txt";
        FileInputStream fileInputStream = null;
        int byteLen = 0;
        byte[] bytes = new byte[8];
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((byteLen = fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,byteLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
