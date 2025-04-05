package DSA_Practise;

import java.util.Scanner;

public class Taking_input {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);                            // This is how u take input
        // nextInt is taken for Integer value
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("Dear " + name + " Here is the counting ");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }


        System.out.println(" hello " + name);


    }
}
