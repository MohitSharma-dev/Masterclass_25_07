package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Client2 {
    public static void main(String[] args) {

//        Collection interface

//        List : Ordered collection : sequence

        // ArrayList , LinkedList , Vector , Stack

        // ArrayList : Resizable Array : uses a normal array
        // random access : O(1)
        List<Integer> list = new ArrayList<Integer>();
        // dynamic array is implemented behind the scenes
        // array size : 4
        // 1 2 3 4 : creates another new array of double size
        // copy the existing data over there
        // 1 2 3 4 _ _ _ _
        // 1 2 3 4 5 6 7 8 : size is doubled
        // 1 2 3 4 5 6 7 8 _ _ _ _ _ _ _ _
        // Amortized Time complexity : O(1) : Homework
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(1);
        // doubly linked List
        List<Integer> list2 = new LinkedList<>();
        // ArrayList and LinkedList are not thread safe
        // You might get errors in the case of multiple threads using the same data

        // vector and stack
        // thread safe

        List<Integer> list3 = new Vector<>();
        // stack extends vector
        // LIFO operations
        // Also Thread safe
        // Stack DS is implemented using arrays and LL
        // Thread safety bring higher time complexity
        List<Integer> list4 = new Stack<>();

        // read about this : Concurrent List : thread safe
        List<Integer> list5 = new CopyOnWriteArrayList<>();



        // Queue

        // LinkedList : Doubly , Queue ? Yes
        // remove at end , insert at other end

        Queue<Integer> queue = new LinkedList<>();

        Queue<Integer> queue2 = new PriorityQueue<>((x , y) -> {
            if(x > y) {
                return -1;
            } else if (x < y) {
                return 1;
            }
            return 0;
        });
        // COMPARATOR
        queue2.add(7);
        queue2.add(2);
        queue2.add(5);
        queue2.add(3);

        while(!queue2.isEmpty()) {
            // peek method helps you to check the element at the front
            System.out.println(queue2.peek());
            queue2.poll();

        }

        // Set
        // random order
        Set<Integer> set = new HashSet<>();
        // Insertion order : Doubly Linked List + HashMap
        Set<Integer> set2 = new LinkedHashSet<>();
        // Sorted order : BBST : Balanced Binary Search tree
        // Red Black tree
        Set<Integer> set3 = new TreeSet<>();

        // same diff is between diff type of Hashmap

        set.add(5);
        set.add(100);
        set.add(3);
        set.add(2);
        set.add(1);

        set2.add(5);
        set2.add(100);
        set2.add(3);
        set2.add(2);
        set2.add(1);

        set3.add(5);
        set3.add(100);
        set3.add(3);
        set3.add(2);
        set3.add(1);

        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);


        Map<String , Integer> map = new HashMap<>();
        map.put("India" , 500);
        map.put("America", 600);
        map.put("Germany" , 200);

        if(map.containsKey("India")) {
            System.out.println(map.get("India"));
        }
        System.out.println(map.get("Germany"));
    }
}
