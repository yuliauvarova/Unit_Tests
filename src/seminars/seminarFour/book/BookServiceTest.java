package seminars.seminarFour.book;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BookServiceTest {

    @Test
    void testBookService(){
        BookRepository bookRepository = mock(BookRepository.class);
        when(bookRepository.findById("1")).thenReturn(new Book("1","testtitle", "testauthor"));
        BookService bookService = new BookService(bookRepository);
        assertThat(bookRepository.findById("1").getAuthor()).isEqualTo("testauthor");
        assertThat(bookRepository.findById("1").getTitle()).isEqualTo("testtitle");

    }
}