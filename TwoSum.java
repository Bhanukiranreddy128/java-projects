package java11_6_2025;
import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your elements:");
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.print("Target:");
		int target=sc.nextInt();
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println("["+i+" "+j+"]");
				}
			}
		}
	}
}