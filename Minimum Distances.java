
    static int minimumDistances(int[] a) {
        int minDist = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])) {
                int dist = i - map.get(a[i]);
                map.put(a[i], i);
                minDist = Math.min(dist, minDist);
            }
            else map.put(a[i], i);
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

