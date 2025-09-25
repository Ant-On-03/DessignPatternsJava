public class SingletonThreadSafeTest {
    public static void main(String [] args) {
        SingletonThreadSafe safeInstance1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe safeInstance2 = SingletonThreadSafe.getInstance();

        System.out.println(safeInstance1);
        System.out.println(safeInstance2);
    }
}
