import java.util.Scanner;
//Kadane Algorithm
public class MaxSum_SubArray {          
    public static void main(String args[]){
        int i;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Max_Sum = "+Max_sum(a));

    }
    static int Max_sum(int a[]){
        int sum=a[0],max=a[0];
       for(int i=1;i<a.length;i++){
           if(a[i]<sum+a[i]){
            sum+a[i];
          }
          else{
            a[i];
          }
           if(max<sum)
               max=sum;
       }
       return max;
    }
}
