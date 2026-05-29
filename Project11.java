import java.util.HashMap;
//Generic class Student with name, roll, marks & method to display details

class Student {
    String name;
    int roll;
    int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class Project11 {
    public static void main(String[] args) {
        //Students REcord System using HashMap
        HashMap<Integer,Student > student = new HashMap<>();
        student.put(101, new Student("Paresh Patil", 40, 98));
        student.get(101).displayDetails();

    }
}