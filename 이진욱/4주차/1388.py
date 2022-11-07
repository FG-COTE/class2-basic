from collections import deque

n, m = map(int, input().split())
arr = [list(map(str, input())) for _ in range(n)]
visited = [[False] * m for _ in range(n)]
queue = deque()

cnt = 0

for i in range(n):
    for j in range(m):
        if not visited[i][j]:
            queue.append(arr[i][j])
            a = i
            b = j
            while queue:
                visited[a][b] = True
                s = queue.popleft()
                if s == '-' and b + 1 < m:
                    if s == arr[a][b + 1]:
                        b += 1
                        queue.append(arr[a][b])
                elif s == '|' and a + 1 < n:
                    if s == arr[a + 1][b]:
                        a += 1
                        queue.append(arr[a][b])
            cnt += 1

print(cnt)
