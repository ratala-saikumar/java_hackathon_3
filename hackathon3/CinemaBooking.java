class CinemaBooking {
    String name, movie;
    double price;
    int tickets;

    CinemaBooking(String n, String m, double p, int t) {
        name = n;
        movie = m;
        price = p;
        tickets = t;
    }

    void display() {
        double total = price * tickets;
        double discount = 0;

        if (tickets <= 0) {
            System.out.println("Invalid Tickets");
            return;
        }

        if (tickets >= 5) {
            discount = total * 0.10;
        }

        System.out.println("Customer: " + name.toUpperCase());
        System.out.println("Movie: " + movie.toUpperCase());
        System.out.println("Price: " + price);
        System.out.println("Tickets: " + tickets);
        System.out.println("Status: Booking Successful");
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (total - discount));
    }

    public static void main(String[] args) {
        CinemaBooking b1 =
            new CinemaBooking("Sneha", "Avatar", 200, 5);

        CinemaBooking b2 =
            new CinemaBooking("Arjun", "Avatar", 200, 2);

        b1.display();
        b2.display();

        if (b1.name.toUpperCase().equals("SNEHA")) {
            System.out.println("Names Match");
        } else {
            System.out.println("Names Do Not Match");
        }
    }
}