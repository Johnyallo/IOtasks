package OnlineBook;

public class Book {
    String name;
    Author author;
    int year;
    int pages;
    int rating;

    public Book(String name, Author author, int year, int pages, int rating) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.rating = rating;
    }

    public static Boolean isGoodBook(Book book) {
        if (book.rating < 20) return true;
        else return false;
    }

    public static String whatIsBigger(Book book1, Book book2) {
        String result = null;
        if (book1.pages > book2.pages) return result = book1.name + " bigger than " + book2.name;
            //System.out.println(book1.name + " bigger than " + book2.name);
        if (book1.pages < book2.pages) return result = book2.name + " bigger than " + book1.name;
            //System.out.println(book2.name + " bigger than " + book1.name);
        if (book1.pages == book2.pages) return result = book1.name + " equals " + book2.name;
            //System.out.println(book1.name + " equals " + book2.name);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", year=" + year +
                ", pages=" + pages +
                ", rating=" + rating +
                '}';
    }
}
