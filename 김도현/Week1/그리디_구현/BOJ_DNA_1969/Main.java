package 김도현.Week1.그리디_구현.BOJ_DNA_1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 엣지 케이스

6 10
ATGTTACCAT
AAGTTACGAT
AACAAAGCAT
AAGTTACCTG
AAGTTACCAG
TACTTACCAG

*/

public class Main {

    static int hammingDistance = 0;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<String> dnaList = new ArrayList<>(n);

        // 문자열 입력
        for (int i = 0; i < n; i++) {
            dnaList.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            Map<Character, Integer> countMap = new HashMap<>(4) {{
                put('A', 0);
                put('C', 0);
                put('G', 0);
                put('T', 0);
            }};

            // 특정 오를 돌며 열에 등장하는 문자 갯수를 카운팅
            for (int j = 0; j < n; j++) {
                if (dnaList.get(j).charAt(i) == 'A') {
                    countMap.put('A', countMap.get('A') + 1);
                } else if (dnaList.get(j).charAt(i) == 'T') {
                    countMap.put('T', countMap.get('T') + 1);
                } else if (dnaList.get(j).charAt(i) == 'G') {
                    countMap.put('G', countMap.get('G') + 1);
                } else if (dnaList.get(j).charAt(i) == 'C') {
                    countMap.put('C', countMap.get('C') + 1);
                }
            }
            // HashMap 최대값 Value 를 가진 Key=Value 꼴을 추출하기
            // Key 를 바탕으로 문자열 정렬
            Map.Entry<Character, Integer> maxEntry = countMap.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .max(Map.Entry.comparingByValue())
                    .orElse(null);

            // 제일 많이 등장한 Value 에 대한 Key 값 반환 변수에 담기
            answer.append(maxEntry.getKey());

            // HashMap Iterator
            for (Map.Entry<Character, Integer> characterIntegerEntry : countMap.entrySet()) {
                if (characterIntegerEntry.getKey() != maxEntry.getKey()) {
                    hammingDistance += characterIntegerEntry.getValue();
                }
            }

        }
        System.out.println(answer);
        System.out.println(hammingDistance);
    }
}
