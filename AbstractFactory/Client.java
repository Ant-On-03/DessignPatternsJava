package AbstractFactory;

public class Client {
    // We dont know and dont need to know what the client uses
    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory factory) {
        service = factory.createService();
        response = factory.createResponse();
    }

    public void communicate() {
        if(service != null && response != null) {
            System.out.println(service.runService());
            System.out.println(response.getResponse());
        }
    }
}
