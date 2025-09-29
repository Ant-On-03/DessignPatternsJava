package observer;

// Este es el REGISTRADOR DE EVENTOS    
// notifica A LOS LISTENERS CUANDO EVENTO OCURRE.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    // Arbitraty number of sting parameters
    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener) {
        List<EventListener> users = listeners.computeIfAbsent(event, k -> new ArrayList<>());
        if (!users.contains(listener)){
            users.add(listener);
        }
    }

    public void unsubscribe(String event, EventListener listener) {
        List<EventListener> users = listeners.get(event);
        if (users != null && users.contains(listener)) {
            users.remove(listener);
        }
    }

    public void notify(String event, String file) {
        List<EventListener> users = listeners.get(event);
        if (users == null) return;
        for (EventListener user : users) {
            user.notify(event, file);
        }
    }

}














