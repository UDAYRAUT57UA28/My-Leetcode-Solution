class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        int[] arr = new int[m+n];
        while(n1<m && n2<n){
            if(nums1[n1]<=nums2[n2]){
                arr[k] = nums1[n1];
                n1++;
            }else{
                arr[k] = nums2[n2];
                n2++;
            }
            k++;
        }
        while(n1<m){
            arr[k] = nums1[n1];
            n1++;
            k++;
        }while(n2<n){
            arr[k] = nums2[n2];
            n2++;
            k++;
        }
        for(int i= 0;i<m+n;i++){
            nums1[i] = arr[i];
        }
        
    }
}