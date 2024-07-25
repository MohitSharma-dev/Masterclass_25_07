package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class client1 {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(24 , 2022 , "Apr23"));
        list.add(new Student(25 , 2020 , "Apr24"));
        list.add(new Student(21 , 2024 , "Feb23"));

        // Right now we don't how to compare two student objects
        // we need to somehow tell how will two students are going to be compared.
        Collections.sort(list);

        // asc order of age using Lambda expressions
        Collections.sort(list , (o1 , o2) -> {
            if(o1.getAge() < o2.getAge()){
                return -1;
            } else if (o1.getAge() > o2.getAge()){
                return 1;
            }
            return 0;
        });

        for(Student student : list){
            System.out.println(student.getAge() + " " + student.getGradYear());
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(24);
        list1.add(25);
        list1.add(21);
        list1.add(22);

        // We know how to compare two integers
        Collections.sort(list1);
    }
}
