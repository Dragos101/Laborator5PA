package ro.info.uaic;

import javax.naming.ldap.Control;
import java.util.Scanner;

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

        //catalog.save(catalog, "C:\\Users\\40749\\OneDrive\\Desktop\\catalog\\catalogSalvat.txt");
        //catalog.load(catalog, "C:\\Users\\40749\\OneDrive\\Desktop\\catalog\\catalogSalvat.txt");

        /**
         * OPTIONAL
         * Avem deja catalogul cu cateva instante o sa-l folosim pe acesta
         */


        Add add = new AddController();
        List list = new ListController();
        Play play = new PlayController();
        Save save = new SaveController();
        Load load = new LoadController();
        boolean stop = false;
        String comanda = null;
        Scanner in = new Scanner(System.in);
        while(!stop){
            comanda = in.nextLine();
            if(comanda.compareTo("stop") == 0){
                stop = true;
                System.out.println("S-a oprit programul");
            }
            if(comanda.compareTo("add") == 0){
                add.setCatalog(catalog);
                /**
                     * Declara aici ce vrei sa adaugi in catalog
                     */
                Book book2 = new Book();
                book2.setName("Carte2");
                book2.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\Nico\\carteNico.pdf");
                book2.setAutor("Dragos");
                add.add(book2);
                System.out.println("Comanda add apelata cu succes");
            }
            if(comanda.compareTo("list") == 0){
                list.setCatalog(catalog);
                list.list();
                System.out.println("Comanda list apelata cu succes");
            }
            if(comanda.compareTo("play") == 0){
                play.setCatalog(catalog);
                play.setName("Carte");
                play.play();
                System.out.println("Comanda play apelata cu succes");
            }
            if(comanda.compareTo("save") == 0){
                save.setCatalog(catalog);
                save.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\catalog\\catalogSalvat.txt");
                save.save();
                System.out.println("Comanda save apelata cu succes");
            }
            if(comanda.compareTo("load") == 0){
                load.setPath("C:\\Users\\40749\\OneDrive\\Desktop\\catalog\\catalogSalvat.txt");
                load.load();
                System.out.println("Comanda load apelata cu succes");
            }
        }

    }
}
