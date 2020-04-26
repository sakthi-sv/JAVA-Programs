import java.util.*;
public class MergeSort{

public static void main(String args[]) throws Exception{
	Scanner s=new Scanner(System.in);
	String a1=s.nextLine();
	String a2=s.nextLine();
	String[] a=a1.split(" ",0);
	String[] b=a2.split(" ",0);
	MergeSort m=new MergeSort();
	m.merge(a,b);
}
 void  merge(String[] a,String[] b){
		int i=0,j=0,k=0;
		int l=a.length+b.length;
		int[] c=new int[l];
		while(i<a.length && j<b.length){
					

			if(a[i].compareTo(b[j])<0)				
				c[k++]=Integer.parseInt(a[i++]);
			else if(a[i].compareTo(b[j])>0)
				c[k++]=Integer.parseInt(b[j++]);
			else{
				c[k++]=Integer.parseInt(b[j++]);
				i++;
			}		

		}
		while(i<a.length)
				c[k++]=Integer.parseInt(a[i++]);
		while(j<b.length)
				c[k++]=Integer.parseInt(b[j++]);
		i=0;
		while(i<c.length)
			System.out.println(c[i++]);
			
}
}