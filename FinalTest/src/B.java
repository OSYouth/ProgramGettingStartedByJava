class A {
    static int i = 0;//1
    float f = (float) 1.0;//2
    A() {
       String str = "Hello";//3
    }
}
public class B extends A {
    static int j=3;//4
    boolean isHi = true;//5
    B(boolean hi) {
        isHi = hi;//6
    }
    public static void main(String[] args) {
        B bb = new B(false);
    }
}