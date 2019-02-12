class PositivePoint{
    public int a=0;
    public int b=0;
    PositivePoint() {
    }

    PositivePoint(int a,int b){
        if(a>0 && b>0){
            this.a+=a;
            this.b+=b;
        }
    }
    public void move(int a,int b){
        if(a>0 && b>0){
            this.a+=a;
            this.b+=b;
        }
    }
    public String toString(){

        String point="("+a+","+b+")";
        return point;
    }

}
public class Q5_0212 {
    public static void main(String[]args){
        PositivePoint p=new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");
        p.move(-5,5);
        System.out.println(p.toString()+"입니다.");
        PositivePoint p2=new PositivePoint(-10,-10);
        System.out.println(p2.toString()+"입니다.");
    }

}
