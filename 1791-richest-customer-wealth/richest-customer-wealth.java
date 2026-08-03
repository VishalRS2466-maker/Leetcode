class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=0;
        for(int i=0; i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0; j<accounts[i].length;j++)//be careful j<accounts[i].length not accounts.length
            {
                sum=sum+accounts[i][j];//sum of one person wealth
            
            }
            if(sum>result)
            {
                result=sum;//person with max wealth
            }
        }
        return result;

        
    }
}