public class Solution {
    public static int isSorted(int n, int []a) {
        boolean bool=true;
        for(int i=0;i<n-1;i++){
            if(a[i+1]>=a[i]){
                bool=true;
            }
            else{
                bool=false;
                break;
            }
        }
        if(bool){
            return 1;
        }
        else{
            return 0;
        }
    }
}
