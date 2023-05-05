import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,5,2,4,6,2,8};
        Arrays.sort(a);
        for(int sortedarr : a)
        {
            System.out.println(sortedarr);
        }
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]!=a[i+1])
        	{
        		if(a[i+1]!=a[i+2])
        		{
        			System.out.println(a[i+2]);
        			break;
        		}
        	}
        }
	}

}
