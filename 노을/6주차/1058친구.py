import sys


n = int(sys.stdin.readline())
input =  []

for i in range(n):
    input.append(list(sys.stdin.readline()))

graph = [[] for _ in range(n)]
for i in range(n):
    for j in range(n):
        if input[i][j] == 'Y':
            graph[i].append(j)

friend_count = [0] * (n)
for i in range(n):
    friend = set()
    for j in graph[i]:
        friend.add(j)
        for k in graph[j]:
            friend.add(k)
    if len(friend) == 0:
        friend_count[i] = 0
    else:
        friend_count[i] = len(friend)-1
        

print(max(friend_count))
