# What are interfaces in Java

They are like classes, but only for promises of what things MUST do

Shape represents the HABILITY TO HAVE A SHAPE.
not SUBCLASS OF SHAPE (abstract method)


public interface Shape {
    String getShape();  // ✅ Just the promise/contract
}