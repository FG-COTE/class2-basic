import sys

array = []
n = int(sys.stdin.readline())
for i in range(n):
    array.append(int(sys.stdin.readline()))
    

for i in range(1, len(array)):
    while i>0:
        if array[i] < array[i-1]:
            array[i-1], array[i] = array[i], array[i-1]
            i = i-1
        else:
            break
        

for i in array:
    print(i)  
        