public class BookStore {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Franz Kafka","Dönüşüm", 1913, 51),
                new Book("Stefan Zweig", "Satranç", 1942, 27)
        };

        System.out.println("\n Kitaplar başarıyla eklendi.");

        Customer[] customers = {
                new Customer("Ali Bulut", "abulut@gmail.com", 215)
        };

        System.out.println("\n Müşteriler başarıyla eklendi.");

        double balance = 0;

        String email = "abulut@gmail.com";
        Customer foundCustomer = null;
        for (Customer cust : customers) {
            if (cust.getEmail().equals(email)) {
                foundCustomer = cust;
                break;
            }
        }
        if (foundCustomer == null)  throw new IllegalArgumentException("Müşteri bulunamadı.");

        String bookName = "Satr anç";
        Book foundBook = null;
        for (Book bk : books) {
            if (bk.getName().equals(bookName)) {
                foundBook = bk;
                break;
            }
        }
        if (foundBook == null)  throw new IllegalArgumentException("Kitap bulunamadı.");

        try {
            foundCustomer.buyBook(foundBook.getPrice());
            balance+= foundBook.getPrice();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}