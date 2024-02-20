package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BokServiceImpl implements BokService {

    private final BookRepository bookRepository;

    public BokServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Iterable<Book> findAll() {
        //typically you would have business logic here
        return bookRepository.findAll();
    }
}
