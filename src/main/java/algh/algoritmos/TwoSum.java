package algh.algoritmos;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(solution(nums, target)));
    }

    public static int[] solution(int[] nums, int target) {
        int[] result = {0};
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {
                result = new int[]{mapa.get(complemento), i};
                return result;

            }
            mapa.put(nums[i], i);

        }
        return result;
    }
}
