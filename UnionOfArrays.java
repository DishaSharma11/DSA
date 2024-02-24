import java.util.*;

public class Solution {
    public static List<Integer> sortedArray(int[] a, int[] b) {
        // Write your code here
        int i = 0, j = 0; // pointers
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (a[i] <= b[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != a[i])
                    Union.add(a[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != b[j])
                    Union.add(b[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != a[i])
                Union.add(a[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != b[j])
                Union.add(b[j]);
            j++;
        }
        return Union;
    }
}
