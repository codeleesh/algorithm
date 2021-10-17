package decomposition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        int length = (int)(Math.log10(input)+1);

        int result = search(input, length);
        System.out.println(result);
    }

    static int search(int input, int length) {
        int result = 0;
        for( int i = 0; i<input; i++) {
            int sum = 0;
            int storeNum = i;
            while(storeNum > 0) {
                sum += storeNum % 10;
                storeNum /= 10;
            }
            if( input == sum + i ) {
                result = i;
                break;
            }
        }
        return result;
    }
}
