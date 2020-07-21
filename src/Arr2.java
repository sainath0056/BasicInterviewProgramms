import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Arr2 {


	public static void main(String[] args) {
		
		 int num = 0,n,r,c;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		 n=num;
		 for(r=1; r<=num; r++,n--)
		 {
		   for(c=1; c<r; c++)
			   System.out.println("0");
		   for(c=1; c<=n; c++)
		   {
		      if(c==1)
		         System.out.println("*");
		      else
		         System.out.println("0");
		   }
		   System.out.println("*");
		   for(c=1; c<n; c++)
		      System.out.println("0");
		   for(c=1; c<=r; c++)
		   {
		      if(c==1)
		         System.out.println("*");
		      else
		         System.out.println("0");
		   }
		   System.out.println("\n");
		 }
//		 getch();
          return;
//		

		
	}

}
