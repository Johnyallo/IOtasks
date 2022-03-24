package OnlineBook;

public class Author {
    String name;
    String surname;
    int birthday;
    String country;

    public Author(String name, String surname, int birthday, String country) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", country='" + country + '\'' +
                '}';
    }
}
