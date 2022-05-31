def free(queens, r, c):
    #false if two queens share the same column and the same row
    for i in range(r):
        if queens[i][c] == 'Q':
            return False
    for j in range(c):
        if queens[r][j] == 'Q':
            return False
    #false if two queens share the same diagonal
    (i, j) = (r, c)
    while i >= 0 and j >= 0:
        if queens[i][j] == 'Q':
            return False
        i = i - 1
        j = j - 1
    #false if two queens share the same diagonal
    (i, j) = (r, c)
    while i >= 0 and j < N:
        if queens[i][j] == 'Q':
            return False
        i = i - 1
        j = j + 1
    return True


def printSolution(queens):
    for i in range(N):
        print(queens[i])
    print()



def nQueen(queens, r):
    if r == N:
        printSolution(queens)
        return 1
    total = 0
    for i in range(N):
        # if no two queens threaten each other
        if free(queens, r, i):
            # place queen on the current square
            queens[r][i] = 'Q'
            # recur for the next row
            total += nQueen(queens, r + 1)
            # backtrack and remove the queen from the current square
            queens[r][i] = '*'
    return total



if __name__ == '__main__':
    N = 8
    queens = [['*' for x in range(N)] for y in range(N)]
    print(nQueen(queens, 0))

