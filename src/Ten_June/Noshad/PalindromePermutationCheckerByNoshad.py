# O(n)
def is_permutation_palindrome_using_hash_map(s: str) -> bool:
  if not s:
    return False
    
  dic = dict()
  for char in s.lower():
    if char == " ":
      continue
    
    if char not in dic.keys():
      dic[char] = 0
        
    dic[char] += 1 
    
  isOddCountFound = False
  for occurrence in dic.values():
    if occurrence % 2 != 0:
      if isOddCountFound:
        return False
      else:
        isOddCountFound = True
      
  return True


# O(n)
def is_permutation_palindrome_using_set(s: str) -> bool:
  if not s:
    return False
  
  odd_chars = set()
  
  for char in s.lower():
    if char == " ":
      continue
    
    if char in odd_chars:
      odd_chars.remove(char)
    else:
      odd_chars.add(char)
  
  return len(odd_chars) <= 1


print(is_permutation_palindrome_using_hash_map("tacdac"))
print(is_permutation_palindrome_using_set("tacdac"))
