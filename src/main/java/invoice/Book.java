package invoice;


import lombok.*;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book implements IBaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String title;
    private String yearWritten;

    @Formula(value = "(year(now()) - yearWritten)")
    private int howOld;

    private int numberOfPage;

    private int numberOfAvailableCopies;

    @Formula(value = "(select count(bl.id) from booklent bl WHERE bl.book_id = id and bl.dateReturned is null)")
    //"(select count(bl.id) from booklent bl WHERE bl.book_id = id and bl.dateReturned is null)"
    private int numberOfBorrowedCopies;



    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER)
    private Set<Author> authors;


    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "book", fetch = FetchType.EAGER)
    private Set<BookLent> currentLent;

}
