class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int a[]=new int[gain.length+1];
        a[0]=0;
        a[1]=gain[0];
        for(int i=2;i<gain.length+1;i++){
            a[i]=a[i-1]+gain[i-1];
            

        }
        for(int i=0;i<gain.length+1;i++){
            if(a[i]>high){
                high=a[i];
            }
        }
        return high;
    }
}