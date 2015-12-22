/**
 * Created by galwp on 22/12/2015.
 */
public class helper {

    public float[] insertToArray(float[] a, int N){
        for (int i=0;i<N;i++){
            a[i]=(float)Math.random();
        }
        return a;
    }

    public void printArray(float[] a){
        for (float f:a
                ) {
            System.out.println(f);
        }
    }
}
