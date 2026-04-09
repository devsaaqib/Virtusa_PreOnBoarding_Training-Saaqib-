"""
Problem:
Given a list of integers:
1.	Remove all negative numbers 
2.	Insert 0 after every even number 
3.	Sort the list in descending order 
Return the final list.
"""

def process_list(input_list):
    # Step 1: Remove all negative numbers
    processed_list = [num for num in input_list if num >= 0]
    
    # Step 2: Insert 0 after every even number
    final_list = []
    for num in processed_list:
        final_list.append(num)
        if num % 2 == 0:
            final_list.append(0)
    
    # Step 3: Sort the list in descending order
    final_list.sort(reverse=True)
    
    return final_list