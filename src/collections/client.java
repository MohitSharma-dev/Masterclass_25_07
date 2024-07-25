package collections;

import java.util.*;
import java.util.concurrent.*;

public class client {
//    private static Map<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();

        ExecutorService ex = Executors.newCachedThreadPool();
        for(int i = 0; i < 10000; i++){
            AddJobToQueue x1 = new AddJobToQueue(queue , i);
            // behind the scenes use threads
            ex.submit(x1);
        }
        ex.shutdown();
        boolean check = ex.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        System.out.println(queue.size());

//        Runnable task = () -> {
//            for (int i = 0; i < 1000; i++) {
//                concurrentHashMap.put(Thread.currentThread().getName() + i, i);
//            }
//        };
//
//        Thread thread1 = new Thread(task);
//        Thread thread2 = new Thread(task);
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Size of ConcurrentHashMap: " + concurrentHashMap.size());
    }
}
