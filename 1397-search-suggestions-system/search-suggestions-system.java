class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<>();
        int lo = 0;
        for (int i = 1; i <= searchWord.length(); i++) {
            String prefix = searchWord.substring(0, i);
            lo = lowerBound(products, prefix, lo);
            List<String> cur = new ArrayList<>();
            for (int j = lo; j < products.length && j < lo + 3; j++) {
                if (products[j].startsWith(prefix)) cur.add(products[j]);
                else break;
            }
            res.add(cur);
        }
        return res;
    }

    private int lowerBound(String[] a, String key, int start) {
        int l = start, r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m].compareTo(key) < 0) l = m + 1;
            else r = m;
        }
        return l;
    }
}