class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // int i = 0;
        // int j = 0;
        // int id = 0;

        // int[] res = new int[m + n];

        // while (i < m && j < n) {

        //     if (nums1[i] <= nums2[j]) {
        //         res[id] = nums1[i];
        //         i++;
        //         id++;
        //     } else {
        //         res[id] = nums2[j];
        //         id++;
        //         j++;
        //     }
        // }

        // while (j < n) {
        //     res[id] = nums2[j];
        //     id++;
        //     j++;
        // }

        // while (i < m) {
        //     res[id] = nums1[i];
        //     id++;
        //     i++;
        // }

        // for (int k = 0; k < m + n; k++) {
        //     nums1[k] = res[k];
        // }

        int i=m-1;
        int j=n-1;;
        int x=m+n-1;

        while(i >=0 && j >=0){
          if(nums1[i] > nums2[j]){
            nums1[x]=nums1[i];
            i--;
            x--;
          }else{
            nums1[x]=nums2[j];
            j--;
            x--;
          }
        }
        while(j >=0){
            nums1[x]=nums2[j];
            j--;
            x--;
        }
    }
}