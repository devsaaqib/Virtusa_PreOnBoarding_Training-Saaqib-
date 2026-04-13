"""
13. String Compression System (strings, loops)
Problem:
Implement basic compression:
•	"aaabbc" → "a3b2c1" 
•	Return original string if compressed version is longer 
"""

def StringCompressionSystem(s):
    if not s:
        return s
    
    compressed = []
    count = 1
    
    for i in range(1, len(s)):
        if s[i] == s[i - 1]:
            count += 1
        else:
            compressed.append(s[i - 1] + str(count))
            count = 1
            
    compressed.append(s[-1] + str(count))  # Add the last character and count
    
    compressed_string = ''.join(compressed)
    
    return compressed_string if len(compressed_string) < len(s) else s
# Sample Input
input_string = "aaabbc"
# Sample Output
result = StringCompressionSystem(input_string)
print("Compressed String:", result) 