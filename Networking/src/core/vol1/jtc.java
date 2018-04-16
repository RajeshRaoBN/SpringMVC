package core.vol1;

public class jtc {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread T1 = new Thread();
        System.out.println(T1);
    }
}
