public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
            }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good");
        }
        if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("This notebook is very light.");
        }
        if (this.weight > 600 && this.weight <= 1600) {
            System.out.println("This notebook is pretty heavy.");
        }
        if (this.weight > 1600) {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear() {
        if (this.year >= 2010 && this.price <= 500) {
            System.out.println("This is normal offer.");
        }
        else {
            System.out.println("This is good offer.");
        }

    }
}
