# https://www.acmicpc.net/problem/2609
# 최대공약수 최소공배수

x, y = map(int, input().split())

# 최대 공약수
def GCD(x, y):
    while(True):
        r = x % y

        if r == 0:
            break

        x = y
        y = r
    
    return y

# 최소 공배수
def LCM(x, y):
    result = (x*y)//GCD(x,y)
    return result
    

print(GCD(x, y))
print(LCM(x, y))