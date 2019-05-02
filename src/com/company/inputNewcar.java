package com.company;

import java.util.Scanner;

public class inputNewcar {

    public static void main(String[] args){


        Car2 myCar = new Car2 (2009,"KIA");
        Scanner input= new Scanner(System.in);

        int speed = myCar.getSpeed();
//        System.out.println("Enter you speed");
//        int response= input.nextInt() ;
        for (int i = 0; i < 5; i++)
        {

            System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                    " " + "is going " );
            myCar.accelerateSpeed(speed);
            System.out.println("Your Speed now is: " + speed);
        }

        speed = Integer.parseInt("Enter Your Speed" );
        for (int i = 0; i < 5; i++)
        {

            System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                    " " + "is going " );
            myCar.slowSpeed(speed);
            System.out.println("Your Speed now is: " + speed);
        }

    }
}
