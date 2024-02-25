public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        int left=0;
        int right=0;
        long sum=a[0];
        int length=0;
        while(right<a.length){
            while(left<=right && sum>k){
                sum=sum-a[left];
                left++;
            }
            if(sum==k){
                length=Math.max(length,right-left+1);
            }
            right++;
            if(right<a.length){
                sum=sum+a[right];
            }
            
        }
        return length;

    }
}
