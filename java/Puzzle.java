import java.util.*;
public class Puzzle{
	public static void main(String[] args) throws Exception{
			Scanner sc= new Scanner(System.in);
			String str=sc.nextLine();
			String sub=sc.nextLine();
			int col=sc.nextInt();
			int l=str.length();
			int l1=sub.length();
			int i,j,k=0;
			
			int row=getrow(l,col);
			char[][] a=new char[row][];
			for(i=0;i<row;i++){
				for(j=0;j<col && k<l;j++){
					a[i][j]=str.charAt(k++);
				}
			}
			printmat(a,row,col);
	}
	static void printmat(char[][] a,int row,int col){
		for(int i=0;i<row;i++){
			for(int j=0;j<col ;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	static int getrow(int l,int col){
		return ((l/col) + ((l%col==0)?0:1));
	}
}
