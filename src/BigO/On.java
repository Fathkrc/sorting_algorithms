package BigO;

public class On { // linear complexity O(n)
    public static void main(String[] args) {

        var arr=new int[]{10,2,3,4,5};
        for (int w:arr) {
            System.out.print(w+" ");
        }
        //eleman sayısı arttıkça işlem uzuyor O(n) lineer mantığı
    }
}
