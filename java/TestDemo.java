// 泛型方法的调用，随便传什么类型
public class TestDemo {
    public static void main(String[] args) {
        A a = new A();
        a.test("123");
        Integer b = a.test1(123);
        System.out.println(b);
        Integer c = A.test2(123);
        System.out.println(c);

    }
}


class A {
    //方法泛型化：在public/static后面加<T>

    //无返回值的方法泛型化
    public <T> void test(T t) {
        System.out.println(t);
    }
    //有返回值的方法泛型化
    public <T> T test1(T t) {
        return t;
    }
    public static <T> T test2(T t) {
        return t;
    }
}