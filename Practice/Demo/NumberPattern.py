'''
Created on 20-Oct-2019

@author: Amitava
'''
n=5
m=5
for i in range (1,n+1):
    for j in range(1,m+1):
        if i==j or j<i:
            print(j , end=" ")
        else: 
            print(" ", end= " ")
    print()