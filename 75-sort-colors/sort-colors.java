class Solution {
    public void sortColors(int[] arr) {
        //dutch natitional flag algo
        int mid=0;int low=0; int high= arr.length-1;int temp =0;
        while(mid<=high)
        {
        if(arr[mid]==0)
        {
            temp =arr[mid];
            arr[mid]=arr[low];
            arr[low]=temp;

            mid++;
            low++;

        }
        else if(arr[mid]==1)
        {
         mid++;
           }
        else
        {
            temp =arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;

            
          high--;

        }
        }

}
}