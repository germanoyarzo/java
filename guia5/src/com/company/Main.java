package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner= new Scanner(System.in);
        Menu menu;
        int option;

        do {

            System.out.println("Choose an option ( 0 to exit");

            System.out.println("1: Menu Basic List");
            System.out.println("2: Menu Premium List");

            option = myScanner.nextInt();

            switch (option) {

                case 1:
                    menu = new Menu(new BasicList()); /// creat a new basic list
                    menu.menuSongs();
                    break;
                case 2:
                    menu = new Menu(new PremiumList());
                    menu.menuSongs();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Incorrect option");
                    break;

            }
        }while(option!= 0);






    }
}
