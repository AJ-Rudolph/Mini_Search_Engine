package app;
public class App {

    public static void main(String[] args) {
        BookReader reader = new BookReader("./books/", "Alice_in_Wonderland.txt");
        reader.readFile();
    }





}