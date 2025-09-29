package observer;

public class LogOpenListener implements EventListener {
    
    @Override
    public void notify(String eventType, String file) {
        System.out.println("LogOpenListener, Someone has performed " + eventType +
                " operation with the file: " + file);
    }
    

}
