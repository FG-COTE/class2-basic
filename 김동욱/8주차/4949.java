import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String string = br.readLine();
            if (string.charAt(0) == ".".charAt(0)){
                break;
            }
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < string.length() - 1; i++){
                //( 와 [ 같이 괄호를 여는 경우는 일단 스택에 넣고
                if (string.charAt(i) == "(".charAt(0) || string.charAt(i) == "[".charAt(0)){
                    stack.push(Character.toString(string.charAt(i)));
                }
                //만약에 ) 면 스택의 맨 윗값이 (가 아니거나 스택이 비어있으면 문제의 조건에 따라
                //문자열의 균형이 이뤄지지 않은 상태이므로..
                else if (string.charAt(i) == ")".charAt(0)){
                    if (!stack.isEmpty() && stack.peek().equals("(")){ 
                        stack.pop();
                    }
                    else{
                        System.out.println("no");
                        break;
                    }
                }
                //만약에 ] 면 스택의 맨 윗값이 [가 아니거나 스택이 비어있으면 문제의 조건에 따라
                //문자열의 균형이 이뤄지지 않은 상태이므로..
                else if (string.charAt(i) == "]".charAt(0)){
                    if (!stack.isEmpty() && stack.peek().equals("[")){
                        stack.pop();
                    }
                    else{
                        System.out.println("no");
                        break;
                    }
                }
                //for문이 끝날때 스택이 비어있어야 모든 괄호가 정상적으로 닫힌것이므로
                if (stack.isEmpty() && i == string.length() - 2){
                    System.out.println("yes");
                }
                //for문이 끝날때 스택이 안 비어있으면 문자열이 균형을 이루고 있지 않은것이므로
                else if (!stack.isEmpty() && i == string.length() - 2){
                    System.out.println("no");
                }
            }
        }
    }
}
