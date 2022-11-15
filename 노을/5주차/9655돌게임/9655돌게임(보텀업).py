
n = int(input())
dp = ['']*(n+1)
dp[1] = 'SK'
if n!=1:
    dp[2] = 'CY'

if n>2:
    for i in range(3, n+1):
        dp[i] = dp[i-2]
            
print(dp[n])