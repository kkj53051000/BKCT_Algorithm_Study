# https://www.acmicpc.net/problem/1978
import math


n = int(input())

arr = list(input().split())

sum = 0

for i in arr:

    now = int(i)

    if now == 0 or now == 1:
        continue

    iCheck = True

    for j in range(2, int(math.sqrt(now)) + 1):
        if now % j == 0:
            iCheck = False
    
    if iCheck:
        sum += 1
        

print(sum)