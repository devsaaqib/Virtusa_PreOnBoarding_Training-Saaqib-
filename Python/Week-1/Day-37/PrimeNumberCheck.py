"""
Problem Statement:
Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.


Input Description:
The input consists of a single integer N.


Output Description:
The output is 'yes' if N is prime, otherwise 'no'.


Sample Input:
123


Sample Output:
no


"""

userInput=int(input())

if userInput<=1:
    print("no")
else:
    for i in range(2,userInput):
        if userInput%i==0:
            print("no")
            break
    else:
        print("yes")