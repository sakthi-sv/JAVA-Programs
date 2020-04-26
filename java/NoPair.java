import java.util.*;
public class NoPair{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String n1=sc.nextLine();
		int n=Integer.parseInt(n1);
		String s[]=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.nextLine();
		int[] a=new int[n];
		int i=0;
		int k=0;
		for(String x:s)
			if((k=repeat(x))!=0)
				a[i++]=k;
			else
				a[i++]=0;
		System.out.println(a[0]+" "+a[1]);
	}
	public static int repeat(String  x){
		char[] a=x.toCharArray();int k=0;
		for(int i=0;i<a.length-1;i++)
			if(a[i]==a[i+1]){
				if(i+2<a.length && a[i+1]==a[i+2]){

					i++;k++;
					continue;
				}
				k++;
			}
			
		return k;
	}
}