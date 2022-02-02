package three.oop;

public class OuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        Outer.StaticInner staticInner = new Outer.StaticInner();
    }
}
