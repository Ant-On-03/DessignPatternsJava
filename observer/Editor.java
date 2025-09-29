package observer;

public class Editor {
    public EventManager events = new EventManager( "open", "save");
    String file = "";

    void openFile(String filename) {
        this.file = filename;
        events.notify("open", file);
    }

    void saveFile() {
        if (this.file != "") {
            events.notify("save", file);
        } else {
            System.out.println("Please open a file first.");
        }
    }
}
