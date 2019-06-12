import org.junit.Before;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Dune", "Frank Herbert", "Sci-Fi");
    }

}
