import java.util.*;
public class sample {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
                int i,n,p,j;
        
                int a[]={10,7,5,1};
                n=sc.nextInt();
                for(i=0;i<n;i++){
                     int b,m=0;
                     b=sc.nextInt();
                    for(j=0;j<a.length;j++){
                        
                        p=b/a[j];
                        b=b%a[j];
                        m=m+p;
                    }
                    System.out.println(m);  
                }
                  
        
        


    }
    
}