package 김도현.Week2.BinarySearch_Sort.BOJ_수정렬하기2_2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        // int[] array = new int[n]; 시간초과
        List<Integer> arrayList = new ArrayList<>(n);


        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }

        // Arrays.sort(array); 시간초과

        Collections.sort(arrayList);

        for (Integer integer : arrayList) {
            // System.out.println(integer); 시간초과
            bw.write(integer.toString() + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
