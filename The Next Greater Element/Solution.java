import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int min=99999;
            int k=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j] && (arr[j]-arr[i])<min){
                    k=arr[j];
                    min=arr[i]-arr[j];
                }
            }
            arr[i]=k;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}