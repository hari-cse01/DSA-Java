class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int a[]=new int[2*n];
        for(int i=0,j=n;i<2*n;i+=2,j++){
            a[i]=nums[i/2];
            a[i+1]=nums[j];
        }return a;
        
    }
}