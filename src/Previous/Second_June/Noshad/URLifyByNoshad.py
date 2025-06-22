"""
Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith ", 13
Output:
"Mr%20John%20Smith"
"""

# O(logn)
def URLify_flexible_array(str: str, n: int) -> str:
  li = list(str)
  
  for i, ch in enumerate(li):
    if ch == " " and i < n:
      li[i] = "%20"
  
  str = "".join(li).rstrip()
  
  return str
    

# O(logn)
def URLify_inflexible_array(str: str, n: int) -> str:
  no_of_spaces = 0
  
  for i, ch in enumerate(str):
    if ch == " " and i < n:
      no_of_spaces += 1
  
  if not no_of_spaces:
    return str
  
  size = n + (no_of_spaces * 2)
  li = [None] * size
  i = 0
  
  for j, ch in enumerate(str):
    if j == n:
      break
    
    if ch == " ":
      li[i] = "%"
      li[i + 1] = "2"
      li[i + 2] = "0"
      i += 2
    else:
      li[i] = ch
    i += 1
  
  return "".join(li)


str = "Mr John Smith "
n = 13

print(URLify_flexible_array(str, n))
print(URLify_inflexible_array(str, n))
