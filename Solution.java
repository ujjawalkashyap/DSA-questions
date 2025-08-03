class Solution {
    public static void swap(int[] arr, int trackIndex, int i){
        int temp = arr[i];
        arr[i]= arr[trackIndex];
        arr[trackIndex] = temp; 
    }
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len<=2) return len;
        int index= 1;
        int replaceIndex = 1;
        int count =1;
        int prev = nums[0];
        for(int i=1;i<len;i++){
            if(nums[i]==prev){
                if(count<2){
                    swap(nums, index, replaceIndex);
                    index++;
                    replaceIndex++;
                    count++;
                }
                else{
                    index++;
                    count++;
                }
            }
            else{
                prev = nums[i];
                count=1;
                swap(nums, index, replaceIndex);
                index++;
                replaceIndex++;
            }
            
        }
        return replaceIndex;
    }
}