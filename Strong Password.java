
    static int minimumNumber(int n, String p) {
        int len = p.length();
        int add = 4;
        if(p.matches(".*?[a-z].*?")) add--;
        if(p.matches(".*?[A-Z].*?")) add--;
        if(p.matches(".*?[0-9].*?")) add--;
        if(p.matches(".*?[^A-Za-z0-9 .].*?")) add--;
        System.out.println(add);
        return len+add >= 6 ? add : 6-len;
    }
