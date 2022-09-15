package week1_Simulation_CodingTest.Question6NotYet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfPerson = Integer.parseInt(br.readLine());

        Map<String, Integer> statusMap = new HashMap<>();

        for (int i = 0; i < numOfPerson; i++) {
            String[] inputValue = br.readLine().split(" ");

            if (inputValue[1].equals("enter")) {
                statusMap.put(inputValue[0], 1);
            } else if (inputValue[1].equals("leave")) {
                statusMap.put(inputValue[0], 0);
            }
        }

        // HashMap Key 를 기준으로 내림차순 정렬하기

        for (Map.Entry<String, Integer> stringIntegerEntry : statusMap.entrySet()) {
            if (stringIntegerEntry.getValue() == 1) {
                System.out.println(stringIntegerEntry.getKey());
            }
        }
    }
}
