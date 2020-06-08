    
    static int camelcase(String s) {
        int count = 1;
        for(int x: s.toCharArray()){
            if(x <= 90) count++;
        }
        return count;
    }
    
