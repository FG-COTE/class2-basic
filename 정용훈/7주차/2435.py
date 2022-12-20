N, K = map(int, input().split())

temp_list = list(map(int,input().split()))

sum_list = list()

for i in range(N-K+1):
    sum = 0
    for j in range(i,i+K):
        sum = sum + temp_list[j]
    sum_list.append(sum)

print(max(sum_list))