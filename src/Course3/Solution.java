package Course3;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int S) {
        int Q = A.length;
        int count = 0;

        for (int begin = 0; begin < Q; begin++) {
           int sum = 0;
            for (int end = begin; end < Q; end++) {

                sum += A[end];

                if (sum == S * (end - begin + 1)) {
                    count++;
                }
            }
        }
        return Math.min(count, 1_000_000);
    }
}