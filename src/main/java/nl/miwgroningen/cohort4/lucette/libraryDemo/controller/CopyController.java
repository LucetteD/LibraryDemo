package nl.miwgroningen.cohort4.lucette.libraryDemo.controller;

import nl.miwgroningen.cohort4.lucette.libraryDemo.model.Book;
import nl.miwgroningen.cohort4.lucette.libraryDemo.model.Copy;
import nl.miwgroningen.cohort4.lucette.libraryDemo.repository.BookRepository;
import nl.miwgroningen.cohort4.lucette.libraryDemo.repository.CopyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @author Lucette Das <l.k.das@st.hanze.nl>
 */

@Controller
public class CopyController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    CopyRepository copyRepository;

    @GetMapping("/copy/add/{bookId}")
    protected String addCopy(@PathVariable("bookId") Integer bookId) {
        Optional<Book> bookBox = bookRepository.findById(bookId);
        if (bookBox.isPresent()) {
            Copy copy = new Copy();
            copy.setBook(bookBox.get());
            copyRepository.save(copy);
        }
        return "redirect:/books";
    }

    @GetMapping("/copy/add/t/{bookTitle}")
    protected String addCopyByTitle(@PathVariable("bookTitle") String bookTitle) {
        Optional<Book> bookBox = bookRepository.findByTitle(bookTitle);
        if (bookBox.isPresent()) {
            Copy copy = new Copy();
            copy.setBook(bookBox.get());
            copyRepository.save(copy);
        }
        return "redirect:/books";
    }

}
