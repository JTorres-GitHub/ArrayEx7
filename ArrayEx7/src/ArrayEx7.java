import java.util.Arrays;

public class ArrayEx7 {
	public static int addFirstTwo(int[] nums){
		int sum;
		
		if(nums.length >= 2)
			sum = nums[0] + nums[1];
		else if(nums.length == 1)
			sum = nums[0];
		else
			sum = 0;
		
		return sum;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{1, 2, 3};
		int[] array2 = new int[]{1, 1};
		int[] array3 = new int[]{1, 1, 1, 1};
		int[] array4 = new int[]{5};
		
		System.out.println(addFirstTwo(array1));
		System.out.println(addFirstTwo(array2));
		System.out.println(addFirstTwo(array3));
		System.out.println(addFirstTwo(array4));
	}
}
