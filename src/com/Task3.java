package com;

import java.util.Random;
import java.util.Scanner;

import static com.SafeScanner.nextInt;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания(от 1 до 5): ");
        int temp = nextInt(in);
        while (temp!=0) {
            switch (temp) {
                case 1:
                    first();
                    break;
                case 2:
                    second();
                    break;
                case 3:
                    third();
                    break;
                case 4:
                    fourth();
                    break;
                case 5:
                    fifth();
                    break;
            }
            System.out.println("\nВыберите другое задание, либо введите \'0\' для выхода");
            temp = nextInt(in);

        }
    }

    private static void first(){
        System.out.println("Первое задание");
        int[] array =new int[10];

        for(int i=1;i<=10;i++)
            array[i-1] = i*2;

        for(int i=0;i<10;i++)
            System.out.print(String.valueOf(array[i])+' ');

        System.out.println();
        for(int i=0;i<10;i++)
            System.out.println(array[i]);
    }

    private static void second(){
        System.out.println("Второе задание");
        int[] array = new int[50];
        for(int i=0;i<50;i++)
            array[i] = i*2+1;
        for(int i=0;i<50;i++)
            System.out.print(String.valueOf(array[i])+' ');
        System.out.println();
        for(int i=49;i>=0;i--)
            System.out.print(String.valueOf(array[i])+' ');
    }

    private static void third(){

        int[] array = new int[15];
        int temp =0;

        for(int i=0;i<15;i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(String.valueOf(array[i])+' ');
            if (array[i]%2==0)
                temp++;
        }
        System.out.println("\nКоличество чётных чисел в случайном массиве: "+temp);

    }

    private static void fourth(){

        int[][] array = new int[8][5];
        Random random = new Random();

        for(int i=0;i<8;i++){
            for (int j=0;j<5;j++) {
                array[i][j] = random.nextInt(90) + 10;
                System.out.print(String.valueOf(array[i][j]) + ' ');
            }
            System.out.println();
        }
    }

    private static void fifth(){
        int[][] array = new int[7][4];
        Random random = new Random();
        byte maxSummIndex = 0;
        int maxSumm = 0;
        int temp =1;
        for(byte i=0;i<7;i++){
            for(byte j=0;j<4;j++) {
                array[i][j] = random.nextInt(11) - 5;
                System.out.print(String.valueOf(array[i][j])+' ');
                temp *= array[i][j];
            }
            if (Math.abs(temp)>maxSumm){
                maxSumm = Math.abs(temp);
                maxSummIndex = i;
            }
            temp = 1;
            System.out.println();
        }
        System.out.println("Наибольшее по модулю произведение элементов находится в строке: "+(maxSummIndex+1));
    }
}
