import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("Dune", "Frank Herbert", "Sci-Fi");
        book2 = new Book("Fire and Blood", "George R. R. Martin", "Fantasy");
        library.addBook(book1);
    }

    @Test
    public void canCountBooks(){
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void wontAddBookIfFull(){
        Book book3 = new Book("Carpet People", "Terry Pratchett", "Fantasy");
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }

}
