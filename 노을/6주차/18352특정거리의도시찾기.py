# 다익스트라
import heapq
import sys

input = sys.stdin.readline
city, road, k, start = map(int, input().split())
graph = [[] for i in range(city+1)]
for _ in range(road):
    a, b = map(int, input().split())
    graph[a].append(b)
    
distance = [1e9]*(city+1)    
    
def dijkstra(start):
    distance[start] = 0
    q = []
    heapq.heappush(q, (0, start))
    
    for i in graph[start]:
        distance[i] = 1
        heapq.heappush(q, (1, i))
    while q:
        q_distance, q_city = heapq.heappop(q)
        if q_distance>distance[q_city]:
            continue
        for i in graph[q_city]:
            update_cost = distance[q_city] + 1
            if update_cost<distance[i]:
                distance[i] = update_cost
                heapq.heappush(q, (distance[i], i))
dijkstra(start)

count = 0
for i in range(1, city+1):
    if distance[i] == k:
        print(i)
        count += 1
if count == 0:
    print(-1)
