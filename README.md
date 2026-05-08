# Assignment-3

## Project Overview
This project focuses on the implementation and performance analysis of three fundamental algorithms from distinct categories (Basic Sorting, Advanced Sorting, and Searching) as discussed in the course lectures.

---

# Selected Algorithms

## 1. Category A: Basic Sorting — Bubble Sort
**Description:**  
Bubble Sort is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

**Time Complexity:** `O(n²)`

---

## 2. Category B: Advanced Sorting — Quick Sort
**Description:**  
Quick Sort is a Divide and Conquer algorithm that selects a pivot element and partitions the array around that pivot.

**Time Complexity:** `O(n log n)`

---

## 3. Category C: Searching — Linear Search
**Description:**  
Linear Search is a brute-force searching method that checks each element sequentially until the target value is found.

**Time Complexity:** `O(n)`

---

# Experimental Results

| Array Size | Bubble Sort | Quick Sort | Linear Search |
|------------|-------------|-------------|----------------|
| 10         | 3500        | 4200        | 1100           |
| 100        | 134200      | 19000       | 1100           |
| 1000       | 3024000     | 243100      | 7200           |

---

# Analysis

## Which sorting algorithm performed faster?
Quick Sort performed significantly faster on medium and large datasets. Although Bubble Sort was slightly faster for a very small array (10 elements) because of lower overhead, Quick Sort became much more efficient as the input size increased.

## Performance vs. Input Size
When the array size increased from 10 to 1000 elements, Bubble Sort’s execution time increased dramatically, showing the effect of quadratic growth: `O(n²)`.

In contrast, Quick Sort showed much slower growth because of its logarithmic behavior: `O(n log n)`.

This confirms that Quick Sort is more scalable and suitable for larger datasets.

## Search Efficiency
Linear Search remained relatively fast for the tested input sizes. However, its running time increased proportionally with the size of the array, consistent with `O(n)`.

This means Linear Search is acceptable for small datasets but becomes less efficient for very large collections compared to more advanced searching techniques.