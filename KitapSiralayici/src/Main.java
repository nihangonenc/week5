import java.util.TreeSet;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        TreeSet<Book> book1 = new TreeSet<>(new OrderPageComparator());

        book1.add(new Book("Şeker Portakalı", 132, "J. M. de Vasconcelos", 1968));
        book1.add(new Book("Kumral Ada Mavi Tuna", 432, "Buket Uzuner", 1997));
        book1.add(new Book("Gece Yarısı Kütüphanesi", 282, "Matt Haig", 2021));
        book1.add(new Book("Seyir", 343, "Piraye", 2019));
        book1.add(new Book("Itiraflarım", 76, "Tolstoy", 1882));


        System.out.println("Kayıtlı kitapların sayfa sayısına göre küçükten büyüğe sıralanışı: ");
        for (Book b: book1){ // Sayfa sayısına göre sıralar.
            System.out.println(b.getNumberOfPage());
        }

        System.out.println("--------------------------------------------------------------------");

        TreeSet<Book> book2 = new TreeSet<>(new OrderNameComparator());
        book2.addAll(book1);

        System.out.println("Kayıtlı kitapların ismine göre alfabetik sıralanışı: ");
        for (Book b: book2){ //Kitap ismine göre sıralar.
            System.out.println(b.getBookName());
        }
    }
}