package com.navya.corejava.weekNames;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Days {
    public static void main(String[] args){
        System.out.println("Enter the character:");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch (c ){
            case 's':
                System.out.println("Sunday");
                break;
            case 'm':
                System.out.println("Monday");
                break;
                case 't':
                System.out.println("Tuesday");
                break;
            case 'h':
                System.out.println("Thursday");
                break;
            case 'f':
                System.out.println("Friday");
                break;
            case 'r':
                System.out.println("Saturday");
                break;
            default:
                System.out.println("not available");

        }
    }
}
