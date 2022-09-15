package week1_Simulation_CodingTest.Question3NotYet;

// 1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
// 2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
// 3. 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.


/* 입력 -------

a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end

*/

/* 출력 -------

<a> is acceptable.
<tv> is not acceptable.
<ptoui> is not acceptable.
<bontres> is not acceptable.
<zoggax> is not acceptable.
<wiinq> is not acceptable.
<eep> is acceptable.
<houctuh> is acceptable.

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean filtering(StringBuilder inputValue) {

        // 첫번째 조건 - 모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
        String[] firstRule = {"a", "e", "i", "o", "u"};


        for (int i = 0; i < 5; i ++) {
            if (inputValue.toString().contains(firstRule[i])) {
                break;
            }
            else if (!inputValue.toString().contains(firstRule[i]) && i == 4) {
                return false;
            }
        }

        // <ptoui> is not acceptable.
        // <bontres> is not acceptable.


        // 두번째 조건 - 모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
        int inputLength = inputValue.length();
        char[] secondRule = {'a', 'e', 'i', 'o', 'u'};
        char[] secondRule2 = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        int count = 0;

        for (int i = 0; i < inputLength; i++) {
            if (count == 2) {
                return false;
            }

            for (int j = 0; j < 5; j++) {
                if (inputValue.charAt(i) == secondRule[j]) {
                    count += 1;
                    break;
                } else if (inputValue.charAt(i) != secondRule[j]) {
                    count = 0;
                    break;
                }
            }
        }

        count = 0;

        for (int x = 0; x < inputLength; x++) {
            if (count == 2) {
                return false;
            }
            for (int y = 0; y < 21; y++) {
                if (inputValue.charAt(x) == secondRule2[y]) {
                    count += 1;
                    break;
                }
                else if (inputValue.charAt(x) != secondRule2[y]) {
                    count = 0;
                    break;
                }
            }
        }

        // 세번째 조건 - 같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
        for (int i = 0; i < inputLength - 2; i++) {
            if (inputValue.charAt(i) == inputValue.charAt(i + 1)
                    && (inputValue.charAt(i) != 'e' && inputValue.charAt(i + 1) != 'e')
                    && (inputValue.charAt(i) != 'o' && inputValue.charAt(i + 1) != 'o')) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder inputTestCase;

        while (true) {
            inputTestCase = new StringBuilder(br.readLine());

            if (inputTestCase.toString().equals("end")) {
                break;
            }

            if (filtering(inputTestCase)) {
                System.out.println("<" + inputTestCase + "> " + "is acceptable");
            }

            else if (filtering(inputTestCase) == false) {
                System.out.println("<" + inputTestCase + "> " + "is not acceptable");
            }
        }
    }
}
