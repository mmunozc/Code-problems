def dp(s):
    d = []

    if(d[s] > 0):
        return d[s]
    d[s] = 1
    for i in range(10):
        if(s[i] == 'o' and s[i+1] == 'o' and s[i+2] == '-'):
            t = s
            t[i] = t[i+1] = '-'
            t[i+2] = 'o'
            d[s] = max(d[s], dp(t)+1)

        if(s[i] == '-' and s[i+1] == 'o' and s[i+2] == 'o'):
            t = s
            t[i] = 'o'
            t[i+1] = t[i+2] = '-'
            d[s] = max(d[s], dp(t)+1)

    return d[s]


if __name__ == '__main__':
    n = int(input())
    for j in range(n):
        str = input()
        ans = 1
        for i in range(12):
            if(str[i] == '0'):
                ans += 1
        ans -= dp(str)
        print(ans)
