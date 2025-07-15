class Photogreph {
    // properties
    String name;
    byte frameWidth;
    String colorPhoto;
    String frameMaterial;
    // behaviours
    void hang() {
        System.out.println("Hang on the wall.");
    }
    void changeOrientation(String orientation) {
        System.out.println("Change the orientation");
    }
    boolean illuminate() {
        System.out.println("Illuminated");
        return false;
    }
    void autograph() {
        System.out.println("Autograph signed by Shreyas !");
    }
}