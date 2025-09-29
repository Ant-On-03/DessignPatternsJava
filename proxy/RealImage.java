package proxy;

// As oposed to proxy
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
    System.out.println("Real Image: loading file " + filename);
    this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Real Image: displaying " + filename);
    }
    
}
