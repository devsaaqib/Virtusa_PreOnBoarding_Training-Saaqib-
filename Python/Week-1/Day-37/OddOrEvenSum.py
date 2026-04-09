"""
Problem Statement:
Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.


Input Description:
The input consists of two integers, N and M.


Output Description:
The output is 'odd' if the sum of N and M is odd, and 'even' if the sum is even.


Sample Input:
9 2


Sample Output:
odd

"""


#Getting input via STDIN
userInput = list(map(int,input().split()))
if sum(userInput)%2==0:
    print("even")
else:
    print("odd")

#print("The Input Provided is: " + userInput)