import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++){
            queue.add(i);
        }

        //문제의 흐름이 맨 앞을 버리고, 그 다음 숫자를 맨뒤로 보내고를 반복하는 흐름이므로..
        while (queue.size() > 1){
            queue.poll();
            int a = queue.poll();
            queue.add(a);
        }
        System.out.println(queue.peek());
    }
}
