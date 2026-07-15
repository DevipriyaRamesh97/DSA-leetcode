class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length;      
        int nxor = 0;
        for (int i = 1; i <= n + 1; i++)
            nxor ^= i;

        int oddXor = 0;
        for (int i = 1; i < n; i += 2)
            oddXor ^= encoded[i];

        int[] perm = new int[n + 1];
        perm[0] = nxor ^ oddXor;
        for (int i = 0; i < n; i++)
            perm[i + 1] = perm[i] ^ encoded[i];

        return perm;
    }
}