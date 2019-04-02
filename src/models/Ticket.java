package models;

public class Ticket {
    private double cost;
    private int seatNumber;

    public Ticket(double c, int s) {
        cost = c;
        seatNumber = s;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void changePrice(double newCost) { setCost(newCost); }

    public void addDiscountByPercent(int percent) { setCost(cost - Double.valueOf(percent)*cost/100);}
}
