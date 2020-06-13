
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        for(int i = 0; i < c.length; i += k){
            energy += c[i] == 1 ? -3 : -1;
        }
        return energy;
    }
