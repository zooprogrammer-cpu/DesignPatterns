public abstract class UIControl {
    public void enable() {
        System.out.println("Enabled");
    }

    public abstract void draw(); // drawing checkbox is different than a circle.
    // only method declaration, no implementation.

}
