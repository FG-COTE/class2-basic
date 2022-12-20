
N = int(input())

prime=list()

for i in range(2,120):
    is_Prime = True
    for j in range(2,i):
        if i%j==0: is_Prime = False

    if is_Prime : prime.append(i)
    
special_list = list()
for i in range(len(prime)-1):
    special_list.append(prime[i]*prime[i+1])
    
for i in range(len(special_list)):
    if special_list[i] > N:
        print(special_list[i])
        break
  