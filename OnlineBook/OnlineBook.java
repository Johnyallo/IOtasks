package OnlineBook;

public class OnlineBook {
    public static void main(String[] args) {
        Author author1 = new Author("Gregori David", "Roberts", 1952, "Ausrtalia");
        Author author2 = new Author("Jack", "London", 1876, "England");
        Author author3 = new Author("Andrey", "Platonov", 1899, "USSR");

        Book shantaram = new Book("Shantaram", author1, 1991, 1300, 3);
        Book martinEden = new Book("Martin Eden", author2, 1909, 350, 5);
        Book kotlovan = new Book("Kotlovan", author3, 1930, 240, 55);

        User ivanov = new User("ivanov@mail.ru", "Viktor", "Ivanov", shantaram);
        User petrov = new User("petrov@mail.ru", "Ismail", "Petrov", martinEden);
        //User johnson = new User("jovi@mail.com", "Frank", "Johnson", kotlovan);


//        System.out.println(Book.isGoodBook(shantaram));
//        Book.whatIsBigger(shantaram, martinEden);;
//        System.out.println(ivanov.toString());
//        System.out.println(petrov.toString());
//        System.out.println(johnson.toString());
        System.out.println(User.countOfUsers());


    }
}
