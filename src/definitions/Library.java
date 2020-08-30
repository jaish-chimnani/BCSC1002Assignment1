/*   Created by IntelliJ IDEA.
 *   Author: Jaish Chimnani (dbc2201)
 *   Date: 30-08-2020
 *   Time: 13:08
 *   File: Book.java
 */
package definitions;

public class Library{
    private Book[] books;

    public Library() {
        this.books = new Book[1000];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Books" + (i + 1));
        }
    }

    public Library(Book[] books) {
        this.books = books;
    }

    /**
     * This method return current book that are currently avilable book[] .
     *
     * @return This method return current book that are currently avilable book[] .
     */

    public Book[] getBooks() {
        return books.clone();
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

}