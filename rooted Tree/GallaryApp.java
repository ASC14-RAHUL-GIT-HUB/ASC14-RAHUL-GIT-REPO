class GalleryApp {
    public static void main(String[] args) {
        System.out.println("Welcome to WD Gallery");

        //create a reference
        Photogreph hdPhoto; // reference
        hdPhoto = new Photogreph();

        // accessing the properties

        //set the name
        hdPhoto.name = "RootedTree";

        hdPhoto.frameWidth = 89;
        hdPhoto.colorPhoto = "Grey";

        //access the methods
        hdPhoto.hang();
        hdPhoto.changeOrientation("Landscape");
        hdPhoto.illuminate();

        boolean isIlluminated = hdPhoto.illuminate();
        if (isIlluminated) {
            System.out.println("Glowing Photo");
        }
    }
}
