import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int userId;
    private ArrayList<String> booksObject;
    double balanceUnpaid;

    public User(String firstName, String lastName, String email, int userId, ArrayList<String> booksObject, double balanceUnpaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userId = userId;
        this.booksObject = booksObject;
        this.balanceUnpaid = balanceUnpaid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<String> getBooksObject() {
        return booksObject;
    }

    public void setBooksObject(ArrayList<String> booksObject) {
        this.booksObject = booksObject;
    }

    public double getBalanceUnpaid(int i) {
        return balanceUnpaid;
    }

    public void setBalanceUnpaid(double balanceUnpaid) {
        this.balanceUnpaid = balanceUnpaid;
    }

    public void overduePayments(int numberOfDaysOverdue) {
      double chargesForDaysLate=numberOfDaysOverdue * 0.50;
       this.balanceUnpaid +=chargesForDaysLate;
        System.out.println(this.getFirstName() + " unpaid balance is" +" " + balanceUnpaid);
    }
}
