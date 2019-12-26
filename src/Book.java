class Book {
    String title;
    String author;
}



class BookTest {
    public static void main (String[] args) {
        Book[] books = new Book[3];

        books[0].title = "Плоды Java";
        books[1].title = "Java Гэтсби";
        books[2].title = "Сборник рецептов по Java";

        books[0].author = "Боб";
        books[1].author = "Сью";
        books[2].author = "Ян";

        for (int i = 0; i < books.length; i++) {
            System.out.print( books[i].title );
            System.out.print( ", автор" );
            System.out.print( books[i].author );
        }
    }
}
