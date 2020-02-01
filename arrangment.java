import java.util.*;
public class arrangment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     while(a>0)
     {
    	 int count=0,count1=0;
    	 int size=sc.nextInt();
    	 int b[]=new int[size];
    	 int c[]=new int[size];
    	 for(int i=0;i<size;i++)
    	 {
    		 b[i]=sc.nextInt();
    	 }
    	 for(int i=0;i<size;i++)
    	 {
    		 c[i]=b[i];
    	 }
    	 for(int i=0;i<size;i++)
    	 {
    		 if(i%2==0)
    		 {
    			 b[i]=c[size-1-count];
    			 count++;
    		 }
    		 else
    		 {
    			 b[i]=c[count1];
    			 count1++;
    		 }
    	 }
    	 for(int i=0;i<size;i++)
    	 {
    		 System.out.print(b[i]);
    	 }
    	 a--;
     }
	}

}
