import java.util.*;
public class XPattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		char[] n=s.toCharArray();
		int l=0,len=s.length(),r=len-1;
		for(int j=0;j<len;j++){
		for(int i=0;i<len;i++){
			if(i==l || i==r)
				System.out.print(n[i]);
			else
				System.out.print(" ");
		}
		l++;
		r--;
		System.out.println();
	}
	}
}