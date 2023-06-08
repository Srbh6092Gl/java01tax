package com.srbh6092gl.tax;

import java.util.Scanner;

public class TaxCalc {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the income");
        double income = S.nextDouble();
        double tax = calcTax(income);
        System.out.println("Tax is: "+ tax);
    }

    public static double calcTax(double income) {
        if(income>150000)
            return 1000+18000+0.3*(income-150000);
        else if(income>60000)
            return 1000+0.2*(income-60000);
        else if(income>50000)
            return 0.1*(income-50000);
        else return 0.0;
    }
}
