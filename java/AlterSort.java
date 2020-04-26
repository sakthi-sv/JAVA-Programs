import java.util.*;


public class AlterSort{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String a1=s.nextLine();
		String[] a=a1.split(" ",10);
		AlterSort m=new AlterSort();
		m.Altersort(a);

	}
	public int[] sort(String[] x){
		int i,j,temp;
		int[] a=new int[x.length];
		for(i=0;i<x.length;i++)
			a[i]=Integer.parseInt(x[i]);
		for(i=0;i<a.length-1;i++){
			for(j=i;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];	
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public void Altersort(String[] a1){
		int[] a=sort(a1);
		int i,j;
		for(i=0,j=a.length-1;i<j;i++,j--)
			System.out.print(a[i]+" "+a[j]+" ");
		if(a.length%2!=0)
			System.out.print(" "+a[i]);
	}
}