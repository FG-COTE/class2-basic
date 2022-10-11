package 김도현.Week3.DFS_BFS.BOJ_점프왕젤리_16173;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void dfs(int[][] map, boolean[][] visited, int x, int y) throws IOException {

        // 내 발밑에 있는 수가 -1 이면 종료
        if (map[x][y] == -1) {
            bw.write("HaruHaru");
            bw.flush();
            bw.flush();
            bw.close();
            br.close();
            System.exit(0);
        }

        // 밑으로, 오른쪽 옆으로
        int[] dx = {1, 0};
        int[] dy = {0, 1};

        for (int i = 0; i < 2; i++) {
            // 맵에 써져있는 좌표 만큼 이동하기
            int newX = x + dx[i] * map[x][y];
            int newY = y + dy[i] * map[x][y];

            // 지도 밖으로 범위를 초과하거나 이미 방문한 노드면 아무것도 하지 않고 넘어가기
            if (newX >= n || newX < 0 || newY >= n || newY < 0 || visited[newX][newY]) {
                continue;
            }
            // 방문한 노드가 아니면 방문처리 후 DFS 다시 돌리기
            visited[newX][newY] = true;
            dfs(map, visited, newX, newY);
        }
    }


    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        boolean visited[][] = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(map, visited, 0, 0);
        bw.write("Hing");
        bw.flush();
        bw.close();
        br.close();
    }
}
