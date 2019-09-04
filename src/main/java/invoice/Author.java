package invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author implements IBaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    private LocalDate dateOfBirth;


  //  @Formula(value = "(SELECT SUM((p.cena + p.podatek)* p.ilosc) from invoicePosition p where p.invoice_id = id)")
    private int numberOfBooks;


    // możemy z tej strony dodawać (książki do autorów) żeby tworzyć relacje
    @EqualsAndHashCode.Exclude
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Book> books = new HashSet<>();

}
