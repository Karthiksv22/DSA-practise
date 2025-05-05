package DSA_Practise;

import java.util.Scanner;

public class digits_of_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nod = 0;        // nod stands for no of digits
        int temp = n;
        while(temp != 0){
           temp = temp/10;
           nod++;
        }

        int div = (int) Math.pow(10, nod -1);
        while(n !=0){
            int q = n/div;
            System.out.println(q);

            n = n%div;
            div = div/10;
        }
    }
}
