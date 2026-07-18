class Solution {
    public String intToRoman(int num) {
        String roman="";
        //ex;num=8
        String[] romanletters={ "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1}  ;
        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i])//8>=values[i]=true here i=10 therfore 8>+=5 is true
            {
                roman=roman+romanletters[i];//""=""+"V"
                num=num-values[i];//8=8-5  num=3  then the loop iterates three times after this to get VIII at last

            }
        }
        return roman;//VIII
        
          }


}