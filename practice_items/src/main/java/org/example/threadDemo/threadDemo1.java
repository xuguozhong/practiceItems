package org.example.threadDemo;

public class threadDemo1 extends Thread{
    public static void main(String[] args) {
        Cat cat = new Cat();
        Thread thread = new Thread(cat);
        thread.start();
    }

}

class Cat implements Runnable{
    String name;
    String color;
    int age;


    @Override
    public void run() {
        int count = 0;
        while (true){
            System.out.println("234567890"+ "  "+ (++count)+"  "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(count==14){
                break;
            }
        }
    }

}
