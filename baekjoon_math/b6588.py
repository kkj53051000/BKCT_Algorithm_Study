# https://www.acmicpc.net/problem/6588

import math


maxValue = 1000000

booleanArr = [True for i in range(0, maxValue + 1)]

booleanArr[0] = booleanArr[1] = False

for i in range(2, int(math.sqrt(maxValue) + 1)):
    
    if booleanArr[i]:
        for j in range(i*i, maxValue, i):
            booleanArr[j] = False



while True:
    
    n = int(input())

    if n == 0:
        break

    check = True

    for i in range(0, len(booleanArr)):
        if booleanArr[i] and booleanArr[n-i] and n > i:
            print(n, "=", i, "+", n-i)
            check = False
            break

    if check:
        print("Goldbach's conjecture is wrong.")
