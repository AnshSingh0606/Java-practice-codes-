package DSA_4sem;

public class bubble_sorting {
    public static void main(String[] args){
        int [] a = {3,2,6,4,6};
        int c = 0;
        System.out.print  ("Before: ");
        for(int i = 0; i<a.length; i++){
            System.out.print  ( a[i] + " ");
        }
        for(int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }
            }
        }
       System.out.println();
       System.out.print("After: ");
       for(int i = 0; i<a.length; i++){
           System.out.print(a[i] + " ");
       }
}
}

