package OnlineBook;

public class User {
    String email;
    String name;
    String surname;
    Book favoriteBook;
    static int totalOnline;

    public User(String email, String name, String surname, Book favoriteBook) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.favoriteBook = favoriteBook;
        totalOnline += 1;
    }

    public static int countOfUsers() {
        return totalOnline;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", favoriteBook=" + favoriteBook +
                '}';
    }
}
