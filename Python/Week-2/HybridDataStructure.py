"""
14. Hybrid Data Structure Processor (lists + tuples + sets + dicts)
Problem:
Given mixed data:
•	Extract unique elements 
•	Count occurrences 
•	Store results as {element: count} 
•	Return sorted list of (element, count) tuples 
"""

def HybridDataStructureProcessor(mixed_data):
    # Extract unique elements and count occurrences
    element_count = {}
    for item in mixed_data:
        if item in element_count:
            element_count[item] += 1
        else:
            element_count[item] = 1
    # Store results as (element, count) tuples and sort them
    sorted_elements = sorted((element_count.values()))
    
    return sorted_elements
# Sample Input
mixed_data = [1, 'a', 2, 'b', 1, 'a', 3, 'c']
# Sample Output
result = HybridDataStructureProcessor(mixed_data)
print("Sorted List of (Element, Count) Tuples:", result)    