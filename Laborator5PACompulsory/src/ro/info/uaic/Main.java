package ro.info.uaic;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Song song1 = new Song();
        Song song2 = new Song();
        Photo photo1 = new Photo();
        Photo photo2 = new Photo();
        Book book1 = new Book();

        song1.setName("Stresu");
        song1.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\Facultate\\testMelodie\\bunaSeara.mp3");
        song2.setName("Stresu2");
        song2.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\Facultate\\testMelodie\\Generic.mp3");

        photo1.setName("Poza");
        photo1.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\Proiect engleza\\gme.png");
        photo2.setName("Poza2");
        photo2.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\Proiect engleza");

        book1.setName("Carte");
        book1.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\Nico\\carteNico.pdf");
        book1.setAutor("Dragos");

        catalog.add(song1);
        catalog.add(photo1);
        catalog.add(song2);
        catalog.add(photo2);
        catalog.add(book1);

        //catalog.print();

        //catalog.play("Carte");

        catalog.save(catalog, "C:\\Users\\40749\\OneDrive\\Desktop\\catalog\\catalogSalvat.txt");
        catalog.load(catalog, "C:\\Users\\40749\\OneDrive\\Desktop\\catalog\\catalogSalvat.txt");

    }
}
