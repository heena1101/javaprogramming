import java.util.Scanner;
public class gfg4 {
    public static void main(final String args[]) {
         Scanner sc = new Scanner(System.in);
        int a[];int t;int n;int key;int j;int i;int temp;
        t=sc.nextInt();
       
        for(i=0;i<t;i++)
        {
            n=sc.nextInt();
            a=new int[n];
            key=sc.nextInt();
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            if(key<n)
            {
                for(i=0;i<n-1;i++)
                {
                    for(j=0;j<n-i-1;j++)
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=a[j];
                        if(key==i)
                        {
                            System.out.println(a[i]);
                        }
                        
                    }
                }  
            
            }
            
            
               
            
        }

    }
    
}
