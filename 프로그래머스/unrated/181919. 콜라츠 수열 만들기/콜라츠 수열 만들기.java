import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            sequence.add(n);
        }

        int size = sequence.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = sequence.get(i);
        }
        return answer;
    }
}