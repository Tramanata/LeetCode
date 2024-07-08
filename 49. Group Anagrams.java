class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> anagrams = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String sortedString = new String(tempArray);
            if(anagrams.containsKey(sortedString)){
                anagrams.get(sortedString).add(strs[i]);
            }else{

                anagrams.put(sortedString, new ArrayList<>());
                anagrams.get(sortedString).add(strs[i]);
            }
        }
    List<List<String>> output = new ArrayList<List<String>>();
    for(Map.Entry<String, List<String>> entry:anagrams.entrySet()){
        output.add(entry.getValue());
    }
    return output;
    }
}
