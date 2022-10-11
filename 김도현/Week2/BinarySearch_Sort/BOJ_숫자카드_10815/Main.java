package 김도현.Week2.BinarySearch_Sort.BOJ_숫자카드_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean binarySearch(int[] sangGenDeck, int target, int n) {
        int left = 0;
        int mid;
        int right = n - 1;

        while (left <= right) {
            mid = (left + right) / 2;
            int currentValue = sangGenDeck[mid];

            if (currentValue < target) {
                left = mid + 1;
            } else if (currentValue > target) {
                right = mid - 1;
            } else if (currentValue == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        StringTokenizer sangGeunSt = new StringTokenizer(br.readLine());
        int[] sangGenDeck = new int[n];

        int m = Integer.parseInt(br.readLine());
        StringTokenizer targetSt = new StringTokenizer(br.readLine());

        for (int i = 0; sangGeunSt.hasMoreTokens(); i++) {
            sangGenDeck[i] = Integer.parseInt(sangGeunSt.nextToken());
        }
        Arrays.sort(sangGenDeck);

        int [] answer = new int [m];

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(targetSt.nextToken());
            if (binarySearch(sangGenDeck, target, n)) {
                answer[i] = 1;
            }
        }

        for (int i = 0; i < m; i++) {
            if (i == m - 1) {
                System.out.print(answer[i]);
            } else {
                System.out.print(answer[i] + " ");
            }
        }
    }
}