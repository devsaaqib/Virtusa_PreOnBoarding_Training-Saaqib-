public class VideoStore {

    private Video[] store;
    private int count;

    // Constructor
    public VideoStore() {
        store = new Video[10]; // max 10 videos
        count = 0;
    }

    // Add video
    public void addVideo(String name) {
        store[count] = new Video(name);
        count++;
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    // Checkout video
    public void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    // Return video
    public void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    // Receive rating
    public void receiveRating(String name, int rating) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                store[i].receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    // List inventory
    public void listInventory() {
        System.out.println("Video Name | Checkout Status | Rating");
        for (int i = 0; i < count; i++) {
            System.out.println(store[i].getName() + " | " +
                    store[i].getCheckout() + " | " +
                    store[i].getRating());
        }
    }
}