/**
 * 
 */

/**
 * @author       outianchang
 * @date         2024Äê5ÔÂ4ÈÕ
 * @project_name Game
 * @package_name com.edu.seiryo.dao
 * @file_name    GoodsDao.java
 * @classname    
 * @version      
 */
public class Test {
	public int[] test(int[] nums1, int[] nums2){
		int[] result = new int[2];
		int result1 = 0;
		int result2 = 0;
		for(int j = 0; j <= nums1.length; j++){
			for(int i = 0; i <= nums2.length; i++){
				if(nums1[j] == nums2[i]){
					result1++;
					break;
				}
			}
		}
		for(int j = 0; j < nums1.length; j++){
			for(int i = 0; i < nums2.length; i++){
				if(nums1[i] == nums2[j]){
					result2++;
					break;
				}
			}
		}
		result[0] = result1;
		result[1] = result2;
		return result;
	}
	public static void main(String[] args) {
		int[] nums1 = {1,3,4};
		int[] nums2 = {1,3,4};
		int[] a = new Test().test(nums1,nums2);
		System.out.println(a);
	}
}
