package interfaceassign.com.traning.quest2;

import interfaceassign.com.traning.quest1.EmployeeCourses;

import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Z FOR zip , j for jar, r for rar");
        String name = sc.next();

        IExtractor extractor ;
       if(name.equalsIgnoreCase("z"))
        {
            extractor= new ZipExtractor();
            extractor.extractFiles("examples.zip");
        }

       else if(name.equalsIgnoreCase("r"))
        {
            extractor= new RarExtractor();
            extractor.extractFiles("rar.zip");
        }
       else if(name.equalsIgnoreCase("j"))
        {
            extractor= new JarExtractor();
            extractor.extractFiles("examples.jar");
        }
else {
           System.out.println("Enter valid char");
       }




    }
}
