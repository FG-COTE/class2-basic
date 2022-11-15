
n = int(input())
dp = ['']*(n+1)
dp[1] = 'SK'
if n!=1:
    dp[2] = 'CY'

if n>2:
    for i in range(3, n+1):
        if dp[i-3]=="SK" or dp[i-1]=="SK":
            dp[i] = "CK"
        else:
            dp[i] = "SK"
            
print(dp[n])