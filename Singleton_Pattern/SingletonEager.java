



public class SingletonEager {

    // CREAS LA STATIC INSTANCE PRIVADA CON LA CLASE
    private static SingletonEager eagerInstance = new SingletonEager();
    private SingletonEager() {

    }

    // Creas EN LA CLASE una INSTANCE STATIC PRIVADA.
    // IMPOSIBLE crear más.

    // Returneamos esta Instance
    public static SingletonEager getEagerInstance() {
        return eagerInstance;
    }
}
