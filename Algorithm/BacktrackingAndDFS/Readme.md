#### What is backtracking?
	* Backtracking is an algorithm used to iterate over all possible solutions
	in the search space.

#### What are the applications of backtracking?
	* Backtracking is widely used to solve crosswords, Sudoku, chess, tic-tac-toe, and other puzzles.
	* It's also useful when generating all the combinations of elements from a given set.

#### What is Depth-First-Search?
	* DFS is an algorithm used to traverse or search tree or graph data structures.
	* DFS starts at the root node and explores as far as possible along each branch before backtracking.
		* The basic idea is to start from the root or any arbitrary node
			* Mark the node
			* Move to the adjacent node
			* Continue this loop until there is no unmarked adjacent node.
			* Then backtrack and check for other unmarked nodes and traverse them. * Finally, print the nodes in the path.

#### What are the applications of DFS?
	* Detecting or finding cycle in a graph
	* Finding a path between two given vertices u and z
	* Finding strongly connected components of a graph
		* A directed graph is called strongly connected if there is a path from 		each vertex in the graph to every other vertex.
	* Solving puzzles with only one solution such as mazes.
	* Topological Sort

#### What is the difference between graphs and trees?
	* The main difference between graphs and trees is that graphs may contain cycles.

#### What is the difference between backtracking and DFS?
	* Backtracking:
		* can be applied to any data structure
		* general technique for dealing with constraint problems
		* can stop searching the tree if the constraint is not met.

	* Depth-First-search:
		* Restricted to graphs and trees
		* Algorithm used to iterate over a graph or tree
		* Has to reach the leaf node before returning.


References: 
* https://www.baeldung.com/cs/backtracking-vs-dfs
* https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
* https://www.geeksforgeeks.org/applications-of-depth-first-search/