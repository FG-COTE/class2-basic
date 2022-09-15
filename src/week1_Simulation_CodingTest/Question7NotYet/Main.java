package week1_Simulation_CodingTest.Question7NotYet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] movingX = {0, 0, -1, 1};
    static int[] movingY = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        String initKingRow = king.substring(0, 1);
        String initKingCol = king.substring(1);

        String stone = st.nextToken();
        String initStoneRow = stone.substring(0, 1);
        String initStoneCol = stone.substring(1);

        int kingColIndex = colCalc(initKingCol);
        int kingRowIndex = rowCalc(initKingRow);

        int stoneColIndex = colCalc(initStoneCol);
        int stoneRowIndex = rowCalc(initStoneRow);

        int movingCount = Integer.parseInt(st.nextToken());

    }

    public static int colCalc(String Col) {
        int colIndex = 0;

        if (Col.equals("B")) {
            colIndex = 1;
        } else if (Col.equals("C")) {
            colIndex = 2;
        } else if (Col.equals("D")) {
            colIndex = 3;
        } else if (Col.equals("E")) {
            colIndex = 4;
        } else if (Col.equals("F")) {
            colIndex = 5;
        } else if (Col.equals("G")) {
            colIndex = 6;
        } else if (Col.equals("H")) {
            colIndex = 7;
        }

        return colIndex;
    }

    public static int rowCalc(String Row) {
        int rowIndex = 0;

        if (Row.equals("2")) {
            rowIndex = 1;
        }
        else if (Row.equals("3")) {
            rowIndex = 2;
        }
        else if (Row.equals("4")) {
            rowIndex = 3;
        }
        else if (Row.equals("5")) {
            rowIndex = 4;
        }
        else if (Row.equals("6")) {
            rowIndex = 5;
        }
        else if (Row.equals("7")) {
            rowIndex = 6;
        }
        else if (Row.equals("8")) {
            rowIndex = 7;
        }

        return rowIndex;
    }

}