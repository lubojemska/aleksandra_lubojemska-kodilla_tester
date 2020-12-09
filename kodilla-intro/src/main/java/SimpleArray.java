public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Witcher 1";
        books[1] = "Witcher 2";
        books[2] = "Witcher 3";
        books[3] = "Witcher 4";
        books[4] = "Witcher 5";
        System.out.println(books[2]);
        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }
}
