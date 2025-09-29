package proxy;

// THE PROXY USES LAZY LOADING
// WE PUT INTO THE PROXY THE OBJECT PARAMETERS
// WE ONLY INITIALIZE IT WHEN NEEDED


public class ProxyImage implements Image {
    
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;

    }

    // WE ONLY INSTANTIATE THE IMAGE WHEN NEEDED (WHEN IT IS NULL)
    @Override
    public void display() {
        System.out.println("Proxy Image: displaying " + filename);
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
        System.out.println("Proxy image: logging " + realImage);
    }

}
