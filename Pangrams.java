

    static String pangrams(String s) {
        s = s.toLowerCase();
        s = s.replace(" ", "");
        HashSet<Character> set  = new HashSet();
        for(char ch: s.toCharArray()){
            set.add(ch);
        }
        if(set.size() != 26) return "not pangram";
        return "pangram";
    }

