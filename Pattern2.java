import java.util.*;
public class Pattern2 {
    public static void printPattern(int n)
    {
        int i, j;
        // outer loop to handle rows
        for (i = 0; i < n; i++) {
            //  inner loop to handle columns
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1
                    || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}

