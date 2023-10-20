import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        int m = 3, n = 3;
        sol.merge(nums1, m, nums2, n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int k = 0, i = 0, j = 0;
        int[] results = new int[m + n];
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                results[k] = nums1[i];
                i++;
            }else{
                results[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < m){
            results[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            results[k] = nums2[j];
            j++;
            k++;
        }

        System.out.println("nums1 = " + Arrays.toString(nums1) + ", m = " + m + ", nums2 = " + Arrays.toString(nums2) + ", n = " + n);
        System.out.println("result = " + Arrays.toString(results));

    }
}
