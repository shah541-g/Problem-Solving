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