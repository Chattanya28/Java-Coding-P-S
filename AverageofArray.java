public double average(int[] nums) {
    // Handle empty array case
    if (nums == null || nums.length == 0) {
        return 0.0;
    }
    
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
    
    return (double) sum / nums.length;
}