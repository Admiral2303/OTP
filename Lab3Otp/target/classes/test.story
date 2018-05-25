Scenario: Expression with matrix
Given matrixAnalyzer
When matrix A=[[5,2],[1,2]]
Then should equal [ 5 2 ][ 1 2 ]
When matrix B=[[3,4],[5,8]]
Then should equal [ 3 4 ][ 5 8 ]
When matrix L=[[5,8].
Then should equal null
When matrix L=[[5]
Then should equal String index out of range: 7
When matrix 55=[[5,8]]
Then should equal 55
When matrix A
When matrix [ 5 2 ][ 1 2 ]
When matrix W
When matrix Variable is not defined
When matrix A=[[8,9],[5,4]]
Then should equal [ 8 9 ][ 5 4 ]
When matrix C=[[1,1],[1,1]]
Then should equal [ 1 1 ][ 1 1 ]
When matrix K=C*5
Then should equal [ 5 5 ][ 5 5 ]
When matrix A+B
Then should equal [ 11 13 ][ 10 12 ]
When matrix A^T
Then should equal [ 8 5 ][ 9 4 ]
When matrix A*B
Then should equal [ 69 104 ][ 35 52 ]
When matrix k=5
Then should equal 5

Scenario: Expression with matrix operations
When matrix [[8,9],[5,4]]^T*[[3,4],[5,8]]+[[1,1],[1,1]]*5
Then should equal [ 54 77 ][ 52 73 ]
When matrix A^T*B+C*k
Then should equal [ 54 77 ][ 52 73 ]
When matrix D=A^T*B+C*k
Then should equal [ 54 77 ][ 52 73 ]
When matrix D
Then should equal [ 54 77 ][ 52 73 ]
When matrix [[8,9],[55]^T*[[3,4],[5,8]]+[[1,1],[1,1]]*5
Then should equal Variable is not defined
When matrix A^T*B+V*t
Then should equal Variable is not defined