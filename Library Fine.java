
    public static int libraryFine (int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y2 < y1) return 10000;
        if(y2 > y1) return 0;
        if(m2 < m1) return 500 * (m1 - m2);
        if(m2 > m1) return 0;
        if(d2 < d1) return 15 * (d1 - d2);
        return 0;
    }

