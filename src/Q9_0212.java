abstract class Calculator{
    public abstract int add(int a,int b);
    public abstract int substract(int a, int b);
    public abstract double average(int[]a);
}
public class Q9_0212  extends Calculator{
    @Override
    public int add(int a,int b){
        return a+b;
    }
    @Override
    public int substract(int a,int b){
        return a-b;
    }
    @Override
    public double average(int[]a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        int average=sum/a.length;
        return average;
    }

    public static void main(String[]args) {
        Q9_0212  c = new Q9_0212 ();
        System.out.println(c.add(2, 3));
        System.out.println(c.substract(2,3));
        System.out.println(c.average(new int[]{2,3,4}));

    }
}
