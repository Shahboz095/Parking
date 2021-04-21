package com.company;

import javax.security.sasl.SaslClient;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int park = 30;
        System.out.println("In parking" + " " + park + " " + "places");
        int money = 0;
        int coud = 0;
        int command;
        while (true) {
            System.out.println(" 1=>Enter car \n 2=>Exit car");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("How many enter cars");
                    int enter = scanner.nextInt();
                    if (park - enter < 0) {
                        System.out.println("No places");
                    }
                    if (park - enter >= 0) {
                        park -= enter;
                        coud += enter;
                        System.out.println("Enter your car");
                    }
                    break;
                case 2:
                    System.out.println("How many exit cars");
                    int exit=scanner.nextInt();
                    if (exit>30-park){
                        System.out.println("No cars");
                        System.out.println(30-park);
                    }
                    if (exit<=30-park){
                        park+=exit;
                        System.out.println("Exit car");
                        money+=exit*6000;

                    }
            }
        }
    }
}
