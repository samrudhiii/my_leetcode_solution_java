//Concatenation of array

//Solution
import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        
        int n = nums.length;
        int[] ans = new int[2*n];

       
         for(int i=0; i<n; i++){
           ans[i] = nums[i];
           System.out.print(ans[i]);
        }
         for(int i=0; i<n; i++){
           ans[i +n] = nums[i];
           System.out.print(ans[i+n]);
        }

      return ans;  
    }
}
