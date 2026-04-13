"""
11. Range-Based Matrix Builder (range, loops)
Problem:
Given n, build an n x n matrix where:
•	Diagonal elements = 1 
•	Above diagonal = increasing numbers 
•	Below diagonal = decreasing numbers 
Return the generated matrix as a list of lists.
"""

def RangeBasedMatrixBuilder(n):
    matrix = [[0] * n for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            if i == j:
                matrix[i][j] = 1
            elif j > i:
                matrix[i][j] = j - i
            else:
                matrix[i][j] = i - j
    
    return matrix   
# Sample Input
n = 4
# Sample Output
result = RangeBasedMatrixBuilder(n)
for row in result:
    print(row)  