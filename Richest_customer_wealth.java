//Richest Customer Wealth

//Solution
class Solution {
    public int maximumWealth(int[][] accounts) {
       int maximum = accounts[0] [0];
       for(int cs[] : accounts){
           int current = 0;
           for(int bal : cs) current = current + bal;
           maximum = Math.max(maximum, current);
       }
       return maximum;
    }
}
