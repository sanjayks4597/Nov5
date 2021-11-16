
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] nums= {3,2,3};
		  
		  s.charAt(0);
		  int n=nums.length;
	        for(int i=0;i<n-1;i++)
	        {
	            int min_index=i;
	            for(int j=i+1;j<n;j++)
	            {
	                if(nums[j]<nums[min_index])
	                {
	                    min_index=j;
	                }
	                
	            }
	            int temp=nums[min_index];
	            nums[min_index]=nums[i];
	            nums[i]=temp;
	        }
	        for(int x:nums)
	        {
	        	System.out.print(x+" ");
	        	
	        }
	        System.out.println();
	        int mid=n/2;
	       System.out.println("majority element is:"+nums[mid]);
	}

}
