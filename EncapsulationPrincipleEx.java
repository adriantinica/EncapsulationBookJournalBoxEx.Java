
/**
 * https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/oop/encapsulation/blox.DYN.ro.md
 */
public class EncapsulationPrincipleEx {

    public static void main(String[] args) {
        
        Book firstBook = new Book(100, "Programming Basics", "John Doe", 1991);
        Book anotherBook = new Book(150, "Frumoasa Adormita", "Charles Perrault", 1697);

        Journal gazeta = new Journal(32, "Politica astazi", "Politic");

        // HW3:  Răspundeți la întrebarea: stiind că proprietatea title din clasa cărții (Book) este privată și sa zicem,
        // avem 2 obiecte din această clasă ( Book: oneBook, anotherBook ) - poate `` `oneBooksa acceseze proprietateaanotherBook.title``` direct - ? Argumentati!

        //Nu, obiectul oneBook nu poate accesa direct proprietatea anotherBook.title deoarece proprietatea title este declarată ca privata în clasa Book. 
        //  PUTEM FACE ACEST LUCRU utilizand getterele si setterele care au fost inpuse mai devreme.

        System.out.println(anotherBook.getTitle());
        String title = anotherBook.getTitle();
        firstBook.setTitle(title);
        System.out.println(firstBook.getTitle());
        System.out.println();


        //Creați clasa Application cu main(...) și în ea:
                //Creați 2 boxe (firstBox, secondBox)

        Box firstBox = new Box();
        Box secondBox = new Box();

        //Creați și puneți într-o cutie - o carte și în alta - o revistă

        firstBox.setContent(gazeta);
        secondBox.setContent(firstBook);
        secondBox.setContent(gazeta);
        
        //Afisati ambele casete către consolă

        //chat
        System.out.println("Continutul primei cutii:");
        ThingInteface contentFirstBox = firstBox.getContent();
        if (contentFirstBox instanceof Journal) {
            Journal journalInFirstBox = (Journal) contentFirstBox;
            System.out.println("Revista: " + journalInFirstBox.getTitle());
        } else {
            System.out.println("Cutia este goala.");
        }

        System.out.println();

        System.out.println("Continutul celei de-a doua cutii:");
        ThingInteface contentSecondBox = secondBox.getContent();
        if (contentSecondBox instanceof Book) {
            Book bookInSecondBox = (Book) contentSecondBox;
            System.out.println("Carte: " + bookInSecondBox.getTitle());
        } else {
            System.out.println("Cutia este goala.");
        }
    
    }
}


    


/**
 1 În comentariul 1, interfața ThingInteface declară două metode, setName(String name) și getName(),
   care sunt utilizate pentru a seta și obține numele unui obiect (lucru) reprezentat în interiorul clasei Box.


   2.înțeleg că interface "Thing Inteface " este  o interfață care servește drept contract pentru clasele care doresc să implementeze
    funcția de a seta și a obține numele unui obiect. 
*/
interface ThingInteface {
    public void setName(String name);
    public String getName();
}

class Box {
    /**
    2 ...
    */

    
    private ThingInteface content;

    public Box() {
    }


    public ThingInteface getContent() {
        return content;
    }

    public void setContent(ThingInteface content) {
        this.content = content;
    }

    

    // 3 ...    
   
}


class Book  implements ThingInteface{
    
    private Integer pages;
    private String title;
    private String authorName;
    private Integer publishingYear;

    // constructor
    
    public Book() {
    }
    
    public Book(Integer pages, String title, String authorName, Integer publishingYear) {
        this.pages = pages;
        this.title = title;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    //setters and getters 

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }

    

    


}





class Journal implements ThingInteface{

    private Integer pages;
    private String title;
    private String category;

    //constructors 
    
    public Journal() {
    }
    
    public Journal(Integer pages, String title, String category) {
        this.pages = pages;
        this.title = title;
        this.category = category;
    }



    // setters and getters 
    public Integer getPages() {
        return pages;
    }
    
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        
    }

   
    
}

