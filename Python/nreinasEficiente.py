
def printSolution(queens):
    for i in range(N):
        for j in range(N):
            if queens[i][j] == -1:
                print('Q',end='')
            else:
                print('*',end='')
#                print(queens[i][j], end='')
        print()
    print()



def nQueen(queens, reinasColocadas, fila):
    
    if reinasColocadas == N:
        printSolution(queens)
        return 1
    total = 0
    
    for i in range (N):
        if queens[fila][i] == 0:
            queens[fila][i] = -1
            for j in range(fila+1,N):
                queens[j][i] += 1
            c = i+1
            f = fila+1
            while c < N and f < N:
                queens[f][c] += 1
                c += 1
                f += 1
            c = i - 1
            f = fila + 1
            while c >= 0 and f < N:
                queens[f][c] += 1
                c -= 1
                f += 1
            total += nQueen(queens, reinasColocadas+1, fila+1)
            for j in range(fila+1,N):
                queens[j][i] -= 1
            c = i+1
            f = fila+1
            while c < N and f < N:
                queens[f][c] -= 1
                c += 1
                f += 1
            c = i - 1
            f = fila + 1
            while c >= 0 and f < N:
                queens[f][c] -= 1
                c -= 1
                f += 1
            queens[fila][i]=0 
    
    return total



if __name__ == '__main__':
    N = 8
    queens = [[0 for x in range(N)] for y in range(N)]
    print(nQueen(queens, 0, 0))