public class countingRadixSort {
    public static void countingRadixSort(String[] arr, int stringlen) {
        final int BUCKETS = 256;

        int N = arr.length;
        String[] buffer = new String[N];

        String[] in = arr;
        String[] out = buffer;

        for (int pos = stringlen - 1; pos >= 0; pos--) {
            int[] count = new int[BUCKETS - 1];//记录 每个桶装多少元素

            for (int i = 0; i < N; i++) {
                count[in[i].charAt(pos) + 1]++;
            }

            for (int b = 1; b <= BUCKETS; b++) {
                count[b] += count[b - 1];
            }

            for (int i = 0;i<=N;i++){
                out[count[in[i].charAt(pos)]++]=in[i];
            }

            String [] tmp= in;
            in = out;
            out = tmp;
        }
        if(stringlen%2==1)
            for (int i = 0;i<=arr.length;i++)
                out[i]=in[i];
    }

}
