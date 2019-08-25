package com.company;

public class Main {

    public static void main(String[] args) {
        double t = 27;
        if (t < 18) {
            System.out.println("Надеть свитер!");
        }
        else {
            System.out.println("Надеть майку!");
        }

        double temp = 10;
        if (temp < 9) {
            System.out.println("Надеть пальто!");
        }
        else if (temp <= 18) {
            System.out.println("Надеть ветровку!");
        }
        else if (temp == 18-25) {
            System.out.println("Надеть джинсовку!");
        }
        else if (temp > 25) {
            System.out.println("Надеть платье!");
        }
        else {
            System.out.println("Надеть куртку!");
        }
    }
}
