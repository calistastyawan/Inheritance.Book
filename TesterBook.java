import java.util.Scanner;

public class TesterBook {
    public static void main(String[] args) {
        int pilihan;
        String pilihan2;
        Scanner in = new Scanner(System.in);
        System.out.println("pilih Book: 1. Novel atau 2. TextBook");
        pilihan = in.nextInt();

        if (pilihan  == 1) {
        System.out.println("title: ");
        String title = in.next();
        System.out.println("year: ");
        int year = in.nextInt();
        System.out.println("price: ");
        double price = in.nextDouble();
        System.out.println("subject: ");
        String subject = in.next();
        System.out.println("Apakah memilih Biography? (1.Ya/2.Tidak)");
        pilihan2 = in.nextLine();

        switch (pilihan2) {
            case "1":
                System.out.println("About: ");
                String about = in.nextLine();
                Biography bio= new Biography(title, year, price, subject, about);
                bio.print();
            case "2":
            TextBook text= new TextBook(title, year, price, subject);
            text.print();
            break;

            default:
            break;

        }
        }else if (pilihan == 2) {
            System.out.println("title: ");
            String title = in.nextLine();
            System.out.println("year: ");
            int year = in.nextInt();
            System.out.println("price: ");
            double price = in.nextDouble();
            System.out.println("genre: ");
            String genre = in.nextLine();
            Novel nvl= new Novel(title, year, price, genre);
            nvl.print();
        }
    }
}
