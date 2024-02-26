public class Solution {
    public static int majorityElement(int []v) {
        int elem=0;
        int count=0;
        for(int i=0;i<v.length;i++){
            if(count==0){
                count=1;
                elem=v[i];
            }
            else if(elem==v[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int cnt=0;
        for(int i=0;i<v.length;i++){
            if(v[i]==elem){
                cnt++;
            }
        }
        if(cnt>v.length/2){
            return elem;
        }
        else{
            return -1;
        }
    }
}
