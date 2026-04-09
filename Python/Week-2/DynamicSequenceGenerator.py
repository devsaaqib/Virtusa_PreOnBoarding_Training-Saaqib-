"""
Problem:
Given an integer n, generate a sequence:
•	Start with [1] 
•	If current number is even → divide by 2 
•	If odd → multiply by 3 and add 1 
•	Stop when sequence reaches 1 or length exceeds n 
Return the generated list.

"""

def generate_sequence(n):
    sequence = [1]
    while len(sequence) < n and sequence[-1] != 1:
        current = sequence[-1]
        if current % 2 == 0:
            next_num = current // 2
        else:
            next_num = current * 3 + 1
        sequence.append(next_num)
    return sequence