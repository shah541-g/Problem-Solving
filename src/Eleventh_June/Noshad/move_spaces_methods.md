# 🚀 Move Spaces to End - Methods Overview

This document explains and compares multiple methods for solving the problem:

> Given a string, move all the spaces (including leading and inner spaces) to the end of the string, preserving the order of non-space characters.

---

## ✏️ Problem Example

If `-` represents a space:

- **Input:** `"I-Love-You"`
- **Output:** `"ILoveYou--"`

---

## 1. ❌ Unoptimized Approach (`move_spaces_to_end_unoptimized`)

```python
def move_spaces_to_end_unoptimized(s: str) -> str:
  string_to_be_appended = ""
  li_s = list(s)

  for i, char in enumerate(li_s):
    if char == " ":
      string_to_be_appended += " "
      del li_s[i]

  return "".join(li_s) + string_to_be_appended
```

### ⏱ Time Complexity: **O(n²)**

- `del li_s[i]` causes shifting of elements → expensive in-place mutation
- `string += " "` is also O(n) in loops → creates new strings each time

### ✅ Output: Correct

### ❌ Drawbacks:

- Inefficient for large strings
- Modifies list while iterating → dangerous

---

## 2. ✅ Optimized Approach (`move_spaces_to_end_optimized`)

```python
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
```

### ⏱ Time Complexity: **O(n)**

- One pass to count/move characters
- One pass to extend with spaces
- Efficient memory usage

### ✅ Output: Correct

### ✅ Best for: Performance & clarity

---

## 3. ⚡ One-Liner Approach (`move_spaces_to_end_one_liner`)

```python
def move_spaces_to_end_one_liner(s: str) -> str:
  return s.replace(" ", "") + " " * (len(s) - len(s.replace(" ", "")))
```

### ⏱ Time Complexity: **O(n)**

- Uses `replace()` twice → O(n)
- `len()` is O(1)

### ✅ Output: Correct

### ✅ Best for: Quick, readable solution

### ⚠️ Note: Avoids storing `replace()` result → slightly inefficient; can be improved by storing once

---

## ✅ Final Recommendation

| Method        | Time  | Space | Notes                                  |
| ------------- | ----- | ----- | -------------------------------------- |
| `unoptimized` | O(n²) | O(n)  | Avoid due to poor performance          |
| `optimized`   | O(n)  | O(n)  | Best for clarity and performance       |
| `one_liner`   | O(n)  | O(n)  | Best for concise, quick implementation |

---

## 🛠️ Suggested Improvement

For the one-liner, store `s.replace(" ", "")` once to avoid duplicate computation:

```python
def move_spaces_to_end_one_liner_better(s: str) -> str:
  no_spaces = s.replace(" ", "")
  return no_spaces + " " * (len(s) - len(no_spaces))
```

---

Let me know if you want this logic to also remove tabs or other whitespace characters.

