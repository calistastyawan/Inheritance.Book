public class Novel extends Book {
    protected String Genre;

    public String getGenre() {
        return this.Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public Novel() {
        super();
        Genre = "";
    }

    public Novel(String title, int year, double price, String Genre) {
        super(title, year, price);
        this.Genre = Genre;
    } 

    public void print() {
        super.print();
        System.out.println("Genre : " + Genre);
    }

}
