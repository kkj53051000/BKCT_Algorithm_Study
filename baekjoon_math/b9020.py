# https://www.acmicpc.net/problem/9020

import math


def isPrime(num):
    
    for i in range(2, int(math.sqrt(num) + 1)):
        if num % i == 0 and num != i:
            return False
    
    return True


if __name__ == '__main__':
    t = int(input())

    for i in range(0, t):

        now = int(input())

        x = 0
        y = 0
        
        half = int(now/2)

        if now % 2 == 1: # 홀수
            x = half
            y = half + 1
        else: # 짝수    
            x = half
            y = half

        while True:
            if isPrime(x) and isPrime(y):
                print(x, y)
                break
            else:
                x -= 1
                y += 1
    
