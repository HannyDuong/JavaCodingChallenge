#### What is algorithm in computing?
	Algorithm is a sequence of computational steps that transform the input into the output  

#### What kinds of problems are solved by algorithms?
	There are number of problems such as:
	* For data analysis
	* For managing and manipulating large volume of data
	* Search engine
	* Sorting
	* And so on
	
#### Which algorithm is used to sort?
	* Insertion sort
	* Merge sort
	* Quick sort
	
#### For which values of n does insertion sort beat merge sort?
	* Insertion sort runs faster than merge sort for small input size
	* Merge sort is faster than  insertion sort for large input size
	* When  2<n<= 43 , insertion sort beat merge sort
	* Calculating : https://atekihcan.github.io/CLRS/01/E01.02-02/
	
#### What is QuickSort algorithm?
	* Like MergeSort, QuickSort is a Divide and Conquer algorithm.
	* It picks an element as pivot and partitions the given array around the picked pivot.
	* Such as: elements less than pivot, pivot, and then elements greater than pivot
	* Note: the array is parted into any ratio. There is no compulsion of dividing the array into equal parts.
	* There are many ways to choose a pivot:
		* Pick the first element as pivot
		* Pick the last element as pivot
		* Pick median as pivot
		* Pick random element as pivot
		
	* Complexity
		* Average: O(nlgn)
		* Worse case: O(n^2)
	* QuickSort is popular for sorting large input arrays and works faster than MergeSort for smaller datasets.


#### What is comparison sort?
	* Comparison sort determine the sorted order of an input array by comparing elements.
	* Examples: Insertion sort, merge sort, heapsort, and quicksort

#### What is divide-and-conquer?
	* Divide-and-conquer is an algorithm of solving a large problem by
		* Step 1: Dividing the problem into smaller subproblems
		* Step 2: Solving the subproblems recursively if needed, and
		* Step 3: Combining the solutions of steps 2 to get the desired output.
	
![Running Times](/Algorithm/images/runningtimesofsortingalgorithm.png)