package week1_Simulation_CodingTest.Question2;

// AAGTCG
// An-1 : C
// An : G


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ---------------- //
public class Main {

    static String[][] decodingTableForDNA = {
            {"A", "C", "A", "G"},
            {"C", "G", "T", "A"},
            {"A", "T", "C", "G"},
            {"G", "A", "G", "T"}};

    public static void main(String[] args) throws IOException {
        // An-1 1행 -> A || An 1열 -> A
        // An-1 2행 -> G || An 1열 -> G
        // An-1 3행 -> C || An 1열 -> C
        // An-1 4행 -> T || An 1열 -> T

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder lengthDNA = new StringBuilder(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());

        while (sb.length() != 1) {
            int row = 0;
            int col = 0;
            String substringString = sb.substring(sb.length() - 2, sb.length());

            if (substringString.charAt(0) == 'A') {
                row = 0;
            }
            else if (substringString.charAt(0) == 'G') {
                row = 1;
            }
            else if (substringString.charAt(0) == 'C') {
                row = 2;
            }
            else if (substringString.charAt(0) == 'T') {
                row = 3;
            }

            if (substringString.charAt(1) == 'A') {
                col = 0;
            }
            else if (substringString.charAt(1) == 'G') {
                col = 1;
            }
            else if (substringString.charAt(1) == 'C') {
                col = 2;
            }
            else if (substringString.charAt(1) == 'T') {
                col = 3;
            }

            sb.delete(sb.length() - 2, sb.length());
            sb.append(decodingTableForDNA[row][col]);
        }
        System.out.println(sb);
    }
}
