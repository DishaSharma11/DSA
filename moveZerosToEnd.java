public class Solution {
        public static int[] moveZeros(int n, int []a) {
        int[] sol=new int[n];
        int m=0;
        int k=n-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                sol[k]=a[i];
                k--;
            }
            else{
                sol[m]=a[i];
                m++;
            }
        }
        return sol;
    }
}
