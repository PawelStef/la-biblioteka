package invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookLent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @ManyToOne()
    private Reader reader;
    @ToString.Exclude
    @ManyToOne()
    private Book book;
    @CreationTimestamp
    private LocalDate dateLent;
    private LocalDate dateReturned;
}
