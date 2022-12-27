n, k = map(int, input().split())
num = [i for i in range(1, n+1)]

result = []
index = -1

while sum(num) > 0:
    count = 0
    while count < k:
        index += 1
        if index >= n:
            index = index % n
        if num[index] != 0:
            count += 1
    result.append(num[index])
    num[index] = 0
    
print("<", end="")
for i in range(len(result)):
    print(result[i], end="")
    if i != len(result)-1:
        print(", ", end="")
    
print(">", end="")