"""10. Variable Scope Tracker (global vs local)
Problem:
Create a system where:
•	A global counter tracks total function calls 
•	A local counter tracks calls inside a function 
•	Return both counters after multiple calls 
"""

def variable_scope_tracker():
    global total_calls
    total_calls += 1
    
    local_calls = 0
    local_calls += 1
    
    return total_calls, local_calls
# Initialize global counter
total_calls = 0
# Sample Calls
print(variable_scope_tracker())  # Output: (1, 1)
print(variable_scope_tracker())  # Output: (2, 1)
print(variable_scope_tracker())  # Output: (3, 1)
