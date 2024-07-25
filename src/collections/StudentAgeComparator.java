package collections;

import java.util.Comparator;

// sort according to desc order of age
public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // o1 vs o2 , First arg vs Second arg
        // First to win : return -1
        // Second to win : return 1
        // return 0
        if(o1.getAge() < o2.getAge()){
            // o2 wins because desc order
            return 1;
        } else if (o1.getAge() > o2.getAge()){
            return -1;
        }
        return 0;
    }
}
