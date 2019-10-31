package ArraysAndStrings;

public class ZeroMatrix {
	
	public static int[][] replaceZeros(int[][] mat, int M,int N)
	{
		boolean rows[]=new boolean[M];
		boolean columns[]=new boolean[N];
		
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(mat[i][j]==0)
				{
					rows[i]=true;
					columns[j]=true;
				}
			}
		}
		
		//Rows
		for(int l=0;l<rows.length;l++)
		{
			if(rows[l])
			{
				for(int b=0;b<M;b++)
				{
					mat[l][b]=0;
				}
			}
		}
		
		//Columns
		for(int q=0;q<columns.length;q++)
		{
			if(columns[q])
			{
				for(int r=0;r<N;r++)
				{
					mat[r][q]=0;
				}
			}
		}
		return mat;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {
				{1,2,0},
				{2,4,5},
				{1,1,1}
		};
		int[][] result=replaceZeros(mat,3,3);
		for(int b=0;b<3;b++)
		{
			for(int x=0;x<3;x++)
			{
				System.out.print(result[b][x] + " ");
			}
			System.out.println();
		}

	}

}
