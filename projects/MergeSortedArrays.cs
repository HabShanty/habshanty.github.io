using System;
public class Solution {

    static void Main(string[] args){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        new Solution().Merge(nums1, m, nums2, n);
        Console.WriteLine(string.Join(", ", nums1));
    }
        

    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // Begin at the end of the array
        while ( p1 >= 0 && p2 >= 0){
            if( nums1[p1] > nums2[p2] ){
                nums1[p] = nums1[p1];
                p1--;
            }
            else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // Any remaining numbers in nums2
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

    }
}