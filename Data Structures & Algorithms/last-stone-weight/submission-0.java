class Solution {
    public int lastStoneWeight(int[] stones) {
        int length=stones.length;
        while(length > 1){
            Arrays.sort(stones,0,length);
            int highest = stones[length - 1];
            int secondHighest = stones[length - 2];
            length=length-2;
            if (highest != secondHighest) {
                stones[length] = highest - secondHighest;
                length++;
            }
        }
        return length == 0 ? 0 : stones[0]; 
        
    }
}
