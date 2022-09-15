package week1_Simulation_CodingTest.Question1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 킹 : 1
// 퀸 : 1
// 룩 : 2
// 비숍 : 2
// 나이트 : 2
// 폰 : 8
public class Main {

    static int[] masterPiece = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < 6; i++) {
            masterPiece[i] = masterPiece[i] - Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i ++) {
            if (i == 5) {
                System.out.print(masterPiece[i]);
                break;
            }
            System.out.print(masterPiece[i] + " ");
        }
    }
}
