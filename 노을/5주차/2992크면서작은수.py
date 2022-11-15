input = list(input())
output = []

def dfs(array, n):
    result = []
    if n==0:
        return [[]]
    for i in range(len(array)):
        new = array[:i]+array[i+1:]
        rest_list = dfs(new, n-1)
        for rest in rest_list:
            result.append([array[i]]+rest)
    return result

new_array = dfs(input, len(input))
for i in new_array:
    if int("".join(i))>int("".join(input)):
        output.append(int("".join(i)))
if len(output)==0:
    print(0)
else:
    print(min(output))


