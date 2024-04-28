package org.example.demo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class io_practice3 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入相关数据：");
        String next = scanner.next();
        System.out.println("输入的内容是："+next);
        String partentPath = "E:\\A_practice\\a\\b\\c";
        File file = new File(partentPath);
        if(!file.exists()){
            file.mkdirs();
        }
        System.out.println("请输入文件名：");
        String fileName = scanner.next();
        File file1 = new File(partentPath, fileName);
        file1.createNewFile();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file1);
            fileWriter.write(next);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
