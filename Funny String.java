
    static String funnyString(String s) {
        for(int i = 0, j = s.length()-1; i < s.length()-1; i++, j--){
            if(Math.abs(s.charAt(i) - s.charAt(i+1)) != Math.abs(s.charAt(j) - s.charAt(j-1))) return "Not Funny";
        }
        return "Funny";
    }

