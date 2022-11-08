N, M = map(int, input().split())
count = 0
pattern = [list(map(str, input())) for _ in range(N)]

## Line 19, 26을 위해 뒤쪽에 공백 추가
for i in range(N):
    pattern[i].append(" ")
pattern.append([" "]*M)

## 방문 확인용 매트릭스
ischecked = [[False]*(M) for _ in range(N)]

def tile(x, y):
    global count
    if ischecked[x][y] == True:       ## 이미 방문한 곳이면 리턴
        return
    if pattern[x][y] == "-":          ## "-"일 때 방문 체크 후,
        ischecked[x][y] = True       
        if pattern[x][y+1] == "-":    ## 그 좌표 오른 쪽이 같은 무늬라면
            tile(x,y+1)               ## 재귀
        else:                         ## 아니라면 count + 1 하고 리턴
            count = count + 1
            return 
    if pattern[x][y] == "|":
        ischecked[x][y] = True
        if pattern[x+1][y] == "|":
            tile(x+1,y)
        else:
            count = count + 1
            return 
        
for i in range(N):
    for j in range(M):
        tile(i,j)
        
print(count)
