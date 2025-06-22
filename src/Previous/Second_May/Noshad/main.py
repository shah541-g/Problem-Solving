"""
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?

1) Find exact 3 different approaches of solving this problem
2) Before solving this problem I recommend you to learn Hashing, StringBuilders and ArrayList (Java)
3) Also tell their time and space complexity
"""

# Time Complexity: O(n)
# Space Complexity: O(n)
def is_unique_using_set(s: str) -> bool:
  unique = set(s)
  
  if len(unique) == len(s):
    return True
  else:
    return False
  

# Time Complexity: O(n)
# Space Complexity: O(n)
def is_unique_using_dict(s: str) -> bool:
  dic = dict()
  
  for char in s:
    if char not in dic.keys():
      dic[char] = 1
    else:
      dic[char] += 1
        
    if dic[char] > 1:
      return False
  
  return True

# Time Complexity: O(n)
# Space Complexity: O(n)
def is_unique_simple(s: str) -> bool:
  seen = set()
  
  for char in s:
    if char in seen:
      return False
    
    seen.add(char)
  
  return True


def is_unique_no_ds(s: str) -> bool:
  sorted_s = sorted(s)
  n = len(s)
  
  for i in range(n - 1):
    if sorted_s[i] == sorted_s[i + 1]:
      return False
  
  return True
    
  
print(is_unique_no_ds("axcbc"))