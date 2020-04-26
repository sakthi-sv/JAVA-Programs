import java.util.*;
import java.lang.*;


public class Patterns{
	public static void main(String[] args) throws NullPointerException{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		Patterns p=new Patterns();
		//p.matrix(n);
		p.upprmat(n);
	}
	/*public void matrix(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}
	}*/
	public void upprmat(int n){
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i<=j)
					a[i][j]=1;
				else
					a[i][j]=0;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}