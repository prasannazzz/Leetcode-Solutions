class Solution {
    public int[] decrypt(int[] code, int k) {
        int size = code.length;
        int[] decr = new int[size];
        if (k == 0) {
            return decr;
        }
        for (int i = 0; i < size; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % size];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + size) % size];
                }
            }
             decr[i] = sum;
        }
         return decr;
    }
}
