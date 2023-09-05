package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
        public static void main(String[] args) throws IOException {
            Scanner scanSize = new Scanner(System.in);
            int[][] array = new int[3][3];
            System.out.println("Заполните массив через энтер");
            for (int i=0; i<array.length; i++)
            {
                for (int j=0; j<array[0].length; j++) {
                    Scanner Date = new Scanner(System.in);
                    int arrayDate = Date.nextInt();
                    array[i][j] = arrayDate;
                }
            }
                for (int i=0; i<array[0].length; i++) {
                 System.out.print(array[i][0]*3 +" ");
                }
        }
    }
