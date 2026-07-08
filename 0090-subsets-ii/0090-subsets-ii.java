class Solution {
    private List<List<Integer>> results;
    private int[] valueCnt;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        results = new ArrayList<>();
        valueCnt = new int[21];
        for (int num : nums) {
            valueCnt[num + 10]++;
        }
        findSubSets(0);
        return results;
    }
    private void findSubSets(int idx) {
        int n = valueCnt.length;
        if (idx == n) {
            List<Integer> r = new ArrayList<>();
            for (int v = 0; v < n; v++) {
                for (int c = 0; c < valueCnt[v]; c++) {
                    r.add(v - 10);
                }
            }
            results.add(r);
            return;
        }
        int cnt = valueCnt[idx];
        if (cnt == 0) {
            findSubSets(idx + 1);
            return;
        }
        for (int c = cnt; c >= 0; c--) {
            valueCnt[idx] = c;
            findSubSets(idx + 1);
            valueCnt[idx] = cnt;
        }
    }
}