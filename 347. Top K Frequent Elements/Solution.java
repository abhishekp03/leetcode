class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            int val = map.getOrDefault(num, 0);
            map.put(num, val + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        // Sort the list using lambda expression
        Collections.sort(
                list,
                (i1,
                 i2) -> i2.getValue().compareTo(i1.getValue()));

        List<Integer> result = list.stream().map(i -> i.getKey()).collect(Collectors.toList());
        if (result.size() < k) {
            k = result.size();
        }

        int[] foo = new int[k];
        for (int i = 0; i < k; i++) {
            foo[i] = result.get(i);
        }
        return foo;
    }
}