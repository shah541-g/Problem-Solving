"""
  Determines whether one string is a permutation of the other.

  A permutation means that both strings contain the same characters
  with the exact same frequencies, but potentially in a different order.

  Args:
    str1 (str): The first string to compare.
    str2 (str): The second string to compare.

  Returns:
    bool: True if str1 is a permutation of str2, False otherwise.

  Examples:
    >>> is_permutation("listen", "silent")
    True
    >>> is_permutation("apple", "papel")
    True
    >>> is_permutation("rat", "car")
    False
    >>> is_permutation("aabbcc", "abcabc")
    True
"""

# O(logn)
def is_permutation_with_data_structure(str1: str, str2: str) -> bool:
  if len(str1) != len(str2):
    return False
  
  dic1 = dict()
  dic2 = dict()
  
  for ch in str1:
    if ch in dic1.keys():
      dic1[ch] += 1
    else:
      dic1[ch] = 1
  
  for ch in str2:
    if ch in dic2.keys():
      dic2[ch] += 1
    else:
      dic2[ch] = 1
  
  for key in dic1.keys():
    if key not in dic2.keys():
      return False
    elif dic1[key] != dic2[key]:
      return False
  
  return True

# O(nlogn)
def is_permutation_without_data_structure(str1: str, str2: str) -> bool:
  if len(str1) != len(str2):
    return False
  
  sorted_str1 = sorted(str1)
  sorted_str2 = sorted(str2)
    
  for i, ch in enumerate(sorted_str1):
    if ch != sorted_str2[i]:
      return False
  
  return True


str1 = "aabb"
str2 = "aaab"


print(is_permutation_with_data_structure(str1, str2))
print(is_permutation_without_data_structure(str1, str2))