"""
Question:
Given a number N, find its next immediate greater power of 2(i.e 2^1, 2^2, 2^3...).


Input Description:
The input consists of a number N where N <= 1000.


Sample Input:
4


Sample Output:
8


"""

userInput=int(input())
power=1
while power<=userInput:
    power*=2
print(power) 