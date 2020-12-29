public class Book {
    private final String author,title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String a, String t) {
        return new Book(a,t);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

}
