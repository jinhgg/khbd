import java.util.ArrayList;

public class TestDemo {
    // 这里用static是因为，初始化的是类属性，不是实例属性
    static ArrayList<Student> list = new ArrayList<>();
    // 这里用static是因为，静态代码块就是这样写的
    static {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        list.add(s1);
        list.add(s2);
        list.add(s3);
    }
    public static void main(String[] args) {
        System.out.println(list);
    }
}

class Student {
    public Student() {}
}
