"""

Problem: Intelligent Log Analyzer
Problem:
Given logs as list of strings:
•	Extract timestamps and messages 
•	Count error types using dictionary 
•	Use sets to find unique errors 
•	Return sorted list of (error, frequency) 
•	Filter logs using functions and conditions
"""

def LogAnalyzer(logs):
    import re
    from collections import Counter
    
    # Step 1: Extract timestamps and messages
    log_pattern = r'(\d{4}-\d{2}-\d{2} \d{2}:\d{2}:\d{2}) - (.*)'
    extracted_logs = [re.match(log_pattern, log).groups() for log in logs if re.match(log_pattern, log)]
    
    # Step 2: Count error types using dictionary
    error_count = Counter()
    for timestamp, message in extracted_logs:
        if "ERROR" in message:
            error_type = message.split("ERROR")[1].strip()
            error_count[error_type] += 1
    
    # Step 3: Use sets to find unique errors
    unique_errors = set(error_count.keys())
    
    # Step 4: Return sorted list of (error, frequency)
    sorted_errors = sorted(error_count.items(), key=lambda x: x[1], reverse=True)
    
    return sorted_errors
# Sample Input
logs = [
    "2024-06-01 12:00:00 - INFO - System started",
    "2024-06-01 12:05:00 - ERROR - Database connection failed",
    "2024-06-01 12:10:00 - ERROR - Database connection failed",
    "2024-06-01 12:15:00 - ERROR - Disk space low",
    "2024-06-01 12:20:00 - INFO - User logged in"
]
# Sample Output
result = LogAnalyzer(logs)
print("Sorted List of (Error, Frequency):", result) 