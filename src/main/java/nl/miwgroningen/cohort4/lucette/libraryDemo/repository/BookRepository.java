package nl.miwgroningen.cohort4.lucette.libraryDemo.repository;

import nl.miwgroningen.cohort4.lucette.libraryDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 * Haal boeken uit en schrijf boeken naar de database
 */

public interface BookRepository extends JpaRepository<Book, Integer> {

    Optional<Book> findByTitle(String title);

}
