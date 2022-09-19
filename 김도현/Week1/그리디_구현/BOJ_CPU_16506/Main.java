package 김도현.Week1.그리디_구현.BOJ_CPU_16506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int rD = 3;
    static final int rA = 3;
    static final int rB = 4;

    public static String[] matchingOpCode(String opcode) {
        if (opcode.equals("ADD")) {
            return new String[] {"0", "0", "0", "0", "0"};
        }
        else if (opcode.equals("ADDC")) {
            return new String[] {"0", "0", "0", "0", "1"};
        }
        else if (opcode.equals("SUB")) {
            return new String[] {"0", "0", "0", "1", "0"};
        }
        else if (opcode.equals("SUBC")) {
            return new String[] {"0", "0", "0", "1", "1"};
        }
        else if (opcode.equals("MOV")) {
            return new String[] {"0", "0", "1", "0", "0"};
        }
        else if (opcode.equals("MOVC")) {
            return new String[] {"0", "0", "1", "0", "1"};
        }
        else if (opcode.equals("AND")) {
            return new String[] {"0", "0", "1", "1", "0"};
        }
        else if (opcode.equals("ANDC")) {
            return new String[] {"0", "0", "1", "1", "1"};
        }
        else if (opcode.equals("OR")) {
            return new String[] {"0", "1", "0", "0", "0"};
        }
        else if (opcode.equals("ORC")) {
            return new String[] {"0", "1", "0", "0", "1"};
        }
        else if (opcode.equals("NOT")) {
            return new String[] {"0", "1", "0", "1", "0"};
        }
        else if (opcode.equals("MULT")) {
            return new String[] {"0", "1", "1", "0", "0"};
        }
        else if (opcode.equals("MULTC")) {
            return new String[] {"0", "1", "1", "0", "1"};
        }
        else if (opcode.equals("LSFTL")) {
            return new String[] {"0", "1", "1", "1", "0"};
        }
        else if (opcode.equals("LSFTLC")) {
            return new String[] {"0", "1", "1", "1", "1"};
        }
        else if (opcode.equals("LSFTR")) {
            return new String[] {"1", "0", "0", "0", "0"};
        }
        else if (opcode.equals("LSFTRC")) {
            return new String[] {"1", "0", "0", "0", "1"};
        }
        else if (opcode.equals("ASFTR")) {
            return new String[] {"1", "0", "0", "1", "0"};
        }
        else if (opcode.equals("ASFTRC")) {
            return new String[] {"1", "0", "0", "1", "1"};
        }
        else if (opcode.equals("RL")) {
            return new String[] {"1", "0", "1", "0", "0"};
        }
        else if (opcode.equals("RLC")) {
            return new String[] {"1", "0", "1", "0", "1"};
        }
        else if (opcode.equals("RR")) {
            return new String[] {"1", "0", "1", "1", "0"};
        }
        else if (opcode.equals("RRC")) {
            return new String[] {"1", "0", "1", "1", "1"};
        }
        return null;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder machineCode = new StringBuilder();

        // 테스트 케이스 n
        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");

            String [] opcodeByCommand = matchingOpCode(command[0]);
            String rDByCommand = command[1];
            String rAByCommand = command[2];
            String rBByCommand = command[3];


            // op 코드 매핑 -> 정답 문자열에 삽입
            for (int j = 0; j < 5; j++) {
                machineCode.append(opcodeByCommand[j]);
            }

            // 사용하지 않는 레지스터 정답 문자열에 삽입
            machineCode.append("0");

            //System.out.println(Integer.parseInt(rDByCommand));
            //System.out.println(Integer.parseInt(rAByCommand));
            //System.out.println(Integer.parseInt(rBByCommand));

            // 각 레지스터 Binary 화
            String binaryRD = Integer.toBinaryString(Integer.parseInt(rDByCommand));
            String binaryRA = Integer.toBinaryString(Integer.parseInt(rAByCommand));
            String binaryRB = Integer.toBinaryString(Integer.parseInt(rBByCommand));

            //System.out.println("binaryRD = " + binaryRD);
            //System.out.println("binaryRA = " + binaryRA);
            //System.out.println("binaryRB = " + binaryRB);

            // Binary 변환 레지스터 크기보다 작으면, 자릿수 채워주기
            if (binaryRD.length() < rD) {
                binaryRD = "0".repeat(rD - binaryRD.length()) + binaryRD;
            }

            // Binary 변환 레지스터 크기보다 작으면, 자릿수 채워주기
            if (binaryRA.length() < rA) {
                binaryRA = "0".repeat(rA - binaryRA.length()) + binaryRA;
            }

            // Binary 변환 레지스터 크기보다 작으면, 자릿수 채워주기
            // RB 는 변환 후 추가 작업이 필요하다.
            // 1. 만약 변환한 rB 길이가 rB 레지스터보다 작고, OPCODE 마지막 문자가 C 로 끝나는 게 아니면
            // 1. 맨 마지막 비트는 0으로 고정된다.

            int rBLength = binaryRB.length();
            int opcodeLength = command[0].length() - 1;

            // 궁금증. 조건문마다 다르게 해줘야 되던데 왜그럴까.
            //  binaryRB = "0".repeat(rB - rBLength) + binaryRB;
            //  binaryRB = "0".repeat(rB - rBLength - 1) + binaryRB;
            if (rBLength < rB && command[0].charAt(opcodeLength) == 'C') {
                System.out.println("rB - rBLength = " + (rB - rBLength));
                binaryRB = "0".repeat(rB - rBLength) + binaryRB;
            }
            else if (rBLength < rB && command[0].charAt(opcodeLength) != 'C') {
                System.out.println("rB - rBLength - 1 = " + (rB - rBLength - 1));
                binaryRB = "0".repeat(rB - rBLength - 1) + binaryRB + "0";
            }

            machineCode.append(binaryRD);
            machineCode.append(binaryRA);
            machineCode.append(binaryRB);

            System.out.println(machineCode);

            machineCode = new StringBuilder();
        }
    }
}

// ~~C 로 끝나는 연산이 아니면 끝자리는 무조건 0

/* 정답


0010100010000101    00101001000101
0010100100001010    001010100001010
0000000110010100    000000110010100
0001001000010100    000101000010100
 */

/* 출력



 */