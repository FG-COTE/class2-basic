package 김도현.Week1.그리디_구현.BOJ_모두의마블_12845;

/*

c1 c2 c3
40 30 30

c1 x1
40 30(60)

x1 130

 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> levelOfCard = new ArrayList<>(n);

        while (st.hasMoreTokens()) {
            levelOfCard.add(Integer.valueOf(st.nextToken()));
        }

        Collections.sort(levelOfCard, Collections.reverseOrder());
        int accumulatedSum = 0;

        for (int i = 0; i < n; i++) {
            accumulatedSum += levelOfCard.get(i) + levelOfCard.get(i + 1);
        }

        System.out.println(accumulatedSum);

        br.close();
        bw.close();

    }
}
