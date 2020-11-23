package nl.miwgroningen.cohort4.lucette.libraryDemo.repository;

import nl.miwgroningen.cohort4.lucette.libraryDemo.model.LibraryUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 */

public interface LibraryUserRepository extends JpaRepository<LibraryUser, Integer> {
    Optional<LibraryUser> findByUsername(String username);
}
