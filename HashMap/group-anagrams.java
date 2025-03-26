class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        //create hashmp of <sorted(string) , List<String>

        HashMap<String, List<String>> hm = new HashMap<>();

        for(String wd : strs){
            char[] wdca = wd.toCharArray();
            Arrays.sort(wdca);
            String swd = new String(wdca);

            if(! hm.containsKey(swd)){
                hm.put(swd, new ArrayList<>());
            }

            hm.get(swd).add(wd);
        }

        List<List<String>> ans = new ArrayList<>(hm.values());
        return ans;
        
    }
}