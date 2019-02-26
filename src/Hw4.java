class StringStack  implements Stack {
    Object stack="";
   public int length() {
        return stack.toString().length();
    }

    public Object pop() {
       return stack;
    }

    public boolean push(Object ob) {
       if(ob.equals(""))
           return false;
       else
           stack=ob;
           return true;

    }
}

public class Hw4{
    public static void main(String []args){
        StringStack s=new StringStack();
        s.push("안녕하세요");
        System.out.println(s.pop());
    }
}
