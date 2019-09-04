package invoice;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Data
public class DataLoader {

    private Scanner scanner;
    private EntityDao entityDao;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public DataLoader() {
        this.entityDao = new EntityDao();
        this.scanner = new Scanner(System.in);
    }


    public void addAuthor() {
        System.out.println("Add author.");
        Author author = new Author();
        System.out.println("Author name:");
        author.setName(scanner.nextLine());
        System.out.println("Author surname:");
        author.setSurname(scanner.nextLine());
        System.out.println("Author date of birth: (dd-MM-yyyy)");
        author.setDateOfBirth(LocalDate.parse(scanner.nextLine(), formatter));
        entityDao.saveOrUpdate(author);
    }

    public void listAuthor() {
        System.out.println("List authors:");

        entityDao.getAll(Author.class).forEach(System.out::println);

    }


    public void deleteAuthor() {


    }
}
