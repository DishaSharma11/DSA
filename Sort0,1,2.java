import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
       int cnt0=0;
       int cnt1=0;
       int cnt2=0;
       for(int i=0;i<n;i++){
           if(arr.get(i)==0){
               cnt0++;
           }
           if(arr.get(i)==1){
               cnt1++;
           }
           if(arr.get(i)==2){
               cnt2++;
           }
       }
       for(int i=0;i<cnt0;i++){
           arr.set(i,0);
       }
       for(int i=cnt0;i<cnt0+cnt1;i++){
           arr.set(i,1);
       }
       for(int i=cnt0+cnt1;i<n;i++){
           arr.set(i,2);
       }
        
    }
}
