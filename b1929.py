# https://www.acmicpc.net/problem/1929
# 시간 복잡도 : O^2

# def prime_check(num):

#     if num == 0 or num == 1:
#         return False

#     for i in range(2, num):
#         if (num % i) == 0:
#             return False
    
#     return True



# if __name__ == '__main__':
#     n, m = input().split()

#     n = int(n)
#     m = int(m)

#     for i in range(n, m+1):
#         if prime_check(i):
#             print(i)


# 시간초과




# 시간 복잡도 : O^(1/2)

from math import sqrt


def prime_check(num):

    if num == 0 or num == 1:
        return False

    for i in range(2, int(sqrt(num)) + 1):
        if (num % i) == 0:
            return False
    
    return True



if __name__ == '__main__':
    n, m = input().split()

    n = int(n)
    m = int(m)

    for i in range(n, m+1):
        if prime_check(i):
            print(i)


#에라토스테네스의 체