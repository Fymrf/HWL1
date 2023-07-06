package com.example.hwl1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        start();
    }
    public static void start()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nЧисло от 1 до 4 ");
        int num = in.nextInt();
        if(num==1){printThreeWords();}
        else if (num==2) {checkSumSign();}
        else if (num==3) {printColor();}
        else if (num==4) {compareNumbers();}
        else {System.out.println("Ошибочка");
            start();}
    }
    public static void printThreeWords()
    {
        System.out.print("Orange\nBanana\nApple");
        start();
    }
    public static void checkSumSign()
    {
        int a=2;
        int b= 3;
        if((a+b)>=0)
        {
            System.out.println("Сумма положительная");
        }
        else {System.out.println("Сумма отрицательная");}
        start();
    }
    public static void printColor()
    {
        int value= 3;
        if(value<=0)
        {
            System.out.println("Красный");
        }
        else if(value>0 && value<=100)
        {
            System.out.println("Желтый");
        }
        else {System.out.println("Зеленый");}
        start();
    }
    public static void compareNumbers()
    {
        int a=5;
        int b= 6;
        if(a>=b)
        {
            System.out.println("a>=b");
        }
        else {System.out.println("a<b");}
        start();
    }

}