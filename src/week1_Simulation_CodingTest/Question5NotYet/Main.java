package week1_Simulation_CodingTest.Question5NotYet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        List<Integer> deleteCandidate = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            deleteCandidate.add(Integer.parseInt(br.readLine()));
        }

        deleteCandidate = deleteCandidate.stream().distinct().collect(Collectors.toList());
        int deleteCandidateLength = deleteCandidate.size();
        int[] afterDeleteMaxLength = new int[deleteCandidateLength];

    }
}
