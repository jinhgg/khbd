public class PrimitiveTypeTest {
    public static void main(String[] args) {
        // byte 默认0 范围(-128, 127)
        byte a = 100;
        // short 默认0 范围(-32768, 32767)
        short b = 1000;
        // int 默认0 范围(-2,147,483,648, 2,147,483,647)
        int c = 100000;
        // long 默认0L 范围(-2^63, 2^63 -1)
        long d = 100000L;
        // float 默认0.0f
        float e = 234.5f;
        // double 默认0.0d
        double f = 0.0d;
        // 字符类型, 只能存一个元素，不是字符串，是编码
        char name = 'A';

        // int 相关操作
        int number1 = 1;
        int number2 = 2;
        number1++; // 自增
        number2 += number1;
        // 三元运算符
        int max = number1 > number2 ? number1 : number2;
        // System.out.println(number1 > number2 ? number1 : number2);

        // 数组相关操作
        int[] arr1 = { 1, 2, 3 };
        arr1[0] = 100; // 修改值
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += 1; // 循环中可以修改数组值
            sum += arr1[i]; // 数组遍历
        }
        String[] arr2 = new String[10]; // 动态初始化，10个元素的string数组

        // System.out.println(sum);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(arr1);

    }
    // 定义方法
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}