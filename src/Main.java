import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("The God of Small Things", "Arundhati Roy", 300);
        Book book2 = new Book("As I Lay Dying", "William Faulkner", 400);
        Book book3 = new Book("Skippy Dies", "Paul Murray ", 500);


        ArrayList<Book> booksObject = new ArrayList<>();
        booksObject.add(book1);
        booksObject.add(book2);
        booksObject.add(book3);
        // System.out.println(book1.getNumberOfPages());

        User user1 = new User("Jane", "Eyre", "janeEyre1@gmail.com", 244, booksObject, 100);
        User user2 = new User("Molly", " Bloom", " Bloom@gmail.com", 3569, booksObject, 55);
        User user3 = new User("Michael", "Henchard", "Henchard@gmail.com", 666, booksObject, 40);
        ArrayList<User> userObject = new ArrayList<>();
        userObject.add(user1);
        userObject.add(user2);
        userObject.add(user3);
        System.out.println(user1.balanceUnpaid);

        Employee firstEmployee = new Employee("Ebenezer", "Scrooge", "Scrooge@gmail.com", 123, booksObject, 50.00,
                5, "Ebenezer1234", "Ebenezer11");
        Employee secondEmployee = new Employee("Oskar", "Schell", "Schell12@gmail.com", 122, booksObject, 30, 6,
                "Oskar345", "Schell111");

        Employee lastEmployee = new Employee("Hans", "Castorp", "Castorp@gmail.com", 134, booksObject, 70, 10,
                "Hans1", "Hans9999");

        ArrayList<Employee> employeeObject = new ArrayList<>();
        employeeObject.add(firstEmployee);
        employeeObject.add(secondEmployee);
        employeeObject.add(lastEmployee);
        System.out.println(firstEmployee.getUsername());

        //  Book TheGodOfSmallThings=new Book("The God Of Small Things","Arundhati Roy",300);
        //Book AsILayDying = new Book("As I Lay Dying", "William Faulkner", 400);
        //  Book SkippyDies = new Book("Skippy Dies", "Paul Murray ", 500);
        //  user1.setBalanceUnpaid(50.00);
        user1.setBalanceUnpaid(20.00);
        user1.overduePayments(6);

        System.out.println(user1.getBalanceUnpaid());
    }
}

