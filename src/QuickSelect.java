/**
 * Created by galwp on 22/12/2015.
 */
public class QuickSelect {

    public static float selectKth(float[] arr, int k) {
        if (arr == null || arr.length <= k)
            throw new Error();

        int from = 0, to = arr.length - 1;

        // if from == to we reached the kth element
        while (from < to) {
            int r = from, w = to;
            float mid = arr[(r + w) / 2];

            // stop if the reader and writer meets
            while (r < w) {

                if (arr[r] >= mid) { // put the large values at the end
                    float tmp = arr[w];
                    arr[w] = arr[r];
                    arr[r] = tmp;
                    w--;
                } else { // the value is smaller than the pivot, skip
                    r++;
                }
            }

            // if we stepped up (r++) we need to step one down
            if (arr[r] > mid)
                r--;

            // the r pointer is on the end of the first k elements
            if (k <= r) {
                to = r;
            } else {
                from = r + 1;
            }
        }

        return arr[k];
    }

}
