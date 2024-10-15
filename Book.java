public class Book{
    protected String title;
    protected int year;
    protected double price;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book() {
        title = "";
        year = 0;
        price = 0.0;
    }

    public Book(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public double discount(int a, double b) {
        int discount = 0;
        if (a <= 2020 && a >= 2011) {
            discount = 20;
        }else if (a < 2011){
            discount = 50;
        }
        double discountPrice = b * discount/100;
        return discountPrice;
    }

    public void print() {
        System.out.println("title : " + title);
        System.out.println("year : " + year);
        System.out.println("price : " + price);
    }

}
    

   
   
