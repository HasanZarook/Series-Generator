package lab1;

import java.util.Scanner;
public class SeriesGenerator_lab1_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the starting value : ");
        int start = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the ending value : ");
        int end= b.nextInt();

        if(end > start) {
            for (int i = start; i <= (end); i++)
                System.out.println(i);
        }
        else if (start > end) {
            for (int j = start; j >= (end); j--)
                System.out.println(j);

        }
    }
}
