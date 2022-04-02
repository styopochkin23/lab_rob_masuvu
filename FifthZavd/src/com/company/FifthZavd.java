package com.company;

public class FifthZavd {

    public static void main(String[] args) {
	int array[] = new int[15];
    int number = 0;
    for (int i = 0; i < 15; i++) {
        array[i] = (int) Math.round(Math.random() * 10);
        System.out.println(array[i] + " ");
        if (array[i] % 2 == 0){
            number++;
        }
    }
        System.out.println(" ");
        System.out.println("К-сть парних елементів в масиві = : " + number);

    }
}
