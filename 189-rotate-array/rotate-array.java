class Solution {
    public static void reverse(int[] a, int i, int j){
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;

        }
    } 
    public void rotate(int[] nums, int k) {
     k=k%nums.length;
     k=nums.length-1-k;
     reverse(nums,0,k);
     reverse(nums,k+1,nums.length-1);
     reverse(nums,0,nums.length-1);
    }
}