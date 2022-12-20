n = int(input())
d = [list(map(str, input())) for i in range(n)]
max = 0


for k in range(n):
    for i in range(n):
        count = 0
        for j in range(n):
            if (d[i][k] == 'Y' and d[k][j] == 'Y'):
                count += 1
        if count > max : max = count

                
print(max)