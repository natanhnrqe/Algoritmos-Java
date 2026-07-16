package algh.datastructureandalghinjava.algoritmos;

public class InsertionSort {
    

    public char[] insertionSort(char[] a){
        int n = a.length;
        for (int i = 1; i< n; i++){
            char cur = a[i];
            int j = i - 1;
            while ((j >= 0) && (a[j] > cur))
                a[j + 1] = a[j--];
            a[j + 1] = cur;
        }
    return a;
    }
}
