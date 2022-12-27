import sys

test_case = int(sys.stdin.readline())

for i in range(test_case):
    country_count, plane = map(int, sys.stdin.readline().split())
    
    graph = [[] for i in range(country_count+1)]
    for i in range(plane):
        a, b = map(int, sys.stdin.readline().split())
        graph[a].append(b)
        graph[b].append(a)
        
    visited = [False for i in range(country_count+1)]
    
    count = 0 
    for i in range(1, country_count+1):
        if visited[i] == False:
            visited[i] = True
            count+=1
            for j in graph[i]:
                if visited[j] == False:
                    visited[j] = True
                    count+=1
    print(count-1)
    
# 모든 국가는 연결 되어 있으므로, 최소 간선의 개수는 n-1개가 된다.
# print(n-1) 