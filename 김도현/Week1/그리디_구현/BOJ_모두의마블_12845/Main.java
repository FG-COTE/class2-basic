package 김도현.Week1.그리디_구현.BOJ_모두의마블_12845;

/*

c1 c2 c3
40 30 30

c1 x1
40 30(60)

x1 130

결국에는 첫번째(쩨일큰수랑) 계속 더해가면 되는것
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> levelOfCard = new ArrayList<>(n);

        while (st.hasMoreTokens()) {
            levelOfCard.add(Integer.valueOf(st.nextToken()));
        }

        // 리스트 내림차순으로 정렬
        Collections.sort(levelOfCard, Collections.reverseOrder());

        int accumulatedSum = 0;

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                accumulatedSum += levelOfCard.get(i);
            }
            else if (i > 1) {
                accumulatedSum += levelOfCard.get(0) + levelOfCard.get(i);
            }
        }

        System.out.println(accumulatedSum);

        br.close();

    }
}
