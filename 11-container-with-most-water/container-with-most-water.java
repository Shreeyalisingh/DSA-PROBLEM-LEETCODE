class Solution {
    public int maxArea(int[] arr) {
        
        int maxarea =0;
        int height =0;
        int area=0;
        int leftptr = 0;
         int rightptr = arr.length-1;

        while(leftptr<rightptr)
        {
            height = Math.min(arr[leftptr], arr[rightptr]);
            area = (rightptr -leftptr)* height;
            maxarea = Math.max(area,maxarea);

            if(arr[leftptr] <= arr[rightptr])
            leftptr++;
            else
            rightptr--;
        }


        
  return maxarea;  }
}