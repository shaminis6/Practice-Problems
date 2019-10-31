package ArraysAndStrings;

public class RotateMatrix {
	
	public static int[][] rotate(int mat[][], int N)
	{
		for(int x=0;x<N/2;x++)
		{
			for(int y=x;y<N-1-x;y++)
			{
				//store current value
				int temp=mat[x][y];
				
				//move from right to top
				mat[x][y] = mat[y][N-1-x];
				
				//move from bottom to right
				mat[y][N-1-x] = mat[N-1-x][N-1-y];
				
				//move from left to bottom
				mat[N-1-x][N-1-y] = mat[N-1-y][x];
				
				//store top value to left
				mat[N-1-y][x] = temp;
			}
		}
		return mat;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat={
				{1, 2, 3, 4}, 
	            {5, 6, 7, 8}, 
	            {9, 10, 11, 12}, 
	            {13, 14, 15, 16} 
				};
		mat= rotate(mat, 4);
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat.length;j++)
			{
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
