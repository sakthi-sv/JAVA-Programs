import java.io.*;
public class Tree{
	public static void main(String args[]) throws IOException{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()); 
		Tree t=new Tree();
		t.print_pry(n);
		t.printr_pry(n);
		t.printralign(n);
		t.printr_align(n);
		t.print_tri(n);
		t.printr_tri(n);
	}
	void print_pry(int n){
				for(int i=0;i<n;i++){
					for(int j=0;j<=i;j++){
						System.out.print("*");
					}
					System.out.println();
				}
	}

	void printr_pry(int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i;j++){
				System.out.print("*");
			}
		System.out.println();
	    }
	}
	void printralign(int n){
		for(int i=0;i<n;i++){
			for(int j=n-i;j>1;j--)
				System.out.print(" ");
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
		    System.out.println();
		}
	}
	void printr_align(int n){
		for(int i=0;i<n;i++){
			
			for(int j=n-i;j>0;j--){
				System.out.print("*");
			}
		System.out.println();
		for(int j=0;j<=i;j++)
				System.out.print(" ");
		}
		System.out.println();
	}

	void print_tri(int n){
				for(int i=1;i<=n;i++){
			for(int j=1;j<n-i+1;j++)
				System.out.print(" ");
			for(int j=1;j<2*i;j++){
				System.out.print("*");
			}
		System.out.println();
	}
	}
	void printr_tri(int n){
		for(int i=0;i<n;i++){
			
			for(int j=2*(n-i)-1;j>0;j--){
				System.out.print("*");
			}
		System.out.println();
		for(int j=0;j<=i;j++)
				System.out.print(" ");
	}
	}
}