public class MaximumDiff {
    public int maximumDifference(int[] nums) {
        int out = -1;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] > nums[i] && nums[j]-nums[i]>out){
                    out = nums[j]-nums[i];
                }
            }
        }
        return out;
    }
}
