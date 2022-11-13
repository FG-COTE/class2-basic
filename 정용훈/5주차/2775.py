T = int(input())


for _ in range(T):
  k = int(input())
  n = int(input())
  
  dp = [[0 for _ in range(n+1)] for _ in range(k+1)]  # 전부 0으로 초기화
  for i in range(n+1):                                # 0층 i 호 i 값으로 할당
    dp[0][i] = i


  for i in range(1,k+1):                              # k층 n호 = (k-1)층 n호 + k층 (n-1)호
    for j in range(1,n+1):
      dp[i][j] = dp[i-1][j] + dp[i][j-1]
    
  print(dp[k][n])
  