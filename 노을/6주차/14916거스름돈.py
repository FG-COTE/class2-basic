money = int(input())
dp = [-1]*(100001)

dp[2] = 1
dp[4] = 2
dp[5] = 1

for i in range(6, money+1):
    if dp[i-5]==-1 and dp[i-2]==-1:
        dp[i] = -1
    elif dp[i-5]==-1:
        dp[i] = dp[i-2]+1
    elif dp[i-2]==-1:
        dp[i] = dp[i-5]+1
    else:
        dp[i] = min(dp[i-5]+1, dp[i-2]+1)
print(dp[money])