package com.geektrust.traffic1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kraghunathan on 5/19/18.
 */
public class App {

    Vehicle car,bike,tuktuk;
    Orbit orbit1,orbit2;

    public App(){
        car = new Vehicle( "Car", 3, 20f ,Arrays.asList(new Weather[]{
                Weather.SUNNY,Weather.RAINY,Weather.WINDY
        }));
        bike = new Vehicle( "Bike", 2, 10f, Arrays.asList(new Weather[]{
                Weather.SUNNY, Weather.WINDY
        }));
        tuktuk = new Vehicle("Tuktuk", 1, 12f, Arrays.asList(new Weather[]{
                Weather.SUNNY, Weather.WINDY
        }));

        orbit1 = new Orbit("Orbit1", 1,1);
        orbit2 = new Orbit("Orbit1", 1,1);

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while( true) {
            String weather = null;
            float speed1,speed2;

            // ayyo kadavule so many try-catch blocks
            System.out.println( "Enter Weather as windy/sunny/rainy[sunny]");
            try {
                weather = Weather.valueOf(scanner.next()).toString();
            }
            catch(Exception e) {
                System.out.println( e.getMessage()
                        + "\nPlease enter one of windy/sunny/rainy." +
                        "\nOr even press enter to take" +
                        "the default value of 'sunny'");
            }

            System.out.println( "Enter orbit1 traffic speed ");
            try {
                speed1 = Float.valueOf(scanner.next().trim());
            }
            catch(Exception e) {
                System.out.println( e.getMessage()
                        + "\nPlease enter a valid number  value for speed");
            }

            System.out.println( "Enter orbit1 traffic speed ");
            try {
                speed2 = Float.valueOf(scanner.next().trim());
            }
            catch(Exception e) {
                System.out.println( e.getMessage()
                        + "\nPlease enter a valid number  value for speed");
            }

            System.out.println

        }
    }
}
