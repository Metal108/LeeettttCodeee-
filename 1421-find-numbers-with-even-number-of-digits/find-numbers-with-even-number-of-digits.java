class Solution {
    public int findNumbers(int[] nums) {
         int answer = 0;

        for (int number : nums) {
            int digitCount = 0;

            while (number > 0) {
                number /= 10;
                digitCount++;
            }

            if (digitCount % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }
}