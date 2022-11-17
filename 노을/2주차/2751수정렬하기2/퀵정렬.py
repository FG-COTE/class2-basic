import sys

array = []
n = int(sys.stdin.readline())
for i in range(n):
    array.append(int(sys.stdin.readline()))

def quick_sort(array, start, end):
    if start>=end:
        return 
    
    pivot = start
    left = start+1
    right = end
    
    while left <= right:
        while left<=end and array[pivot]>=array[left]:
            left += 1
        while right>start and array[pivot]<=array[right]:
            right -= 1
        if left > right:
            array[right], array[pivot]  = array[pivot], array[right]
        else:
            array[right], array[left]  = array[left], array[right]
    quick_sort(array, start, right-1)
    quick_sort(array, right+1, end)
quick_sort(array, 0, n-1)


for i in array:
    print(i)  