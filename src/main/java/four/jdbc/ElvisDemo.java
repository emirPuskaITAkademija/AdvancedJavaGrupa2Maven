package four.jdbc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class andeo = Elvis.class;
        Constructor constructor = andeo.getDeclaredConstructor();
        constructor.setAccessible(true);
        Elvis elvis3 = (Elvis) constructor.newInstance();
        System.out.println(elvis3.hashCode());
        Elvis elvis = Elvis.createElvis();
        System.out.println(elvis.hashCode());
        Elvis elvis1 = Elvis.createElvis();
        System.out.println(elvis1.hashCode());
        Elvis elvis2 = Elvis.createElvis();
        System.out.println(elvis2.hashCode());
    }
}
