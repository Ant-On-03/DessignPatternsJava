// THIS IS THE BEST ONE // MOST RECOMENDED / SCALABLE ONE
public class SingletonThreadSafe {
    private static SingletonThreadSafe threadSafeInstance;
    private SingletonThreadSafe() {

    }

    public static SingletonThreadSafe getInstance() {

        // AL LAZY SINGLETON LE METEMOS UN SYNCRONIZED Y YA VA EL MULTYTHREADING.
        synchronized(SingletonThreadSafe.class) {
            if(threadSafeInstance == null) {
                threadSafeInstance = new SingletonThreadSafe();
            }
        }
        return threadSafeInstance;
    }
}