## Implementation Details

The `CheckPermutationByAbdulAli` class contains four methods to check if one string is a permutation of another:

1. `isPermutationBySorting` - O(n log n) time complexity
2. `isPermutationViaParsing` - O(n²) time complexity
3. `isPermutationForNonRepeating` - O(n) time complexity
4. `isPermutationByCountingCharacters` - O(n) time complexity

## Methods Overview

### 1. Sorting Approach

#### public boolean isPermutationBySorting(String, String)

    Time Complexity: O(n log n) due to sorting

    Space Complexity: O(n) for creating char arrays

    Description: Sorts both input strings and compares them for equality. If the sorted strings are identical, they are permutations of each other.

    Advantage: Simple and intuitive.

    Limitation: Higher time complexity due to sorting.

### 2. Parsing Approach

#### public boolean isPermutationViaParsing(String, String)

    Time Complexity: O(n²) due to nested loop for character matching

    Space Complexity: O(n) for StringBuilder

    Description: Iterates through each character of the first string, searching for a match in the second string (using StringBuilder). Marks matched characters as spaces to avoid reuse. Returns false if any character is unmatched.

    Limitation: Inefficient for large strings due to quadratic time complexity.

### 3. Bitwise Array for Non-Repeating Characters

#### public boolean isPermutationForNonRepeating(String, String)

    Time Complexity: O(n)

    Space Complexity: O(1) (fixed 26-size boolean array)

    Description: Uses a boolean array to mark the presence of characters in the first string, then checks if the second string’s characters match those marked. Assumes only alphabetic characters (a-z, A-Z) and non-repeating characters.

    Limitation: Only works for non-repeating alphabetic characters; not suitable for general cases with duplicates or non-alphabetic characters.

### 4. Character Counting Approach

#### public boolean isPermutationByCountingCharacters(String, String)

    Time Complexity: O(n)

    Space Complexity: O(1) (fixed 128-size array for ASCII)

    Description: Counts the frequency of each character in the first string and decrements the count for each character in the second string. Returns false if any count goes negative, indicating a mismatch. Returns true if all counts reach zero.

    Advantage: Efficient and handles all ASCII characters, including duplicates.

    Limitation: Assumes ASCII characters (0-127).


