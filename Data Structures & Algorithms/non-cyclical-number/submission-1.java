class Solution {
    int sumOfSquare(int number){
        int rev=0;
        while(number!= 0){
            rev += Math.pow(number % 10, 2);
            number /= 10;
        }
        return rev;
    }
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while (n != 1 && !numbers.contains(n)) {
            numbers.add(n);
            n = sumOfSquare(n);
        }
        return n == 1;
    }
}