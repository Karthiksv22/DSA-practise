package DSA_Practise;

import java.util.Scanner;

public class Prime_till_N {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int high = scn.nextInt();
        int low = scn.nextInt();

        for (int n = low; n <= high; n++){
            int count = 0;

            for(int div = 2; div*div <=n; div++){
                if (n%div == 0){
                    count++;
                    break;
                }
            }

            if (count == 0){
                System.out.println(n);
            }
        }
    }
}
