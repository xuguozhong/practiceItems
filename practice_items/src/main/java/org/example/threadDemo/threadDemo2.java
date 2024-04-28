package org.example.threadDemo;

import java.util.WeakHashMap;

/**
 * 使用多线程，模拟窗口售票
 */
public class threadDemo2 {
    public static void main(String[] args) {
        /*SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();*/

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
    }




}

/**
 * 使用继承 thread
 */
class SellTicket01 extends Thread{
    //多个线程共享
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true){
            if(ticketNum<=0){
                System.out.println("售票结束！");
                break;
            }
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"进行售卖一张票"+
                        "当前还剩"+(--ticketNum));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SellTicket02 implements Runnable{
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true){
            if(ticketNum<=0){
                System.out.println("售票结束！");
                break;
            }
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"进行售卖一张票"+
                        "当前还剩"+(--ticketNum));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
