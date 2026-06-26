class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String , List<String>> map = new HashMap<>();
      for(String str :strs){
        char[]ch = str.toCharArray();
        Arrays.sort(ch);
        String keys = new String(ch);
        if(!map.containsKey(keys)){
            map.put(keys,new ArrayList<>());

        }
        map.get(keys).add(str);
      }
      return new ArrayList<>(map.values());
    }
}