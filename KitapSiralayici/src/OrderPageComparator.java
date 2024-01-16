import java.util.Comparator;
public class OrderPageComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return b1.getNumberOfPage() - b2.getNumberOfPage();
    }
}
