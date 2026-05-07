class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int  j =0;
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
                count++;
            }
        }
        return count;
    }
}