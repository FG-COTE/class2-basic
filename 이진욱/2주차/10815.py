def binarySearch(arr, num):
    start = 0
    end = len(arr) - 1
    while start <= end:
        mid = (start + end) //2
        #찾고자 하는 값 보다 클 경우
        if num < arr[mid]:
            end = mid - 1
        #찾고자 하는 값 보다 작을 경우
        elif num > arr[mid]:
            start = mid + 1
        else:
            return 1
    return 0

n = input()
hold = list(map(int, input().split()))
hold.sort()
m = input()
find = list(map(int, input().split()))
answer = []

for i in find:
    answer.append(binarySearch(hold, i))

for i in answer:
    print(i, end=" ")
