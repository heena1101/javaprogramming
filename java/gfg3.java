
import java.util.*;
import java.io.*;

class gfg3 {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
        int t;int j;int n;int a[];
        t=sc.nextInt(); 
        for( int i=0;i<t;i++)
        {
        n=sc.nextInt();
        a=new int[n];
        int count=0;int count1=0;int count2=0;
        for(j=0;j<n;j++){
		a[j]=sc.nextInt();
		if(a[j]==0)
		count++;
		if(a[j]==1)
		count1++;
		if(a[j]==2)
		count2++;
		}
        
        for(j=0;j<count;j++)
        System.out.print(0+" ");
		for(j=0;j<count1;j++)
		System.out.print(1+" ");
		for(j=0;j<count2;j++)
		System.out.print(2+" ");
		System.out.println();
	
	
	}
}	
}

   