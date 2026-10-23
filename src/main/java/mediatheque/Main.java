package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("Annie Ernaux", "L'évènement"));
        mediatheque.addItem( new Book("Wajdi Mouawad", "Incendie"));
        mediatheque.addItem( new CD(11, "Transformer"));
        mediatheque.printCatalog();
        //mediatheque.printOnlyBooks();
        //mediatheque.printOnlyCDs();
    }
}
