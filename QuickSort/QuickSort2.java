package sorting;

import java.util.Scanner;

public class QuickSort2 {
	static void quickSort(int []ar)
    {
        partition(ar,ar.length,0);                        
    }
    static void partition(int[] ar,int l,int f) {
        if(l-f>1)
        {
              int p=ar[f],q=0;
        int a[]=new int[ar.length];
        for(int i=f;i<l;i++)
        {
            if(ar[i]<p)
            {
                a[q++]=ar[i];
            }
        }
        a[q++]=p;
        int m=0;
        for(int i=f+1;i<l;i++)
        {
            if(ar[i]>=p)
            {
                a[q++]=ar[i];
            }
        }
        int j=0;
        for(int i=f;i<l && j<a.length;i++,j++)
        {
            ar[i]=a[j];
            if(ar[i]==p)
                m=i;
        }
        partition(ar,m,f);
        partition(ar,l,m+1);
        printArray(ar,l,f);
        }
 }   

static void printArray(int[] ar,int l,int f) {
   for(int n=f;n<l;n++){
      System.out.print(ar[n]+" ");
   }
     System.out.println("");
}
 
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int[] ar = new int[n];
     for(int i=0;i<n;i++){
        ar[i]=in.nextInt(); 
     }
     quickSort(ar);
     in.close();
 }   

}
