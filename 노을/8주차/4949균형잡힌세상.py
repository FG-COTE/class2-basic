def balance(string):
    stack = []
    for i in range(len(string)):
        if string[i] == '[' or string[i] == '(':
            stack.append(string[i])
        if string[i] == ']':
            if len(stack) == 0:
                print("no")
                return
            elif stack[-1] == '[':
                stack.pop()
            else:
                print("no")
                return
        if string[i] == ')':
            if len(stack) == 0:
                print("no")
                return
            elif stack[-1] == '(':
                stack.pop()
            else:
                print("no")
                return
                
    if len(stack) == 0:
        print("yes")
    else:
        print("no")
                
while True:
    string = input()
    if string == '.':
        break
    balance(string)
    

            

    