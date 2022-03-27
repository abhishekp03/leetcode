class Solution {
    // Poor solution | Relying on Java's data structure to maintain insertion order | Need to improve
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        int rows = mat.length, columns = mat[0].length;
        for (int i = 0; i < rows; i++) {
            int sum = 0, j = 0;
            while (j < columns && mat[i][j] == 1) {
                sum += mat[i][j];
                j++;
            }
            map.put(i, sum);
        }
        map = map.entrySet()
                .stream()
                .sorted((i1, i2)
                        -> i1.getValue().compareTo(
                        i2.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        int[] result = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (i < k) {
                result[i] = entry.getKey();
                i++;
            } else {
                break;
            }
        }
        return result;
    }
}