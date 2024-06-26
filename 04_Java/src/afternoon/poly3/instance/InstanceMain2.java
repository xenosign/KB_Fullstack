package afternoon.poly3.instance;

public class InstanceMain2 {
    public static void main(String[] args) {
        Parent[] parents = { new Parent(), new Child(), new GrandChild() };

        for (Parent p : parents) {
            testInstanceOf(p);
        }
    }

    public static void testInstanceOf(Parent p) {
       p.parentMethod();
       
       if (p instanceof Child) {
           System.out.println("매개 변수로 들어온 인스턴스가 Child 클래스의 인스턴스가 맞음");
           ((Child) p).childMethod();
       }

       if (p instanceof GrandChild) {
           System.out.println("매개 변수로 들어온 인스턴스가 GrandChild 클래스의 인스턴스가 맞음");
           ((GrandChild) p).grandChildMethod();
       }
    }
}
