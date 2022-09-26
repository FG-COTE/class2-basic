import sys

array = []
n = int(sys.stdin.readline())
for i in range(n):
    array.append(int(sys.stdin.readline()))
    
    
# 퀵정렬
# def quick_sort(array, start, end):
#     if start>=end:
#         return 
    
#     pivot = start
#     left = start+1
#     right = end
    
#     while left <= right:
#         while left<=end and array[pivot]>=array[left]:
#             left += 1
#         while right>start and array[pivot]<=array[right]:
#             right -= 1
#         if left > right:
#             array[right], array[pivot]  = array[pivot], array[right]
#         else:
#             array[right], array[left]  = array[left], array[right]
#     quick_sort(array, start, right-1)
#     quick_sort(array, right+1, end)
# quick_sort(array, 0, n-1)
    
# 삽입정렬
# for i in range(1, len(array)):
#     while i>0:
#         if array[i] < array[i-1]:
#             array[i-1], array[i] = array[i], array[i-1]
#             i = i-1
#         else:
#             break
        
# 선택정렬
# for i in range(n-1):
#     min_index = array.index(min(array[i:n]))
#     array[i], array[min_index] =  array[min_index], array[i]


# sort 이용
# array.sort()

for i in array:
    print(i)  
        