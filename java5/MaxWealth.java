package java5;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class MaxWealth {
    public static void main(String[] args) {

    }

    static int maximumWealth(int[][] accounts) {
        //person = row
        //account = col
        int count=0;
        int ans = Integer.MIN_VALUE;
        for(int person = 0;person < accounts.length;person++){
            //when you start a new col take a new sum for that.
            int sum = 0;
            for(int account = 0;account< accounts[person].length;account++){
                sum += accounts[person][account];
            }
            //now we have sum of accounts of person.
            //check with overall answer
            if(sum>ans){
                ans = sum;
            }

        }
        return ans;

    }
}
