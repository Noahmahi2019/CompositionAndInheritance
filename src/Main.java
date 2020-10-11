import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("The God of Small Things", "Arundhati Roy", 300);
        Book book2 = new Book("As I Lay Dying", "William Faulkner", 400);
        Book book3 = new Book("Skippy Dies", "Paul Murray ", 500);

        ArrayList<String> booksObject = new ArrayList<>();
        booksObject.add("The God of Small Things");
        booksObject.add("Arundhati Roy");
        booksObject.add("300");

        User user1 = new User("Jane", "Eyre", "janeEyre1@gmail.com", 244, booksObject, 100);
        User user2 = new User("Molly", " Bloom", " Bloom@gmail.com", 3569, booksObject, 55);
        User user3 = new User("Michael", "Henchard", "Henchard@gmail.com", 666, booksObject, 40);
        System.out.println(user1.getBooksObject());

        Employee firstEmployee = new Employee("Ebenezer", "Scrooge", "Scrooge@gmail.com", 123, booksObject, 50.00,
                5, "Ebenezer1234", "Ebenezer11");
        Employee secondEmployee = new Employee("Oskar", "Schell", "Schell12@gmail.com", 122, booksObject, 30, 6,
                "Oskar345", "Schell111");

        Employee lastEmployee = new Employee("Hans", "Castorp", "Castorp@gmail.com", 134, booksObject, 70, 10,
                "Hans1", "Hans9999");
        System.out.println(firstEmployee.getBooksObject());

        user1.setBalanceUnpaid(50);
        user1.overduePayments(3);
        firstEmployee.setBalanceUnpaid(40);
        firstEmployee.overduePayments(4);
    }
}

