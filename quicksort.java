public class quicksort {
    public static void shuffle(Object[] a){
        if (a==null) throw new NullPointerException("argument array is null");
        int n = a.length;
        for (int i = 0; i < n; i++){
            int r = i + uniform(n-i); //between i and n-i
            Object temp = a[i];
            a[i]= a[r];
            a[i]= temp;
        }
    }

    public class Quick {
        //this class should not be instantiated.
        private Quick(){}

        public static void sort(Comparable [] a){
            StdRandom.shuffle(a);
            sort(a,0, a.length -1);
            assert isSorted(a);
        }
        //quick sort the subarray from a[lo] to a[hi]
        private static void sort(Comparable[]a, int lo, int hi){
            if (hi<=lo) return;
            int j= partition(a,lo,hi);
            sort(a,lo,j-1);
            sort(a,j-1,hi);
            assert isSorted(a,lo,hi);
        }

        private static int partition(Comparable[] a,int lo,int hi){
            int i = lo;
            int j = hi;
            Comparable v = a[lo];
            while (true){
                //find item on lo to swap
                while (less(a[++i],v))
                    if (i==hi)break;
            }
        }


    }
}
