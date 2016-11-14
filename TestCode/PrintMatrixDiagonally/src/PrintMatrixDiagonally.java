class PrintMatrixDiagonally {
 
	public static void main(String[] args) {
		int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
               {9, 10, 11, 12},
               {13, 14, 15, 16},
                {17, 18, 19, 20},
               };
		printMatrixDiagonally(mat, 5, 4);
 
	}
 
	public static void printMatrixDiagonally(int[][] mat, int rows, int cols){
 
		for(int r=0; r<rows; r++){
			for(int i=r,j=0;j<cols&&i>=0;i--,j++){
			/*	System.out.print("j ="+j);
				System.out.print("i="+i);*/
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
 
		for(int c=1;c<cols;c++){
			for(int j=c,i=rows-1;j<cols&&i>=0;i--,j++){
			/*	System.out.print("j ="+j);
				System.out.print("i="+i);*/
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
 
	}
 
}