## Implementation Details

The `PermutationCheckerByAbdulAli` class contains four methods to check if one string is a permutation of another:

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


## Implementation Details

The `URLifyByAbdulAli` class contains three methods to replace spaces in a string with `%20` to create a URL-friendly string:

1. `URLifyViaRegex` - O(n) time complexity
2. `URLifyViaStringBuilder` - O(n) time complexity
3. `URLifyViaCharacterArray` - O(n) time complexity

## Methods Overview

### 1. Regex Approach

#### public char[] URLifyViaRegex(String, int)

    Time Complexity: O(n) for string operations and regex replacement

    Space Complexity: O(n) for new char array and intermediate string

    Description: Trims the input string, replaces spaces with hyphens, and then uses regex to replace hyphens with `%20`. Returns the result as a char array.

    Advantage: Simple and concise.

    Limitation: Relies on regex, which may be slower for large strings, and creates multiple intermediate objects.

### 2. StringBuilder Approach

#### public char[] URLifyViaStringBuilder(String, int)

    Time Complexity: O(n) for iterating and replacing

    Space Complexity: O(n) for StringBuilder and final char array

    Description: Trims the input string, uses a StringBuilder to iterate through characters, and replaces each space with `%20`. Adjusts the index to account for the additional characters. Returns the result as a char array.

    Advantage: More controlled than regex, avoids multiple string creations.

    Limitation: Requires manual index management, slightly more complex.

### 3. Character Array In-Place Approach

#### public char[] URLifyViaCharacterArray(char[], int)

    Time Complexity: O(n) for single pass over the string

    Space Complexity: O(1) as it modifies the input array in-place

    Description: Assumes the input char array has extra space (2 additional spaces per space character) at the end. Counts spaces to calculate the final index, then iterates backward, replacing spaces with `%20` and shifting non-space characters. Uses the actual length to process only the relevant portion.

    Advantage: Most efficient in terms of space as it modifies the array in-place.

    Limitation: Requires the input array to have sufficient extra space and assumes ASCII characters.