class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negative = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int val = Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0) {
                    negative++;
                }
                min = Math.min(min, val);
                sum += val;
            }
        }
        return (negative % 2 == 0) ? sum : sum - 2L * min;
    }
}
