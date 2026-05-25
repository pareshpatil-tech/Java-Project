import java.util.Scanner;
//student marks analyzer...
public class Project03 {

    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Student name :- ");
    String name = sc.nextLine();
    
    
    System.out.println("Enter number of subject:- ");
    int n = sc.nextInt();
    
    int [] marks = new int[n];

    for(int i=0; i<n; i++) {
        System.out.println("Enter marks of subjects " + (i + 1) + " : ");
        marks[i] = sc.nextInt();
    } 
    int total = 0;

    for(int i = 0; i<n ; i++) {
        total += marks[i]; 
    }
    System.out.println("Total Marks :- "+total);

    int highest = marks[0];
    int lowest = marks[0];

    for(int i=1; i<n ; i++) {
        if(marks[i]>highest) {
            highest = marks[i];
        }
        if(marks[i]<lowest) {
            lowest = marks[i];
        }
    }

    System.out.println("Highest Marks:- "+highest);
    System.out.println("Lowest Marks:- "+lowest);


    double average = (double) total/n;

    char grade;

    if(average>=90) {
        grade = 'A';
    }else if(average>=80){
        grade = 'B';
    }else if(average>=70){
        grade ='C';
    }else if(average>=60){
        grade = 'D';
    }else if(average>=50){
        grade = 'E';
    }else{
        grade ='F';
    }

    System.out.println("----------------Result-----------------------");
    System.out.println("Student name :- "+name);
    System.out.println("Total subjects:- "+n);
    System.out.println("Total marks:- "+total);
    System.out.println("Grades:- "+grade);
    System.out.println("percentage:- "+average + " % ");
    System.out.println("Highest marks:- "+highest);
    System.out.println("Lowest marks:- "+lowest);
    
    


    }
}
