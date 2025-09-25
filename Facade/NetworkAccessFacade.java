package Facade;

public class NetworkAccessFacade {

    private Communication comm = new Communication();
    private Cache cache = new Cache();
    private Intercerptor interceptor = new Intercerptor();
    private Convertor conv = new Convertor();

    public void communicate() {
        cache.cache();
        comm.send("Some data");
        comm.receive();
        interceptor.intercept();
        conv.convert();

    }
}
