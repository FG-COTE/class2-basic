def check(stk, close):
    open = '(' if close == ')' else '['
    if not len(stk) or (stk.pop() != open):
        return True
    return False
    

def isBalance(string):
    stk = []
    for s in string:
        if s == '(' or s == '[':
            stk.append(s)
        if s == ')' or s ==']':
            if check(stk, s):
                return "no"
    if len(stk):
        return "no"
    return "yes"

while True:
    string = input()
    if string == '.':
        break
    print(isBalance(string))
