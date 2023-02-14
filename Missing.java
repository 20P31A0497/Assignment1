import java.util.*;
import java.util.Scanner;

class Missing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int h = a[0] - 0;
        for (int i = 0; i < n; i++) {
            if (h < (a[i] - i)) {
                while ((a[i] - i) != h) {
                    System.out.print((h + i) + " ");
                    h++;
                }
            }
        }

    }
}