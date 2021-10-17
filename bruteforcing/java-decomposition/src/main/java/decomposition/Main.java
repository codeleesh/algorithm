package decomposition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strInput = br.readLine();
        int inputLen = strInput.length();
        int input = Integer.parseInt(strInput);

        int result = advanceSearch(input, inputLen);
        System.out.println(result);
    }

    /**
     * 0부터 생성자 찾을때까지 조회
     * @param input int
     * @return result
     */
    static int search(int input) {
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

    /**
     * 맥스값을 이용하여 생성자 조회
     * @param input int
     * @param size int
     * @return result
     */
    static int advanceSearch(int input, int size) {
        int result = 0;
        for ( int i = (input - (size * 9)); i < input; i++ ) {
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
