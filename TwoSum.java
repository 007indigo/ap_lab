class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int s=0;
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j]) == target)
                {
                    System.out.println("["+i+","+j+"]");
                    s=-1;
                    a[0]=i;
                    a[1]=j;
                }

            }
        }
        if(s==-1)
            System.out.println("0");
        return a;
    }
}
