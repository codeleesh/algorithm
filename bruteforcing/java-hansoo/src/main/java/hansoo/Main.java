package hansoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int input = Integer.parseInt(new Scanner(System.in).nextLine());

        int result = 0;
        for ( int i = 1; i <= input; i++ ) {
            if( i < 100 ) {
                result++;
            }
            if( i >= 110) {
                int onePlace = i % 100 % 10;
                int tenPlace = i % 100 / 10;
                int hunPlace = i / 100;
                if( onePlace - tenPlace == tenPlace - hunPlace ) {
                    result++;
                }
            }
            if( i == 1000 ) {
                break;
            }
        }
        System.out.println(result);
    }
}
