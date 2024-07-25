package collections;

import java.util.Queue;
import java.util.concurrent.Callable;

public class AddJobToQueue implements Callable<Integer> {
    Queue<Integer> queue;
    int x;
    AddJobToQueue(Queue<Integer> queue , int x){
        this.queue = queue;
    }
    @Override
    public Integer call() {
        queue.add(x);
        return x;
    }
}
