package collections;

public class Student implements Comparable<Student> {
    private int age;
    private int gradYear;
    private String batch;

    public Student(int age, int gradYear, String batch) {
        this.age = age;
        this.gradYear = gradYear;
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    // this method is used to give the rules for natural sorting
    // We need to sort according to ascending order of grad Year
    @Override
    public int compareTo(Student other) {
        // "this" will be calling the compareTo
        // one object is calling the function : this
        // one object is passed in the function : other
        // this vs other

        // "this" to win (comes first) : return -1
        // "other" to win : return 1
        // equal : return 0

        if(this.gradYear < other.gradYear) {
            return 1;
        } else if(this.gradYear > other.gradYear) {
            return -1;
        }
        return 0;
    }
}

// 7 & 4 , asc : 4 will come first , desc : 7 will come first

// classes and objects
// getters and setters
// interfaces
// generics

// Comparable helps you to give a natural sorting order to a custom class
// For that you need to implement Comparable interface
// give the definition to compareTo

// what is the diff between Comparable and Comparator


// You are not allowed to make any changes in the existing class
// In this case comparator comes into picture