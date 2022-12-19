n, k = map(int, input().split())
lists = list(map(int, input().split()))
sums = [0]
s = 0
for li in lists:
    s += li
    sums.append(s)

answer = sums[k] - sums[0] # 0 ~ k번째까지의 합
for i in range(1, n - k + 1): # 1 ~ k + 1번째까지 합, 2 ~ k + 2, 3 ~ k + 3, ... 까지의 합을 구하고 그 중 가장 큰 값을 출력한다.
    if answer < sums[k + i] - sums[i]:
        answer = sums[k + i] - sums[i]

print(answer)
