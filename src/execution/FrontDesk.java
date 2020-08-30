/*   Created by IntelliJ IDEA.
 *   Author: Jaish Chimnani (dbc2201)
 *   Date: 30-08-2020
 *   Time: 13:08
 *   File: Book.java
 */
package execution;

import java.util.Scanner;

public class FrontDesk{

    private static final byte NEW_BOOK_ISSUE = (byte) 1;
    private static final byte RETURNING_ISSUED_BOOK = (byte) 2;
    private static final byte ISSUED_BOOKS = (byte) 3;
    private static final byte EXIT = (byte) 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte inputFromEndUser;
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issues book for me.\n" +
                "3. Show me all my issues books.\n" +
                "4. Exit.\n");
        inputFromEndUser = (byte) scanner.nextInt();
    }
}