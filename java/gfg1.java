import java.util.Scanner;


public class gfg1{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t,i,n,l,key=0;
        t=sc.nextInt();
        for(i=0;i<t;i++){
            n=sc.nextInt();
            int a[]=new int[n];
            int value=0,j;
            for(j=0;j<n;j++){
                if(a[j]==key)
                    value++;
            }
            System.out.println(value);
            


        }
    }
}
