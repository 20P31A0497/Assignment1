import java.io.*;
import java.util.*;

import java.util.Scanner;

class Unique {
    public static void printDistinct(int arr[], int r) {
        for (int p = 0; p < r; p++) {
            int q;
            for (q = 0; q < p; q++) {
                if (arr[p] == arr[q]) {
                    break;
                }
            }
            if (p == q) {
                System.out.print(arr[q] + " ");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int arr[] = new int[r];
        for (int p = 0; p < r; p++) {
            arr[p] = sc.nextInt();
        }
        printDistinct(arr, r);

    }
}