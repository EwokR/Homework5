package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        int[] falloutNumeralGames = new int[4];
        falloutNumeralGames[0] = 1;
        falloutNumeralGames[1] = 2;
        falloutNumeralGames[2] = 3;
        falloutNumeralGames[3] = 4;
        // Задание №2
        {
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    System.out.print(numbers[i]);
                } else {
                    System.out.print(numbers[i] + ", ");
                }
            }
        }
        System.out.println();
        {
            for (int i = 0; i < fractionalNumbers.length; i++) {
                if (i == fractionalNumbers.length - 1) {
                    System.out.print(fractionalNumbers[i]);
                } else {
                    System.out.print(fractionalNumbers[i] + ", ");
                }
            }
        }

        System.out.println();
        {
            for (int i = 0; i < falloutNumeralGames.length; i++) {
                if (i == falloutNumeralGames.length - 1) {
                    System.out.print(falloutNumeralGames[i]);
                } else {
                    System.out.print(falloutNumeralGames[i] + ", ");
                }
            }
        }
        // Задание №3
        System.out.println();
        {
            for (int i = numbers.length -1; i >= 0; i--) {
                if (i == 0) {
                    System.out.print(numbers[i]);
                } else {
                    System.out.print(numbers[i] + ", ");
                }
            }
        }
        System.out.println();
        {
        for (int i = fractionalNumbers.length -1; i >=0; i--) {
            if (i == 0 ) {
                System.out.print(fractionalNumbers[i]);
            }else {
                System.out.print(fractionalNumbers[i] + ", ");
            }
            }
        }
        System.out.println();
        {
            for (int i = falloutNumeralGames.length -1; i >=0; i--){
                if (i == 0) {
                    System.out.print(falloutNumeralGames[i]);
                }else {
                    System.out.print(falloutNumeralGames[i] + ", ");
                }
            }
        }
        // Задание №4
        System.out.println();
        for (int i = 0; i<numbers.length; i ++){
            if ( numbers[i] % 2 != 0) {
                System.out.print(numbers[i] +1 + " ");
            }
        }
    }
}


