package java11_6_2025;

public class KadanesAlgorithm {
	    public static int maxSubArray(int[] nums) {
	        int maxSum = Integer.MIN_VALUE;
	        int currentSum = 0;

	        for (int i = 0; i < nums.length; i++) {
	            currentSum += nums[i];
	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	            }
	            if (currentSum < 0) {
	                currentSum = 0;
	            }
	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        System.out.println("Maximum subarray sum is: " + maxSubArray(arr));
		
		
	}

}
