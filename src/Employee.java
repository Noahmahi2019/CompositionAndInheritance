import java.util.ArrayList;

public class Employee extends User {
    private int ptoDays;
    private String username;
    private String password;

    public Employee(String firstName, String lastName, String email, int userId, ArrayList<String> booksObject, double balanceUnpaid, int ptoDays, String username, String password) {
        super(firstName, lastName, email, userId, booksObject, balanceUnpaid);
        this.ptoDays = ptoDays;
        this.username = username;
        this.password = password;
    }

    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void overduePayments(int numberOfDaysOverdue) {
        this.balanceUnpaid +=0.10;
        System.out.println(this.getFirstName() + " unpaid balance is" +" " + balanceUnpaid);
    }
}
