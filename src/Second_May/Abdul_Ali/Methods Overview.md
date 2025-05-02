


## Implementation Details

The `CheckUniqueness` class contains four different methods to check for unique characters:

1. `isUniqueViaBruteForce` - O(n²) time complexity
2. `isUniqueViaBooleanArray` - O(n) time, O(1) space (ASCII only)
3. `isUniqueViaSet` - O(n) time, O(n) space (Unicode compatible)
4. `isUniqueViaSortedArray` - O(n3) time, O(n) space


## Methods Overview
### 1. Brute Force Approach

#### public boolean isUniqueViaBruteForce(String)

    Time Complexity: O(n²)

    Space Complexity: O(1)

    Description: Compares each character with every other character in the string.

### 2. Boolean Array (ASCII) Approach

#### public boolean isUniqueViaBooleanArray(String)

    Time Complexity: O(n)

    Space Complexity: O(1) (fixed 128-size array)

    Limitation: Only works for ASCII characters (0-127)

### 3. HashSet Approach

#### public boolean isUniqueViaSet(String)

    Time Complexity: O(n)

    Space Complexity: O(n)

    Advantage: Works with all Unicode characters

### 4. Sorted Array Approach

#### public boolean isUniqueViaSortedArray(String)

    Time Complexity: O(n3) due to sorting

    Space Complexity: O(n)

    Process: Sorts the array first, then checks adjacent characters
