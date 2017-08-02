/*
 * Main.java 28/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task4;

import java.util.Scanner;
import com.boast.buyer.*;
import com.boast.menu.ConsoleMenu;

public class Main {

    public static void main(String[] args) {

        String menuCommand;
        Scanner in = new Scanner(System.in);

        Buyer[] buyers = new Buyer[15];
        for (int i = 0; i < buyers.length; i++) {
            buyers[i] = new Buyer();
        }

        ConsoleMenu consoleMenu = new ConsoleMenu();

       do {
           menuCommand = in.nextLine();
       }  while (consoleMenu.processCommand(buyers, menuCommand));
    }
}