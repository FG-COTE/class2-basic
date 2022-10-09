n = int(input())
num_list= []
for i in range(n):
    num_list.append(list(map(int, input().split())))
result = []



def dfs(num_list, x, y):
    value = num_list[x][y]
    if value==-1:
        result.append(True)
        return 
    else:
        if x+value>=n and y+value>=n:
            result.append(False)
            return
        else:
            if x+value<n:
                dfs(num_list, x+value, y)
                return
            if y+value<n:
                dfs(num_list, x, y+value)
                return
        


            

dfs(num_list, 0, 0)
if True in result:
    print("HaruHaru")
else:
    print("Hing")