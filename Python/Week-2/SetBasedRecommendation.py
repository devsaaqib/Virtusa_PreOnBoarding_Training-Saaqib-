"""
7. Set-Based Recommendation System (sets)
Problem:
Given two users’ liked items:
•	Return common items 
•	Return unique items liked by only one user 
•	Recommend items from user B not seen by user A 
"""

def SetBasedRecommendation(userA_likes, userB_likes):
    common_items = userA_likes.intersection(userB_likes)
    unique_items = userA_likes.symmetric_difference(userB_likes)
    recommendations = userB_likes.difference(userA_likes)
    
    return common_items, unique_items, recommendations
# Sample Input
userA_likes = {"item1", "item2", "item3"}
userB_likes = {"item2", "item3", "item4"}
# Sample Output
result = SetBasedRecommendation(userA_likes, userB_likes)
print("Common Items:", result[0])
print("Unique Items:", result[1])
print("Recommendations for User A:", result[2])