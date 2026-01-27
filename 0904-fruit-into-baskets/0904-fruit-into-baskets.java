class Solution {
    public int totalFruit(int[] fruits) {
        int maxFruits = 0;

        for (int start = 0; start < fruits.length; start++) {
            int basket1 = -1;
            int basket2 = -1;
            int currentCount = 0;

            for (int end = start; end < fruits.length; end++) {
                int currentFruit = fruits[end];

                if (basket1 == -1 || basket1 == currentFruit) {
                    basket1 = currentFruit;
                    currentCount++;
                } else if (basket2 == -1 || basket2 == currentFruit) {
                    basket2 = currentFruit;
                    currentCount++;
                } else {
                    break;
                }
            }

            maxFruits = Math.max(maxFruits, currentCount);
            
            if (maxFruits >= fruits.length - start) break;
        }

        return maxFruits;
    }
}