import java.util.*;
public class ReverseWord{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] x=a.split(" ",50);
					System.out.println(x.length);	

		for(int i=x.length-1;i>=0;i--)
			System.out.print(x[i]+" ");	
	}
}