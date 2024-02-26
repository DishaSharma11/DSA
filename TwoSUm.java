import java.util.*;
public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        int i=0;
        int j=n-1;
        Arrays.sort(book);
        boolean bool=true;
        while(i<j){
            int sum=book[i]+book[j];
            if(sum<target){
                i++;
                bool=false;
            }
            if(sum>target){
                j--;
                bool=false;
            }
            if(sum==target){
                bool=true;
                break;
            }
        }
        if(bool){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}
