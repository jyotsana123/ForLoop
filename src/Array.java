
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sort array in ascending order
		int a[] = {4,5,1,2,0,7,8};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
