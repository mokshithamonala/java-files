public class Book{
  public String Title;
  public String Author;
  public String Year_of_publication;
  public Book(String Title, String Author, String Year_of_publication){
  this.Title=Title;
  this.Author=Author;
  this.Year_of_publication=Year_of_publication;
  }
  public void Bookdetails()
  {
    System.out.println("Title:"+Title);
    System.out.println("Author:"+Author);
    System.out.println("Year_of_publication:"+Year_of_publication);
   }
  public static void main (String[] args){
  Book book1=new Book("Mahabaratam","Vyasa","3rd century");
  Book book2=new Book("Ramayanam","Valmiki","5th century");
  book1.Bookdetails();
  book2.Bookdetails();
  }
}