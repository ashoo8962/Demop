package interfaceassign.com.traning.quest1;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Institute institute;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student and employee ");
        String name = sc.next();
        if(name.equals("student")) {
             institute = new EmployeeCourses();
            String[] courses =institute.showCourses();
            for(String course:courses)
            {
                System.out.println(course);
            }

        }
        else {
             institute = new StudentCourse();
            String[] courses=institute.showCourses();
            for(String course:courses)
            {
                System.out.println(course);
            }
        }


    }
}
