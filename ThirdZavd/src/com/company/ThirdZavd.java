package com.company;

public class ThirdZavd {

    public static void main(String[] args) {
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        double ser1 = 0, ser2 = 0, ser3 = 0;
        for (int i = 0; i > 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 5);
            ser1 = ser1 + array1[i];
            System.out.println(array1[i] + " ");
        }
        for (int i = 0; i > 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 5);
            ser2 = ser2 + array2[i];
            System.out.println(array2[i] + " ");
        }
        for (int i = 0; i > 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 5);
            ser3 = ser3 + array3[i];
            System.out.println(array3[i] + " ");
        }
        System.out.println();
        System.out.println(ser1 = ser1 / 5);
        System.out.println(ser2 = ser2 / 5);
        System.out.println(ser3 = ser3 / 5);

        if (ser1 > ser2 && ser1 > ser3) {
            System.out.println("Середнє арифметичне першого масиву є найбільшим");
        } else if (ser2 > ser1 && ser2 > ser3) {
            System.out.println("Середнє арифметичне другого масиву є найбільшим");
        } else if (ser3 > ser1 && ser3 > ser2) {
            System.out.println("Середнє арифметичне третього масиву є найбільшим");
        }
    }
}