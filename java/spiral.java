import java.util.*;
public class spiral {


	public static void main(String args[])
    {
		System.out.println("Enter The Value For N :");
		
		Scanner sc = new Scanner(System.in);
		
        int m = sc.nextInt();
        int n=sc.nextInt();
		
		int  a[][]  = new int[m][n];
		
		int value = 1;
		
		int l= 0;
		
		int n;
		
		int k = 0;
		
		int  m;
		
		while (k<m && l<n)
		{
			for (int i = k; i <= n; i++)
			{
				a[k][i] = value;
					
				value++;
            }
            l++;
			
			for (int i = k+1; i <= m; i++) 
			{ 
				a[i][n] = value; 
				
				value++; 
            } 
            k++;
			
			for (int i = n-1; i >= l; i--)
			{
				a[m][i] = value;
							
				value++;
            }
            n--;
			
			for (int i = m-1; i >= k+1; i--) 
			{
				a[i][l] = value;
				
				value++;
            }
            m--;
			
			
			
			
			
			
			
			
		}
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
			
			System.out.println();
		}
    }
}
    
