package BigO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class O1 {
    public static void main(String[] args) {
        var arr= new int[]{1, 2, 3, 4};

        System.out.println(arr[arr.length - 1]);
        //array ın elemanları ne kadar çok olrsa olsun işlem aynı hızda çalışır
        var x=12;
        if(x%2==0) System.out.println("çift");
    }
}
