# https://www.acmicpc.net/problem/4948

import math
import sys


while True:
    
    n = int(sys.stdin.readline())
    sum = n

    if n == 0:
        break

    arr = [True for i in range(0, (n*2)+1)]


    for i in range(2, int(math.sqrt(n*2) + 1)):
        
        if arr[i]:
            for j in range(n+1, len(arr)):

                if arr[j] and j != i and j % i == 0:
                    arr[j] = False
                    sum -= 1
    print(sum)
