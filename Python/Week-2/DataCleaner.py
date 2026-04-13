"""
16. 
Problem:
You are given raw data (list of strings):
1.	Clean data (remove digits, special chars) 
2.	Convert to lowercase 
3.	Store word frequencies using dictionary 
4.	Use set to remove duplicates 
5.	Return top 3 frequent words as tuples (word, count) 
"""

def DataCleaner(raw_data):
    import re
    from collections import Counter
    
    # Step 1: Clean data (remove digits, special chars) and convert to lowercase
    cleaned_data = [re.sub(r'[^a-zA-Z\s]', '', word).lower() for word in raw_data]
    
    # Step 2: Store word frequencies using dictionary
    word_count = Counter(cleaned_data)
    
    # Step 3: Use set to remove duplicates (not needed here since Counter already handles it)
    
    # Step 4: Return top 3 frequent words as tuples (word, count)
    top_3 = word_count.most_common(3)
    
    return top_3
# Sample Input
raw_data = ["Hello!", "World123", "Hello", "Python@3.8", "Python", "Hello#"]
# Sample Output
result = DataCleaner(raw_data)
print("Top 3 Frequent Words:", result)