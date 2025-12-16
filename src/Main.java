class Main {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(12, 12);
    System.out.println(rectangle);

    System.out.println("***************************************************");

    Book b = new Book();
    b.setTitle("War and Peace");
    b.setAuthor("Tolstoy");
    b.setAvailable(true);
    b.setYear(1867);
    System.out.println(b.getAuthor());
    b.markAsBorrowed();
    System.out.println(b.getAuthor());
    System.out.println(b);
    }
}