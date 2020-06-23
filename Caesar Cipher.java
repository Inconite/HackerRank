

static String caesarCipher(String s, int k) {
        String baseStr = "abcdefghijklmnopqrstuvwxyz";
        String s1 = baseStr.substring(0, k%26);
        String s2 = baseStr.substring(k%26, baseStr.length());
        String newStr = s2 + s1;
        String result = "";

        for(char ch: s.toCharArray()){
            int x = ch;
            if(x >= 97 && x <= 122){
                int i = x - 97;
                result += newStr.charAt(i);
            }
            else if(x >= 65 && x <= 90){
                int i = x - 65;
                result += Character.toUpperCase(newStr.charAt(i));
            }
            else result += ch;
        }
        return result;
    }
    
    
