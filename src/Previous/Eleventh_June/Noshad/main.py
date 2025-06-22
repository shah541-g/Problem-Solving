"""
You are given a string and you have to move all its inner spaces or any extra spaces at starting to the end. for example in the give instance if we consider - is representing space
  
Input: I-Love-You
Output: ILoveYou--
"""
# O(n^2)
def move_spaces_to_end_unoptimized(s: str) -> str:
  string_to_be_appended = ""
  li_s = list(s)
  
  for i, char in enumerate(li_s):
    if char == " ":
      string_to_be_appended += " "
      del li_s[i]
  
  return "".join(li_s) + string_to_be_appended


# O(n)
def move_spaces_to_end_optimized(s: str) -> str:
  spaces_count = 0
  new_s = list()
  
  for char in s:
    if char == " ":
      spaces_count += 1
    else:
      new_s.append(char)
  
  new_s.extend([" "] * spaces_count)
  
  return "".join(new_s)

# O(n)
def move_spaces_to_end_one_liner(s: str) -> str:
  return s.replace(" ", "") + " " * (len(s) - len(s.replace(" ", "")))


print(move_spaces_to_end_unoptimized("I love you"))
print(move_spaces_to_end_optimized("I love you"))
print(move_spaces_to_end_one_liner("I love you"))