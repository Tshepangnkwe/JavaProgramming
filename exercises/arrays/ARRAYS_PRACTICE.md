# Arrays Practice Problems

Complete these 20 practice problems to master Java arrays (single-dimensional, multi-dimensional, searching, sorting). Write all programs from scratch and test them thoroughly.

## Instructions
- Create a separate Java file for each problem
- Name your files: `Arrays01.java`, `Arrays02.java`, etc.
- Include a main method to test your solution
- Use proper indentation and comments
- Test with various inputs including edge cases

---

## Problem 1: Array Statistics Calculator
**File:** `Arrays01.java`

**Description:** Calculate comprehensive statistics for an array of numbers.

**Requirements:**
- Read array size and elements from user
- Calculate: sum, average, minimum, maximum, range
- Find second largest and second smallest elements
- Count positive, negative, and zero elements
- Handle empty arrays gracefully

**Test Cases:**
- Array: [5, 2, 8, 1, 9] → Sum: 25, Average: 5.0, Min: 1, Max: 9
- Array: [-3, 0, 5] → Positive: 1, Negative: 1, Zero: 1

---

## Problem 2: Array Search Algorithms
**File:** `Arrays02.java`

**Description:** Implement multiple search algorithms for arrays.

**Requirements:**
- Linear search: Find element in unsorted array
- Binary search: Find element in sorted array
- Find first and last occurrence of an element
- Search for multiple elements at once
- Return both index and boolean result

**Test Cases:**
- Array: [3, 7, 1, 9, 7, 5], Search: 7 → Found at indices 1 and 4
- Array: [1, 3, 5, 7, 9], Search: 6 → Not found

---

## Problem 3: Array Sorting Showcase
**File:** `Arrays03.java`

**Description:** Implement and compare different sorting algorithms.

**Requirements:**
- Bubble sort with step-by-step display
- Selection sort with comparisons count
- Insertion sort with shifts count
- Allow user to choose sorting algorithm
- Display original, intermediate steps, and final array

**Test Cases:**
- Array: [64, 34, 25, 12, 22, 11, 90] → Show sorting process
- Compare efficiency of different algorithms

---

## Problem 4: Array Rotation Operations
**File:** `Arrays04.java`

**Description:** Perform various array rotation operations.

**Requirements:**
- Rotate array left by k positions
- Rotate array right by k positions
- Handle k > array length (use modulo)
- Implement both in-place and new array methods
- Display rotation steps

**Test Cases:**
- Array: [1, 2, 3, 4, 5], Left rotate by 2 → [3, 4, 5, 1, 2]
- Array: [1, 2, 3, 4, 5], Right rotate by 3 → [3, 4, 5, 1, 2]

---

## Problem 5: Array Merge and Split Operations
**File:** `Arrays05.java`

**Description:** Merge arrays and split arrays based on criteria.

**Requirements:**
- Merge two sorted arrays into one sorted array
- Split array into two halves
- Split array based on even/odd elements
- Merge multiple arrays of different sizes
- Remove duplicates during merge

**Test Cases:**
- Array1: [1, 3, 5], Array2: [2, 4, 6] → Merged: [1, 2, 3, 4, 5, 6]
- Array: [1, 2, 3, 4, 5, 6] → Even: [2, 4, 6], Odd: [1, 3, 5]

---

## Problem 6: Matrix Operations
**File:** `Arrays06.java`

**Description:** Perform operations on 2D arrays (matrices).

**Requirements:**
- Matrix addition and subtraction
- Matrix multiplication
- Matrix transpose
- Find diagonal sums (main and anti-diagonal)
- Check if matrix is symmetric

**Test Cases:**
- 3x3 matrices addition/multiplication
- Check symmetry of identity matrix
- Calculate diagonal sums

---

## Problem 7: Array Pattern Finder
**File:** `Arrays07.java`

**Description:** Find patterns and sequences in arrays.

**Requirements:**
- Find arithmetic progression subsequences
- Find geometric progression subsequences
- Detect increasing/decreasing sequences
- Find longest consecutive sequence
- Identify palindromic subarrays

**Test Cases:**
- Array: [1, 3, 5, 7, 9] → Arithmetic progression with difference 2
- Array: [2, 4, 8, 16] → Geometric progression with ratio 2

---

## Problem 8: Array Frequency Analysis
**File:** `Arrays08.java`

**Description:** Analyze frequency of elements in arrays.

**Requirements:**
- Count frequency of each element
- Find most and least frequent elements
- Display frequency table
- Find elements that appear exactly k times
- Group elements by frequency

**Test Cases:**
- Array: [1, 2, 2, 3, 3, 3] → Frequencies: 1→1, 2→2, 3→3
- Most frequent: 3, Least frequent: 1

---

## Problem 9: Subarray Problems
**File:** `Arrays09.java`

**Description:** Solve various subarray-related problems.

**Requirements:**
- Find maximum sum subarray (Kadane's algorithm)
- Find all subarrays with given sum
- Find longest subarray with equal 0s and 1s
- Generate all possible subarrays
- Find subarray with maximum product

**Test Cases:**
- Array: [-2, 1, -3, 4, -1, 2, 1, -5, 4] → Max sum subarray: [4, -1, 2, 1]
- Array: [1, 0, 1, 0, 1] → Find equal 0s and 1s subarrays

---

## Problem 10: Array Manipulation Challenges
**File:** `Arrays10.java`

**Description:** Perform complex array manipulations.

**Requirements:**
- Remove duplicates maintaining order
- Rearrange array in alternating positive-negative
- Move all zeros to end while maintaining order
- Reverse array in groups of k elements
- Cyclically rotate array

**Test Cases:**
- Array: [1, 2, 0, 4, 0, 5] → Move zeros: [1, 2, 4, 5, 0, 0]
- Array: [1, 2, 3, 4, 5, 6], k=3 → Reverse in groups: [3, 2, 1, 6, 5, 4]

---

## Problem 11: Array Intersection and Union
**File:** `Arrays11.java`

**Description:** Find intersection, union, and difference of arrays.

**Requirements:**
- Find intersection of two arrays
- Find union of two arrays
- Find elements in first array but not in second
- Handle duplicate elements appropriately
- Optimize for sorted arrays

**Test Cases:**
- Array1: [1, 2, 3, 4], Array2: [3, 4, 5, 6] → Intersection: [3, 4], Union: [1, 2, 3, 4, 5, 6]

---

## Problem 12: Peak Element Finder
**File:** `Arrays12.java`

**Description:** Find peak elements in arrays using different approaches.

**Requirements:**
- Find any peak element (element greater than neighbors)
- Find all peak elements in array
- Find peak element in 2D array
- Use both linear and binary search approaches
- Handle edge cases (first/last elements)

**Test Cases:**
- Array: [1, 3, 2, 4, 1] → Peaks at indices 1 and 3 (elements 3 and 4)
- Array: [5, 4, 3, 2, 1] → Peak at index 0 (element 5)

---

## Problem 13: Array Rearrangement Puzzles
**File:** `Arrays13.java`

**Description:** Solve array rearrangement puzzles.

**Requirements:**
- Rearrange array so that arr[i] = i (if possible)
- Arrange elements alternately maximum and minimum
- Rearrange positive and negative numbers alternately
- Sort array of 0s, 1s, and 2s (Dutch flag problem)
- Segregate even and odd numbers

**Test Cases:**
- Array: [2, 0, 1, 4, 3] → Rearrange to [0, 1, 2, 3, 4] where possible
- Array: [0, 1, 2, 0, 1, 2] → Sort: [0, 0, 1, 1, 2, 2]

---

## Problem 14: Array Sliding Window Problems
**File:** `Arrays14.java`

**Description:** Solve problems using sliding window technique.

**Requirements:**
- Find maximum sum of k consecutive elements
- Find minimum sum of k consecutive elements
- Find window with maximum average
- Count distinct elements in every window of size k
- Find all windows with sum equal to target

**Test Cases:**
- Array: [1, 4, 2, 9, 5], k=3 → Windows: [1,4,2]→7, [4,2,9]→15, [2,9,5]→16
- Maximum sum window: [4, 2, 9] with sum 15

---

## Problem 15: Array Compression and Encoding
**File:** `Arrays15.java`

**Description:** Implement array compression techniques.

**Requirements:**
- Run-length encoding for arrays
- Compress consecutive identical elements
- Decompress encoded arrays
- Calculate compression ratio
- Handle edge cases (no repetition, all same elements)

**Test Cases:**
- Array: [1, 1, 1, 2, 2, 3, 3, 3, 3] → Encoded: [(1,3), (2,2), (3,4)]
- Decompress back to original array

---

## Problem 16: Array Partitioning Problems
**File:** `Arrays16.java`

**Description:** Partition arrays based on various criteria.

**Requirements:**
- Partition around a pivot element
- Partition into k equal sum subarrays (if possible)
- Partition into two subarrays with minimum difference
- Three-way partitioning (Dutch national flag)
- Partition into increasing subsequences

**Test Cases:**
- Array: [3, 1, 4, 1, 5, 9, 2, 6], Pivot: 4 → Smaller: [3,1,1,2], Equal: [4], Larger: [5,9,6]

---

## Problem 17: Array Permutation Generator
**File:** `Arrays17.java`

**Description:** Generate and work with array permutations.

**Requirements:**
- Generate all permutations of an array
- Find next lexicographic permutation
- Find previous lexicographic permutation
- Check if one array is permutation of another
- Count total possible permutations

**Test Cases:**
- Array: [1, 2, 3] → All permutations: [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]
- Next permutation of [1, 2, 3] → [1, 3, 2]

---

## Problem 18: Sparse Array Operations
**File:** `Arrays18.java`

**Description:** Work with sparse arrays (arrays with many zeros).

**Requirements:**
- Implement sparse array representation
- Add two sparse arrays
- Transpose sparse matrix
- Convert between dense and sparse representation
- Calculate memory savings

**Test Cases:**
- Dense: [0, 0, 3, 0, 4] → Sparse: [(2,3), (4,4)]
- Add two sparse arrays efficiently

---

## Problem 19: Array Gaming Problems
**File:** `Arrays19.java`

**Description:** Solve game-related array problems.

**Requirements:**
- Jump game: can you reach the end? (each element represents max jump)
- Minimum jumps to reach end
- Collect maximum coins while jumping
- Water trapping problem (calculate trapped rainwater)
- Stock buy-sell for maximum profit

**Test Cases:**
- Jump array: [2, 3, 1, 1, 4] → Can reach end: Yes, Min jumps: 2
- Stock prices: [7, 1, 5, 3, 6, 4] → Max profit: 5 (buy at 1, sell at 6)

---

## Problem 20: Advanced Array Algorithms
**File:** `Arrays20.java`

**Description:** Implement advanced array algorithms.

**Requirements:**
- Boyer-Moore majority element algorithm
- Kth largest/smallest element using QuickSelect
- Median of two sorted arrays
- Longest increasing subsequence
- Maximum difference between two elements

**Test Cases:**
- Array: [3, 3, 4, 2, 4, 4, 2, 4, 4] → Majority element: 4
- Find 3rd largest element efficiently
- LIS in [10, 9, 2, 5, 3, 7, 101, 18] → Length: 4

---

## Testing Your Solutions

For each problem, test with:
1. **Empty arrays** - handle gracefully
2. **Single element** - edge case testing
3. **All same elements** - uniform data
4. **Sorted arrays** - ascending and descending
5. **Random data** - mixed positive/negative numbers
6. **Large arrays** - performance testing

## Array Concepts to Master

1. **Array Declaration and Initialization**
2. **Array Traversal** - forward, backward, nested
3. **Array Searching** - linear, binary, interpolation
4. **Array Sorting** - bubble, selection, insertion, merge, quick
5. **Array Manipulation** - insertion, deletion, rotation
6. **Multi-dimensional Arrays** - 2D, 3D operations
7. **Dynamic Arrays** - ArrayList operations

## Common Array Patterns

1. **Two Pointers**: Start and end pointers moving towards each other
2. **Sliding Window**: Fixed or variable size windows
3. **Divide and Conquer**: Split array and solve subproblems
4. **Prefix/Suffix Arrays**: Precompute cumulative information
5. **Hash Tables**: Use HashMap for frequency/occurrence tracking

## Performance Analysis

- **Time Complexity**: Analyze Big O for different operations
- **Space Complexity**: Consider extra space usage
- **In-place vs Extra Space**: Trade-offs between space and time
- **Stable vs Unstable**: Sorting algorithm properties

## Memory Management

- Array size limitations
- Memory allocation patterns
- Garbage collection considerations
- Memory-efficient algorithms

## Next Steps

After completing these problems:
1. Explore ArrayList and other Collection classes
2. Practice with more complex data structures
3. Study advanced algorithms textbooks
4. Solve competitive programming problems
5. Move to Object-Oriented Programming exercises

Remember: Arrays are the foundation of many data structures. Master these concepts thoroughly as they form the basis for more complex algorithms and data structures!
