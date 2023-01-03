from collections import deque

n = int(input())
que = deque()
for i in range(1,n+1):
    que.append(i)

while True:
    if len(que) == 1:
        print(que.popleft())
        break
    que.popleft()
    que.append(que.popleft())
