package java_16_06_2005;
import java.util.*;
public class BinarySearchArray {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int[] numbers={1,2,3,4,5,6,7,8,9};
			System.out.print("Enter the Specific Element:");
			int target=sc.nextInt();
			int left=0;
			int right=numbers.length-1;
			boolean found=false;
			
			
			while(left<=right) {
				int mid=(left+right)/2;
				if(numbers[mid]==target) {
					System.out.println("Found"+" "+" "+target+" at index"+" "+mid);
					found=true;
					break;
				}else if(target<numbers[mid]){
					right=mid-1;
				}else {
					left=mid+1;
				}
				
			}
			if(!found) {
				System.out.println("target not found");
				
			}
			
		}

	}

