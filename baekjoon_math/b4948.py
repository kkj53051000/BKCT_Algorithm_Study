# https://www.acmicpc.net/problem/4948
# 에라토스테네스의 체
import math
import sys

maxValue = 123456

arr = [True for i in range(0, (maxValue * 2) + 1)]

for i in range(2, int(math.sqrt(maxValue * 2) + 1)):
    
    if arr[i]:
        for j in range(i*i, len(arr)):
            if j % i == 0:
                arr[j] = False

while True:
    
    n = int(sys.stdin.readline())

    if n == 0:
        break

    
    answer = 0

    for i in range(n+1, (n*2)+1):
        if arr[i]:
            answer +=1
    
    print(answer)
