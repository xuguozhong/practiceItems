package org.example.demo1;


import java.io.File;
import java.io.IOException;

public class io_practice1 {
    public static void main(String[] args) {
//        createFile1();
//        createFile2();
        createFile3();
    }

    public static void createFile1(){
        String filePath = "E:\\A_practice\\demo1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFile2(){
        String filePath = "E:\\A_practice\\";
        String fileName = "demo2.txt";
        File file = new File(filePath,fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFile3(){
        String filePath = "E:\\A_practice\\";
        File parentFile = new File(filePath);
        String fileName = "demo3.txt";
        File file = new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
