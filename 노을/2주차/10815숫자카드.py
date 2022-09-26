n = int(input())
sanggeun = list(map(int, input().split()))
sanggeun.sort()
m = int(input())
m_list = list(map(int, input().split()))


for m in m_list:
    end = len(sanggeun)-1
    start = 0
    while start<=end:
        mid = (end+start)//2
        if m == sanggeun[mid]:
            print('1', end=' ')
            break
        elif m< sanggeun[mid]:
            end = mid-1
        elif m > sanggeun[mid]:
            start = mid+1
    else:
        print('0', end=' ')
    

