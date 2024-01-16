import java.util.Comparator;
public class OrderNameComparator implements Comparator<Book> {

    public int compare(Book b1,Book b2){
        return b1.getBookName().compareTo(b2.getBookName());
    }
}

