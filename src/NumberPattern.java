
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*   1
		 *   2 3
		 *   4 5 6
		 *   7 8 9 10
		 */
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
		}
		
		
		
		int l=10;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(l+" ");
				l--;
			}
			System.out.println("");
		}
		
		/*    10 9 8 7
		 *    6 5 4
		 *    3 2
		 *    1
		 */
		int m=10;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(m+" ");
				m--;
			}
			System.out.println("");
		}
	}

}
