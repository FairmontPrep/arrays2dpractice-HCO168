public class Array
{
	public static final String spaceString="                                 ";
	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
	public int[][] getRowMajorSquare(int x)
	{
		int count=1;
		int[][] result=new int[x][x];
		for(int row=0;row<x;row++){
			for(int col=0;col<x;col++){
				result[row][col]=count;
				count++;
			}
		}
		return result;
	}

	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
	public int[][] getColumnMajorSquare(int x)
	{
		int count=1;
		int[][] result=new int[x][x];
		for(int col=0;col<x;col++){
			for(int row=0;row<x;row++){
				result[row][col]=count;
				count++;
			}
		}
		return result;
	}

	// Array should be of format
	// 1 2 3 4
	// 5 6 7 8
	// 9 10 11 12
	public int[][] getRowMajorRectangle(int row, int column)
	{
		int count=1;
		int[][] result=new int[row][column];
		for(int r=0;r<row;r++){
			for(int c=0;c<column;c++){
				result[r][c]=count;
				count++;
			}
		}
		return result;
	}

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
	public int[][] getColumnMajorRectangle(int column, int row)
	{
		int count=1;
		int[][] result=new int[row][column];
		for(int c=0;c<column;c++){
			for(int r=0;r<row;r++){
				result[r][c]=count;
				count++;
			}
		}
		return result;
	}

	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
	public void printDouble(int[][] a)
    {
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a[row].length;col++){
				System.out.print(a[row][col]+getSpaces(3-getDigits(a[row][col])));
			}
			System.out.print("\n");
		}
	}
	public int getDigits(int n){
		return ((int) Math.log10(n))+1;
	}
	public String getSpaces(int n){
		return spaceString.substring(0,n);
	}
}