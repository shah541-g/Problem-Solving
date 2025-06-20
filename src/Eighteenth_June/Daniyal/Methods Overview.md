# Is Unique – By Daniyal

# Problem 1.1 - Is Unique

## Problem Statement
Determine whether a given string has all unique characters without using additional data structures like sets or hash maps.

## Approach
This solution first converts the input string to lowercase to ensure case-insensitivity. Then, it sorts the string. After sorting, any duplicate characters will appear next to each other, so a single scan (loop) is enough to detect duplicates.

### Steps:
1. Convert the string to lowercase.
2. Sort the characters.
3. Check adjacent characters in the sorted list.
4. If any two adjacent characters are equal, return False.
5. If no duplicates are found, return True.

## Code Explanation
```python
def prerequisites(s):
    s_lower = s.lower()
    s_sorted = sorted(s_lower)
    return s_sorted

def is_check(s):
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            return False
    return True

print("Welcome to is unique checker. True for unique and False for non-unique.")
string_s = input("Enter string: ")
print(is_check(prerequisites(string_s)))
