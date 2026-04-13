"""
15. Recursive-Like Iterative Solver (while + functions)
Problem:
Simulate recursion using a loop:
•	Given n, compute factorial using only while 
•	Track intermediate steps in a list 
•	Return both result and steps 
"""

def IterativeSolver(n):
    if n < 0:
        return None, ["Factorial is not defined for negative numbers"]
    
    result = 1
    steps = []
    
    while n > 1:
        steps.append(f"Multiplying {result} by {n}")
        result *= n
        n -= 1
    
    steps.append(f"Final result: {result}")
    return result, steps
# Sample Input
n = 5
# Sample Output
result, steps = IterativeSolver(n)
print("Factorial Result:", result)
print("Computation Steps:")
for step in steps:
    print(step)