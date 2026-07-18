class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = candies[0];

        for (int candy : candies) {
            maximum = Math.max(maximum, candy);
        }

        List<Boolean> answer = new ArrayList<>();

        for (int candy : candies) {
            answer.add(candy + extraCandies >= maximum);
        }

        return answer;
    }
    }
