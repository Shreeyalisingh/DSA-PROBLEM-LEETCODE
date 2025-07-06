class Solution {
    public int maxSubArray(int[] arr) {
        //kadane algo
int maxi=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<arr.length;i++){
    sum = arr[i]+sum;

    if(sum>maxi)
        maxi=sum;

    if(sum<0)
        sum=0;
    }

return maxi;
        
    }
}