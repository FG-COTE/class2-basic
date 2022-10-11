package 김도현.Week3.DFS_BFS.BOJ_점프왕젤리_16173;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void dfs(int[][] map, boolean[][] visited, int x, int y) throws IOException {
        if (map[x][y] == -1) {
            bw.write("HaruHaru");
            bw.flush();
            bw.close();
            br.close();
        }
        for (int i = 0; i < )
    }


    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean visited[][] = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(map, visited, 1);
    }
}
