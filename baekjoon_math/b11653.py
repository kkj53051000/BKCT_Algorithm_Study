# https://www.acmicpc.net/problem/11653
# 소인수분해

import math


n = int(input())
m = 2
sqrt = math.sqrt(n)

while m <= sqrt:
    if n % m == 0:
        n = int(n / m)
        print(m)
    else:
        m += 1


if n > 1:
    print(n)