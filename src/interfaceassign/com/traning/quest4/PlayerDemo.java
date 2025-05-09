package interfaceassign.com.traning.quest4;

import interfaceassign.com.traning.quest1.EmployeeCourses;

import java.util.Scanner;

public class PlayerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IMesiaPlayer player;
        System.out.println("Enter vlc or windows ");
        String name = sc.next();
        if(name.equalsIgnoreCase("vlc")) {
           player = new VLCMediaPlayer();
            player.downloadMusic();
            player.PlayMusic();


        }
        else if(name.equalsIgnoreCase("windows")) {
           player = new WindowsMediaPlayer11();
            player.PlayMusic();
            player.downloadMusic();


        }
        else
        {
            System.out.println("Enter valid val");
        }



    }
}
