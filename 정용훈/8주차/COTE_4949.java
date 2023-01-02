import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class COTE_4949 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // str 입력받아 "."일 때 종료
        while(!(str=br.readLine()).equals(".")) {
            // 스택 생성 및 초기화
            Stack<Character> stack = new Stack<>();
            // 입력받은 문자열 한 문자씩 순회
            for(char c : str.toCharArray()){
                // 문자가 '('일 때 stack에 push
                if (c=='('){
                    stack.push(c);
                }
                // 문자가 '['일 때 stack에 push
                else if(c=='['){
                    stack.push(c);
                }
                // 문자가 ')'일 때 stack의 top이 '('이라면 pop
                else if(c==')'){
                    // stack이 비어있는 지 확인
                    if(stack.isEmpty()){
                        System.out.println("Empty_)_no");
                        break;
                    }else {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else { //top이 '('이 아닐 때
                            System.out.println("top_(_no");
                            break;
                        }
                    }
                }
                // 문자가 ']'일 때 stack의 top이 ']'이라면 pop
                else if(c==']'){
                    if(stack.isEmpty()){
                        System.out.println("Empty_]_no");
                        break;
                    }else {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            System.out.println("top_[_no");
                            break;
                        }
                    }
                }
                // 문자열 마지막에 도달 시 stack이 비어있는 지 확인
                else if(c=='.'){
                    boolean result = stack.isEmpty();
                    if (result){
                        System.out.println("yes");
                    }else{
                        System.out.println("final_Empty_no");
                    }
                }
            }
        };

    }
}
