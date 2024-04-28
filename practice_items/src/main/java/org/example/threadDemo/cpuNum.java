package org.example.threadDemo;


public class cpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println("本电脑总共有几个核："+i);
    }
}
