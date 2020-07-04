
    static int alternate(String s) {
        HashSet<Character> set = new HashSet();
        HashMap<Character, Integer> map = new HashMap();
        for(char ch: s.toCharArray()){
            set.add(ch);
        }
        //define index for a particular character
        int count = 0;
        for(char ch: set){
            map.put(ch, count++);
        }
        int len = map.size();
        int[][] l = new int[len][len];
        int[][] c = new int[len][len];
        int result = 0;
        for(char ch: s.toCharArray()){
            int idx = map.get(ch);
            //row
            for(int col = 0; col < len; col++){
                if(l[idx][col] == ch) c[idx][col] = -1;
                if(c[idx][col] != -1) {
                    l[idx][col] = ch;
                    c[idx][col]++;
                }
            }
            //col
            for(int row = 0; row < len; row++){
                if(l[row][idx] == ch) c[row][idx] = -1;
                if(c[row][idx] != -1) {
                    l[row][idx] = ch;
                    c[row][idx]++;
                }
            }
        }
        //get max count
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                result = Math.max(result, c[i][j]);
            }
        }
        return result;
    }

