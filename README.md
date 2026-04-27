# Assignment-3

## Project Overview
Implementation and performance analysis of sorting and searching algorithms based on lecture materials.

## Algorithms
* **Bubble Sort:** Simple sorting by swapping adjacent elements (O(n^2)).
* **Selection Sort:** Finds the minimum and moves it to the front (O(n^2)).
* **Linear Search:** Brute-force searching through the array (O(n)).

## Results (Time in ns)
| Size | Bubble Sort | Selection Sort |
| :--- | :--- | :--- |
| 10 | 11800 | 8800 |
| 100 | 185100 | 100600 |
| 1000 | 2752900 | 1029400 |

## Reflection
Selection Sort proved to be faster on 1000 elements because it performs fewer swaps than Bubble Sort.