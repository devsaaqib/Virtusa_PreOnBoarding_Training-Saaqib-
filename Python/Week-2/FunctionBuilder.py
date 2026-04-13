"""
 9. Function Builder (functions, parameters, return)
Problem:
Write a function that:
•	Takes a list and a threshold value 
•	Returns a new list of elements greater than threshold 
•	Also returns their count 
"""

def FunctionBuilder(input_list, threshold):
    filtered_list = [x for x in input_list if x > threshold]
    count = len(filtered_list)
    return filtered_list, count
# Sample Input
input_list = [1, 5, 3, 8, 2]
threshold = 3
# Sample Output
result = FunctionBuilder(input_list, threshold)
print("Filtered List:", result[0])
print("Count of Elements Greater than Threshold:", result[1])
