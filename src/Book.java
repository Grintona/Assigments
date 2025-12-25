public class Book {
    private int id;
    private static int idGen = 1;
    private String title;
    private String author;
    private int year ;
    private boolean available;

    public Book(){
        this.idGen = idGen++;
    }

    public Book(String title, String author, int year){
    this.title = title;
    this.author = author;
    this.year = year;
    this.available = true;
    this.idGen = idGen++;

    }

    public int  getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public  int getYear(){
        return year;
    }
    public boolean getAvailable(){
        return available;
    }

    public void setId(int id){
        this.id = idGen;
    }

    // Setter Title
    public void setTitle(String title){
        if(title.isEmpty()){
            System.out.println("title is null or empty");
        }
        else{this.title = title;
            }
        }
   // setter Author
    public  void setAuthor(String author){
        if((author.length() < 0) || (author == null)) System.out.println("author is null or empty");
        else this.author = author;
    }

    //Setter year
    public void setYear(int year){
        if(year <= 1500 || year >= 2025) System.out.println("year is incorrect");
        else this.year = year;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }

    public void markAsBorrowed(){
        setAvailable(false);
    }

    public void markAsReturned(){
        setAvailable(true);
    }

    public String toString(){
        return "id= " + id + " " + "title- " + title + " " +"author- "+ author + " " + "Year- " + year + " " + "Available "+ available ;
    }
}
