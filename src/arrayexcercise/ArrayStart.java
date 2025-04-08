package arrayexcercise;

public class ArrayStart {
    public static void main(String[] args){
        int[] arr;

        arr = new int[5];

        for(int i=0; i<5; i++)
        {
            arr[i] = i;
        }

        for(int j=0; j<5; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
