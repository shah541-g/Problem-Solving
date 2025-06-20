# Is Unique – By Mehrab Siddique

# Date: 2025-06-19

## Problem Statement

**Problem Name**: Is Unique  
**Difficulty**: Easy  
**Source**: [GeeksforGeeks - Determine if a String Has All Unique Characters](https://www.geeksforgeeks.org/determine-string-unique-characters/)

### Description:

Implement an algorithm to determine if a string has all unique characters.  
**Constraints**: 
 
- You **cannot use additional data structures** in this version.
- Focus is on understanding character comparison logic and control flow.

---

## Implementation Details

The `IsUniqueByMehrab` class (or function-based implementation) contains one method to check whether a string contains all unique characters using a basic brute-force approach:

---

### ✅ Method 1: Brute Force via Nested Loops

#### `public boolean isUnique(String str)`  
> **Time Complexity**: O(n²)  
> **Space Complexity**: O(1)  

---

### 📘 Description:

This method compares each character with every other character that comes after it in the string. If any two characters match, it returns `false`. If the loop completes with no duplicates found, it returns `true`.

---

### ✅ Advantage: 

- No additional data structures used.
- Simple logic using only `if` and `for`.
- Great for interview scenarios where space is restricted.

---

### ❌ Limitation:

- Inefficient for longer strings due to quadratic time complexity.
- Doesn’t scale well for performance-sensitive applications.

---

## 🔍 Code

```python
def is_unique(str):
    for i in range(len(str)):
        for j in range(i + 1, len(str)):
            if str[i] == str[j]:
                return False
    return True

user_input = input("Enter a string: ")

if is_unique(user_input):
    print("All characters are unique.")
else:
    print("Duplicate characters found.")
