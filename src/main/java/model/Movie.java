package model;

public class Movie {

    private int price;
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void decrementStock() {

        if (this.stock == 0) {
            return;
        }

        this.stock = this.stock - 1;
    }
}
