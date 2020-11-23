package nl.miwgroningen.cohort4.lucette.libraryDemo.repository;

import nl.miwgroningen.cohort4.lucette.libraryDemo.model.Copy;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 */

public interface CopyRepository extends JpaRepository<Copy, Integer> {
}
