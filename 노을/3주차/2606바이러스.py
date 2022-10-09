from collections import deque

n = int(input())
computer = list()
for _ in range(n+1):
    list = []
    computer.append(list)

visited = [False] * (n+1)
connect = int(input())

for _ in range(connect):
    a, b = map(int, input().split())
    computer[a].append(b)
    computer[b].append(a)


def bfs(computer, start, visited):
    queue = deque()
    if visited[start] == False:
        visited[start] = True
        queue.append(start)
    while queue:
        num = queue.popleft()
        for i in computer[num]:
            if visited[i]==False:
                visited[i] = True
                queue.append(i)
                
bfs(computer, 1, visited)
print(visited.count(True)-1)