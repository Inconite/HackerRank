
    static int theLoveLetterMystery(String s) {
        int count = 0;
        int l = 0, h = 0;
        int len = s.length();
        if(len % 2 == 0){
            l = len/2 - 1;
            h = len/2;
        }
        else{
            l = len/2 - 1;
            h = len/2 +1;
        }
        while(l >= 0){
            count += Math.abs(s.charAt(l) - s.charAt(h));
            l--;
            h++;
        }
        return count;
    }

