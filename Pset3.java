class Pset3 {

    public static void main(String[] args) {
        Wallet myWallet = new Wallet(250.0, "123456abc");
        System.out.println("Account ID: " + myWallet.getAccountID());
        System.out.println("Initial amount of money: $" + myWallet.getBalance());

        myWallet.payday(100.0);
        System.out.println("After deposit, the amount of money in your account is: $" + myWallet.getBalance());
        
        myWallet.pay(200.0);
        System.out.println("After withdrawal, the amount of money in your account is: $" + myWallet.getBalance());

        Circle c = new Circle(2.0);
        double circleArea = c.area();
        System.out.println("The area of the circle is: " + circleArea);

        Rectangle r = new Rectangle(4, 5);
        double rectangleArea = r.area();
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }
}

class Wallet {
    public double balance;
    public String accountID;

    public Wallet(double initialBalance, String id) {
        balance = initialBalance;
        accountID = id;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountID(String id) {
        accountID = id;
    }

    public String getAccountID() {
        return accountID;
    }

    public void payday(double amountIn) {
        balance = balance + amountIn;
    }

    public void pay(double amountOut) {
        balance = balance - amountOut;
    }
}

class Circle {
    public double radius;

    public Circle(double r) {
        radius = r;
    }

    public double area() {
        return radius * radius * 3.14; 
    }
}

class Rectangle {
    public double length;
    public double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}
