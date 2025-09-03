package test;

public class Test 
{

	public static void main(String[] args) 
		{
			int[] nums = {4, 5, 9, 11, 13, 5, 8, 2, 12, 82};
			int out = 0;
			
			for (int i = 0; i < nums.length; i++)
			{
				if (nums[i]%2 == 0)
				{
					out+=nums[i];
				}
			}
			System.out.println(out);
		}
	}
