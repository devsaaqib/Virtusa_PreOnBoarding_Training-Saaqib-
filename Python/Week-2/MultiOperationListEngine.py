"""
12. Multi-Operation List Engine (list operations + methods)
Problem:
Given a list:
•	Rotate it by k positions 
•	Remove duplicates while preserving order 
•	Split into even and odd lists 
Return both lists.
"""
def MultiOperationListEngine(input_list, k):
    # Rotate the list by k positions
    k = k % len(input_list)  # Handle cases where k > len(input_list)
    rotated_list = input_list[-k:] + input_list[:-k]
    
    # Remove duplicates while preserving order
    seen = set()
    unique_list = []
    for item in rotated_list:
        if item not in seen:
            seen.add(item)
            unique_list.append(item)
    
    # Split into even and odd lists
    even_list = [x for x in unique_list if x % 2 == 0]
    odd_list = [x for x in unique_list if x % 2 != 0]
    
    return even_list, odd_list
# Sample Input
input_list = [1, 2, 3, 4, 5, 2, 3]
k = 2
# Sample Output
even_list, odd_list = MultiOperationListEngine(input_list, k)
print("Even List:", even_list)
print("Odd List:", odd_list)    