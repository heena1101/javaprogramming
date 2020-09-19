import java.util.Scanner;
public class luna1 {
    public static void main(final String args[]){
        Scanner sc=new Scanner(System.in);
        int i;int key;int a[];int n;int j;int temp;int p;
        key=sc.nextInt();
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                  temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
                  p=a[j]+a[j+1];
                  if(p==key){
                      System.out.println("true");
                  }
                }

                
            
            }
        }

    }
    
}
