package models;

public class EventStar {
    private Stars star;
    private int price;
    private int duration;

    public Stars getStar() {
        return star;
    }

    public void setStar(Stars star) {
        this.star = star;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
