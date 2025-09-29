package observer;

public class EmailNotificationListener implements EventListener {
    


    @Override
    public void notify(String eventType, String file) {
        System.out.println("Email, Someone has performed " + eventType +
                " operation with the file: " + file);
    }
    
}
