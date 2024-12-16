import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        Libraries library = Libraries.getInstance();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:{
                    System.out.print("Enter Book ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Book Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter Book Author: ");
                        String author = scanner.nextLine();
                        library.addBook(id,title,author);
                    break;
                }
                case 2:{ 
                    System.out.print("Enter Book ID: ");
                        int issueId = scanner.nextInt();
                        library.issueBook(issueId);
                    break;
                }
                case 3:{
                    System.out.print("Enter Book ID to return: ");
                        int returnId = scanner.nextInt();
                        library.returnBook(returnId);
                    break;
                }
                case 4:{
                    library.displayBooks();
                    break;
                }
                case 5:{
                    System.out.println("Exiting the system. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    
                    break;
                }
            }
        }
    }
    
}
