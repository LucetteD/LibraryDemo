package nl.miwgroningen.cohort4.lucette.libraryDemo.repository;

import nl.miwgroningen.cohort4.lucette.libraryDemo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 */

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
