t = int(input())

# 14층 14호까지 만들기
dp = []
for _ in range(14+1):
    dp.append([0]*(14+1))
    
# 0층 값 세팅
for i in range(1, 14+1):
    dp[0][i] = i
    
for _ in range(t):
    k = int(input())
    n = int(input())
    
    for j in range(1, k+1):
        for h in range(1, n+1):
            dp[j][h] = sum(dp[j-1][:h+1])
    print(dp[k][n])