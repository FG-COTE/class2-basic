# -*- coding: utf-8 -*-
# 15 = 5 X 3                  20 = 5 X 4
# 16 = 5 X 2 + 2 X 3          21 = 5 X 3 + 2 X 3
# 17 = 5 X 3 + 2 X 1          22 = 5 X 4 + 2 X 1
# 18 = 5 X 2 + 2 X 4          23 = 5 X 3 + 2 X 4
# 19 = 5 X 3 + 2 X 2          24 = 5 X 4 + 2 X 2

# 5n = 5 X n                 => n개
# 5n+1 = 5 X (n-1) + 2 X 3   => (n-1)+3개
# 5n+2 = 5 X n + 2 X 1       => n+1개
# 5n+3 = 5 X (n-1) + 2 X 4   => (n-1)+4개
# 5n+4 = 5 X n + 2 X 2       => n+2개

dp[10000] = -1

dp[2] = 1
dp[4] = 2
dp[5] = 1

money = int(input())

for i in range(6, money+1):
    asd

if money == 1:
    print(-1)
elif money == 3:       #if money == 1 or 3 : print(-1) 오류 이유 모르겠음.
    print(-1)
elif money % 5 == 0:
    print(money//5)
elif money % 5 == 1:
    print(money//5 + 2)
elif money % 5 == 2:
    print(money//5 + 1)
elif money % 5 == 3:
    print(money//5 + 3)
else :
    print(money//5 + 2)