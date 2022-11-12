t = int(input())

for _ in range(t):
    floor = int(input())
    room = int(input())
    people = [i for i in range(1, room + 1)]
    
    for _ in range(floor):
        for i in range(1, room):
            people[i] += people[i - 1]
    
    print(people[-1])
