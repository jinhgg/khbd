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

abstract class Person {
    private String name;
    private int age;
    public abstract void work();

    // 虽然抽象类不能创建对象，但构造方法也是有用的
    // 带参构造可以让子类super(name, age)调用
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    // 这三个方法都是快捷键生成
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("work");
        
    }
    
}
