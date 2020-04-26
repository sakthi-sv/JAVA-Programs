import java.util.*;
public class SubString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int m=s1.length();
		int n=s2.length();
		for (int i=0;i<m-n;i++ ) {
			for(int j=0;j<n;j++){
				if(s1.charAt(i+j)!=s2.charAt(j))
					break;
				if(j==n)
					System.out.println(i);
			}
		}
	}
}