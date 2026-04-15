

class Solution {
    public int sumSubarrayMins(int[] a) {
        int n = a.length;
        int mod = 1000000007;

        int[] pse = pse(a);
        int[] nse = nse(a);

        long cnt = 0;

        for(int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (left * right) % mod;
            contribution = (contribution * a[i]) % mod;

            cnt = (cnt + contribution) % mod;
        }

        return (int)cnt;
    }

    // Previous Smaller Element (STRICT)
    int[] pse(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && a[s.peek()] > a[i]) {
                s.pop();
            }

            res[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return res;
    }

    // Next Smaller Element (NON-STRICT)
    int[] nse(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }

            res[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }
        return res;
    }
}