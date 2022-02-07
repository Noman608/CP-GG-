
class Solution {
    public int binomialCoeff(int n, int k){
        if(k==0||k==1)
            return 1;
        return binomialCoeff(n-1,k-1)+binomialCoeff(n-1,k);
    }
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<Long> result = new ArrayList<Long>();
        for(int line = 0 ; line < 0 ; line++ ){
            for(int i=0;i<=line;i++){
                result.add(Long.valueOf(binomialCoeff(line,i)));
            }
        }
        return result;
    }
   
}
