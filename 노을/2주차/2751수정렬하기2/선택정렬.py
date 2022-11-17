import sys

array = []
n = int(sys.stdin.readline())
for i in range(n):
    array.append(int(sys.stdin.readline()))

for i in range(n-1):
    min_index = array.index(min(array[i:n]))
    array[i], array[min_index] =  array[min_index], array[i]

for i in array:
    print(i)  
        