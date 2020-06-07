    static int chocolateFeast(int n, int c, int m) {
        int wrappers = n/c;
        int totalAte = wrappers;
        while(wrappers >= m){
            int newBarsCount = wrappers/m;
            wrappers = wrappers%m + newBarsCount;
            totalAte += newBarsCount;
        }
        return totalAte;
    }
