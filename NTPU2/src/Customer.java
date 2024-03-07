public class Customer {
    private String email;
    private String name;
    private double balance;

    public Customer(String name, String email, double balance) {
        this.email = email;
        this.name = name;
        this.balance = balance;
    }

    public Customer(String name, String email) {
        this.email = email;
        this.name = name;
    }

    public void buyBook(double price) {
        if (balance < price)
            throw new IllegalArgumentException("Yetersiz bakiye");
        balance-=price;
        System.out.println("Kitap satın alındı.");
        System.out.println("Kalan bütçeniz: " + balance);
    }

    public void addBalance(double amount) {
        balance+=amount;
        System.out.println("Yeni bakiyeniz: " + balance);

    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
