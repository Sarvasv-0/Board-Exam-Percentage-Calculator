/*
Copyright (c) 2023, Sarvasv-0
All rights reserved.

This source code is licensed under the BSD-style license found in the
LICENSE file in the root directory of this source tree. 
 */
import java.util.Scanner;

public class BoardPercent{
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Board Percent Calculator");
        System.out.println();
        System.out.print("Enter the maximum obtainable marks: ");
        Scanner sc = new Scanner(System.in);
        float max = sc.nextFloat();
        double max2 = max*5D;
        System.out.print("Enter marks for Subject 1: ");
        float subject1 = sc.nextFloat();
        System.out.print("Enter marks for Subject 2: ");
        float subject2 = sc.nextFloat();
        System.out.print("Enter marks for Subject 3: ");
        float subject3 = sc.nextFloat();
        System.out.print("Enter marks for Subject 4: ");
        float subject4 = sc.nextFloat();
        System.out.print("Enter marks for Subject 5: ");
        float subject5 = sc.nextFloat();


        double output = (double) (((subject1+subject2+subject3+subject4+subject5)/max2)*100);
        System.out.println("The average percent of these subjects is: "+output+"%");
        
        sc.close();
    }
}