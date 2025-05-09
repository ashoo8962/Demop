package interfaceassign.com.traning.quest6;

import interfaceassign.com.traning.quest5.BasicMobile;
import interfaceassign.com.traning.quest5.IFeaturePhone;

import java.util.Scanner;

public class Restraurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter indian i and intrtnat int");
        ICuisine cuisine;

        String name = sc.next();
        if(name.equalsIgnoreCase("i")) {
            cuisine = new Indian();
            String [] course =   cuisine.showMenu("starters");
            System.out.println("Starteers");
            for(String courses :course)
            {
                System.out.println(courses);
            }
            System.out.println("Dessserts");
            String [] course1 =   cuisine.showMenu("desserts");
            for(String courses :course1)
            {
                System.out.println(courses);
            }

        }
        else if(name.equalsIgnoreCase("int"))
            if(name.equalsIgnoreCase("int")) {
                cuisine = new International();
               String[]course= cuisine.showMenu("starters");
                System.out.println("starters");

                for(String courses :course)
                {
                    System.out.println(courses);
                }
                System.out.println("Dessserts");

                String [] course1 =   cuisine.showMenu("desserts");
                for(String courses :course1)
                {
                    System.out.println(courses);
                }


            }



    }
}
