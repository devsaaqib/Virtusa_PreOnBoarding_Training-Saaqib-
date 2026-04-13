"""6. Tuple-Based Record System (tuples)
Problem:
You are given a list of tuples (name, score).
Return:
•	The name of the student with highest score 
•	The average score 
•	A tuple of all students scoring above average 
"""

def TupleBasedRecordSystem(records):
    highest_score = max(records, key=lambda x: x[1])
    average_score = sum(score for _, score in records) / len(records)
    above_average_students = tuple(name for name, score in records if score > average_score)
    
    return highest_score[0], average_score, above_average_students

# Sample Input  
records = [("Alice", 85), ("Bob", 90), ("Charlie", 78), ("David", 92)]
# Sample Output
result = TupleBasedRecordSystem(records)
print("Highest Scoring Student:", result[0])
print("Average Score:", result[1])
print("Students Scoring Above Average:", result[2])
