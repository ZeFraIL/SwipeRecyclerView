package zeev.fraiman.swiperecyclerview;

public class Item {
    private String title;
    private int imageResId;

    public Item(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }
}
