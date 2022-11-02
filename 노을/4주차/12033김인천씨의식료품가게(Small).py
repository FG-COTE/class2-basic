def dfs(array, discount_index, original_index):
    if array[original_index] != 0:
        if array[original_index]*0.75 == array[discount_index]: 
            array[original_index] = 0
            array[discount_index] = 0
            return
        else:
            dfs(array, discount_index, original_index+1)
    else:
        dfs(array, discount_index, original_index+1)


t = int(input())
for test_case in range(t):
    n = int(input())
    array = list(map(int, input().split()))
    result = []
    for i in array:
        if i != 0:
           result.append(i)
           dfs(array, array.index(i), array.index(i)+1)
    print(f'Case #{test_case+1}: ', end='')
    print(' '.join(map(str, sorted(result))))
