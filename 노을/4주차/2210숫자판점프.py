def dfs(x, y, num):
    if len(num) == 6:
        if num not in result:
            result.append(num)
        return
    
    if x+1<=4:
        dfs(x+1, y, num + num_board[x+1][y])
    if x-1>=0:
        dfs(x-1, y, num + num_board[x-1][y])
    if y+1<=4:
        dfs(x, y+1, num + num_board[x][y+1])
    if y-1>=0:
        dfs(x, y-1, num + num_board[x][y-1])
    return


num_board = []
for _ in range(5):
    num_board.append(list(map(str, input().split())))

result = []
for i in range(5):
    for j in range(5):
        dfs(i,j, num_board[i][j])
print(len(result))






