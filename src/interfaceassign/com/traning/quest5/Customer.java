package interfaceassign.com.traning.quest5;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basicphone b and touchscreen t");
        IFeaturePhone smartPhone;

        String name = sc.next();
        if(name.equalsIgnoreCase("b")) {
                  smartPhone= new BasicMobile();
                  smartPhone.call();
                  smartPhone.messaging();

        }
        else if(name.equalsIgnoreCase("t"))
            {
    ISmartPhone smartPhone1= new TouchScreenMobile();
    smartPhone1.showApps();
    smartPhone1.cameraTypes();
            }
        }
    }

