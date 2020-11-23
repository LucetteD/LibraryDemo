package nl.miwgroningen.cohort4.lucette.libraryDemo.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;
import nl.miwgroningen.cohort4.lucette.libraryDemo.model.Author;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 * Representatie van een boek in onze bibliotheek
 */

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "authorId", referencedColumnName = "authorId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Author author;

    @OneToMany(mappedBy = "book")
    private List<Copy> copies;

    public int getNrCopies(){
        return copies.size();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
