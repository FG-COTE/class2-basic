t = int(input())

for j in range(t):
    n = int(input())
    prices = list(map(int, input().split()))
    sales = []
    checked = [False] * (2*n)
    for price in prices:
        isChecked = False
        for i in range(len(sales)):
            if not checked[i] and price * 3 // 4 == sales[i]:
                checked[i] = True
                isChecked = True
                break
        if not isChecked:
            sales.append(price)
    
    print("Case #" + str(j + 1) + ":",*sales)
