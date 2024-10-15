public class Biography extends TextBook{
    protected String About;

    public String getAbout() {
        return this.About;
    }

    public void setAbout(String About) {
        this.About = About;
    }

    public Biography() {
        super();
        About = "";
    }

    public Biography(String title, int year, double price, String subject, String About) {
        super(title, year, price, subject);
        this.About = About;

    }

    public void print() {
        super.print();
        System.out.println("About : " + About);
    }

}
