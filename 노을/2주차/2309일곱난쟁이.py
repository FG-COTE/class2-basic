array = []
for i in range(9):
    array.append(int(input()))
new_array = array[:]  

flag = False
for i in array:
    for j in array[array.index(i)+1:len(array)]:
        new_array = array[:]
        new_array.remove(i)
        new_array.remove(j)
        if sum(new_array) == 100:
            flag = True
            break
    if flag == True:
        break

        
new_array.sort()
for i in new_array:
    print(i)
