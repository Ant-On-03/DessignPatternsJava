public class SingletonStaticBlock {

    // WE CAN DO THE SAME BUT WITH STATICBLOCK
    private static SingletonStaticBlock instance;
    
    static {
        instance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getInstance() {
        return instance;
    }

}
