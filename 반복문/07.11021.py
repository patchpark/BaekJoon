'''

https://www.acmicpc.net/problem/11021

'''



import sys

num = int(sys.stdin.readline())

for i in range(num):
    a,b = map(int, sys.stdin.readline().split())
    print("Case #%d: %d" %(i+1, a+b))