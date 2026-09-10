package Day19;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();

        System.out.println(" * Student Registration * ");
        System.out.println("Enter ID: ");
        stud.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter name: ");
        stud.setName(sc.nextLine());
        System.out.println("Enter age: ");
        stud.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter course: ");
        stud.setCourse(sc.nextLine());
        System.out.println("Enter section: ");
        stud.setSection(sc.nextLine());
        System.out.println("Enter address: ");
        stud.setAddress(sc.nextLine());

        System.out.println("Student Profile");
        System.out.println("ID: " + stud.getId());
        System.out.println("Name : " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Course : " + stud.getCourse());
        System.out.println("Section : " + stud.getSection());
        System.out.println("Address : " + stud.getAddress());

    }
}
