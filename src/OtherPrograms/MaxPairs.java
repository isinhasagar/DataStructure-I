package OtherPrograms;

import java.util.HashMap;
import java.util.Map;

public class MaxPairs {
    public static int maxPairs(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int pairs = 0;

        for (int num : arr) {
            int complement = -num;

            if (frequencyMap.containsKey(complement) && frequencyMap.get(complement) > 0) {
                pairs++;
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);
            } else {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 6, 5};
        int maxPairsCount = maxPairs(arr);
        System.out.println("Maximum number of pairs: " + maxPairsCount);
    }
}
