import java.util.ArrayList;
public class Library {
   private ArrayList<Book> booksObject;
    private ArrayList<Employee> employeeObject;
    private ArrayList<User> userObject;

    public Library(ArrayList<Book> booksObject, ArrayList<Employee> employeeObject, ArrayList<User> userObject) {
        this.booksObject = booksObject;
        this.employeeObject = employeeObject;
        this.userObject = userObject;
    }
    public ArrayList<Book> getBooksObject() {
        return booksObject;
    }

    public void setBooksObject(ArrayList<Book> booksObject) {
        this.booksObject = booksObject;
    }

    public ArrayList<Employee> getEmployeeObject() {
        return employeeObject;
    }

    public void setEmployeeObject(ArrayList<Employee> employeeObject) {
        this.employeeObject = employeeObject;
    }

    public ArrayList<User> getUserObject() {
        return userObject;
    }

    public void setUserObject(ArrayList<User> userObject) {
        this.userObject = userObject;
    }
}