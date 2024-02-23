public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int largest=a[0];
        int secondLargest=-1;
        int smallest=a[0];
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }
            else if(a[i]>secondLargest && a[i]!=largest){
                secondLargest=a[i];
            }
            if(a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<secondSmallest && a[i]!=smallest){
                secondSmallest=a[i];
            }
        }
        int[] sol=new int[2];
        sol[0]=secondLargest;
        sol[1]=secondSmallest;
        return sol;
    }
}
