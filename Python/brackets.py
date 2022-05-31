def Balanced_Brackets(expression):
    abre = tuple('({[')
    cierra = tuple(')}]')
    juntos = dict(zip(cierra, abre))
    stack = []

    for letter in expression:
        if letter in abre:
            stack.append(letter)
        elif letter in cierra:
            if not stack or juntos[letter] != stack[-1]:
                return False
            elif juntos[letter] == stack[-1]:
                stack.pop()

    return not stack

def main():
    n = int(input())
    while n:
        sol=Balanced_Brackets(input())
        if sol:
            print("YES")
        else:
            print("NO")
        n-=1
    

main()
