import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by galwp on 22/12/2015.
 */
public class main {
    public static void main(String[] args) {
        int N=0;
        helper h = new helper();
        double quickSelectAVGTime = 0;
        for (int pow =8;pow<25;pow++) {
            for (int i = 0; i < 10; i++) {
                N=(int)Math.pow(2,pow);
                float[] a = new float[N];
                a = h.insertToArray(a, N);
                quickSelectAVGTime += quickSelectTime(a,3);
            }
            System.out.println("Average Time for Quick Select in with N=" + N + " is: " + String.format("%4.9f", quickSelectAVGTime / 10));
        }
    }

    public static double quickSelectTime(float[] a,int k){
        QuickSelect qs = new QuickSelect();
        long startTime = System.nanoTime();
        qs.selectKth(a,k);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        double time = (double)elapsedTime / 1.0E9D;
        return time;
    }

}
