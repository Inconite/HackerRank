
    static int sherlockAndAnagrams(String s) {
        HashMap<String, Integer> map = new HashMap();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j <= s.length(); j++){
                String sub = s.substring(i, j);
                /*sort the string - this will make ex: 'cab' to 'abc' */
                char[] ch = sub.toCharArray();
                Arrays.sort(ch);
                String sortedSub = new String(ch);
                if(map.containsKey(sortedSub)) map.put(sortedSub, map.get(sortedSub)+1);
                else map.put(sortedSub, 1);
            }
        }
        for(int x: map.values()){
            count += x*(x-1)/2;
        }
        return count;
    }

