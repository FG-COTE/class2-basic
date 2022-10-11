package 김도현.Week2.BinarySearch_Sort.BOJ_일곱난쟁이_2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] array = new int[9];
        int arraySum = 0;

        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
            arraySum += array[i];
        }
        Arrays.sort(array);

        int overHeight = arraySum - 100;

        int target1 = 0;
        int target2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (array[i] + array[j] == overHeight) {
                    target1 = array[i];
                    target2 = array[j];
                    break;
                }
            }
        }


        final int forStreamTarget1 = target1;
        final int forStreamTarget2 = target2;

        Arrays.stream(array)
                .filter(t -> t != forStreamTarget1)
                .filter(t -> t != forStreamTarget2)
                .forEach(System.out::println);
    }
}
