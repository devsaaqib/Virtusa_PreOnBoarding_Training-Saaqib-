"""8. Advanced Dictionary Counter (dictionaries)
Problem:
Given a paragraph:
•	Count frequency of each word 
•	Ignore case and punctuation 
•	Return top k frequent words 
"""

def AdvancedDictionaryCounter(paragraph, k):
    import re
    from collections import Counter
    
    # Remove punctuation and convert to lowercase
    words = re.findall(r'\b\w+\b', paragraph.lower())
    
    # Count frequency of each word
    word_count = Counter(words)
    
    # Get top k frequent words
    top_k = word_count.most_common(k)
    
    return dict(top_k)
# Sample Input
paragraph = "Hello world! Hello everyone. Welcome to the world of Python."
k = 2
# Sample Output
result = AdvancedDictionaryCounter(paragraph, k)
print("Top", k, "Frequent Words:", result) 
