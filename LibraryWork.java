public interface LibraryWork {

    void addBook(int id, String title, String author);

    void issueBook(int id);

    void returnBook(int id);

    void displayBooks();
}
