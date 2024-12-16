import java.util.ArrayList;

public class Libraries implements LibraryWork {
    
    private static Libraries instance; 
    private final ArrayList<Book> books; 
    private Libraries() {
        books = new ArrayList<>();
    }
    public static Libraries getInstance() {
        if (instance == null) {
            instance = new Libraries();
        }
        return instance;
    }
    public void addBook(int id, String title, String author){
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    public void issueBook(int id){
        try {
            for (Book book : books) {
                if (book.getId() == id) {
                    if (!book.isIssued()) {
                        book.setIssued(true);
                        System.out.println("Book issued successfully!");
                        return;
                    } else {
                        throw new Exception("Book is already issued.");
                    }
                }
            }
            throw new Exception("Book with ID " + id + " not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void returnBook(int id){
        try {
            for (Book book : books) {
                if (book.getId() == id) {
                    if (book.isIssued()) {
                        book.setIssued(false);
                        System.out.println("Book returned successfully!");
                        return;
                    } else {
                        throw new Exception("Book was not issued.");
                    }
                }
            }
            throw new Exception("Book with ID " + id + " not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void displayBooks(){
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
