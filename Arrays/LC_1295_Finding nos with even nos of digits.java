class Solution {
    public int findNumbers(int[] nums) {
        int even_no=0;
        int count=0;
        int n;
        for(int i=0;i<nums.length;i++){
            count=0;
            n=nums[i];
            while(n>0){
                count=count+1;
                n=n/10;
            }
            if(count%2==0){
                even_no++;
            }
           
        }
        return even_no;
    }
}