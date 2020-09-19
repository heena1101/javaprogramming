import java.util.Scanner;
public class gfg5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[];int n;int i;int temp;int j;int key;
        n=sc.nextInt();
        a=new int[n];
        key=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
                }

        System.out.println(a[key]);     
                
                
                
                    
                
            }
            }
            

            
        }
        
            

    } 
