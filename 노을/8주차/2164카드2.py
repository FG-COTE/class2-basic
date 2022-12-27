from collections import deque
import sys


n = int(sys.stdin.readline())
num = deque()

for i in range(n, 0, -1):
    num.append(i)

while len(num) > 1:
    num.pop()
    append_num = num.pop()
    num.insert(0, append_num)
    
print(num[0])
