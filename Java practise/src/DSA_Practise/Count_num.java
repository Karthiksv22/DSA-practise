package DSA_Practise;

import java.util.Scanner;

//Question Statement:
//        1. You've to count the number of digits in a number.
//        2. Take as input "n", the number for which the digits has to be counted.
//3. Print the digits in that number.
public class Count_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dig = 0;
        while (n != 0) {
            n = n / 10;
            dig++;
        }
        System.out.println(dig);
    }
}
