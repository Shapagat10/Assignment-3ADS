# Assignment-3
## Project Overview
This project focuses on the implementation and performance analysis of three fundamental algorithms from distinct categories (Basic Sorting, Advanced Sorting, and Searching) as discussed in the course lectures.

## Selected Algorithms

### 1. Category A: Basic Sorting - Bubble Sort
* **Description:** A simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
* **Time Complexity:** O(n^2)


### 2. Category B: Advanced Sorting - Quick Sort
* **Description:** A Divide and Conquer algorithm that picks an element as a 'pivot' and partitions the given array around the picked pivot.
* **Time Complexity:** 0(n \log n) 

### 3. Category C: Searching - Linear Search
* **Description:** A brute-force search method that checks every element in the array sequentially until a match is found.
* **Time Complexity:** O(n)

## Experimental Results

| Array Size | Bubble Sort | Quick Sort | Linear Search
| :--- |:------------|:-----------| 
| 10 | 3500        | 4200       | 1100
| 100 | 134200      | 19000      | 1100
| 1000 | 3024000     | 243100     | 7200

## Analysis
Which sorting algorithm performed faster? Quick Sort performed significantly faster on medium and large datasets.
While Bubble Sort was slightly faster for a very small array (10 elements) due to lower overhead, Quick Sort's $O(n \log n)$ efficiency
became clear as the size increased.
Performance vs. Input Size: As the input size grew 100x (from 10 to 1000), Bubble Sort's time increased by nearly 860x, while Quick Sort's time increased by only about 57x, confirming the difference between quadratic and logarithmic growth.Search 
Efficiency: Linear Search remained very fast for these sizes, but its time increased proportionally with the array size ($O(n)$)