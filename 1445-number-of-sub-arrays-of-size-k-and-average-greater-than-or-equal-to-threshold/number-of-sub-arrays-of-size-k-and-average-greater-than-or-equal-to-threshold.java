class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,left=0, count=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold) count=1;
        for(int i=k;i<arr.length;i++){
            sum =sum-arr[left++];
            sum=sum+arr[i];
            avg=sum/k;
            if(avg>=threshold) count++;
        }
        return count;
    }
}