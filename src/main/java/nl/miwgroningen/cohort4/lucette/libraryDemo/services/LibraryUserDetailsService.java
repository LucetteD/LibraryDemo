package nl.miwgroningen.cohort4.lucette.libraryDemo.services;

import nl.miwgroningen.cohort4.lucette.libraryDemo.repository.LibraryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 */

@Service
public class LibraryUserDetailsService implements UserDetailsService {

    @Autowired
    LibraryUserRepository libraryUserRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return libraryUserRepository.findByUsername(s).orElseThrow(
                () -> new UsernameNotFoundException("User " + s + " was not found.")
        );
    }
}
