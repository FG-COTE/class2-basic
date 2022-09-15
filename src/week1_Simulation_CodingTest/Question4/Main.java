package week1_Simulation_CodingTest.Question4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] interest = new int[n];
        int[] myViewInformation = new int[n];

        StringTokenizer stInterest = new StringTokenizer(br.readLine());
        StringTokenizer stMyView = new StringTokenizer(br.readLine());


        for (int i = 0; i < n; i++) {
            interest[i] = Integer.parseInt(stInterest.nextToken());
            myViewInformation[i] = Integer.parseInt(stMyView.nextToken());
        }

        System.out.println(Arrays.stream(interest).sum());

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (myViewInformation[i] == 0) {
                answer += interest[i];
            }
        }
        System.out.println(answer);
    }
}
