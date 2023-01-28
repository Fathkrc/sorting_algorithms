package BigO;

public class On2 {//O(n^2) Quadratic Comlexity

    public static void main(String[] args) {
        var count=0;
        var arr=new int[]{2,1,5};
        for (int i=0;i<arr.length;i++) {
            for (int j=0;j<arr.length;j++) {
                System.out.println(arr[i]+arr[j]);
                count++;
            }
        }
        System.out.println(count);
//bu örnek için length arttıkça kodun çalışma compexity si karesi oranında artıyor
    }
}
