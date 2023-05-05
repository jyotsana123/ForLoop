
public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*   2 4 3
		 *   4 5 1
		 *   Find minimum value, And find maximum value in minimum value coloumn
		 */
		
		int a[][] = {{2,4,3},{4,5,1}};
		int min = a[0][0];
		int mincol=0;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
					mincol = j;
				}
			}
		}
		System.out.println("minimum value is "+min);
		System.out.println("coloumn of minimum value is "+mincol);
		
		int k=0;
		int max = a[0][mincol];
		while(k>0)
		{ 
			if(max<a[k][mincol])
			{
				max = a[k][mincol];
			}
			k++;
		}
		System.out.println("maximum value in coloumn is "+max);
	}

}
