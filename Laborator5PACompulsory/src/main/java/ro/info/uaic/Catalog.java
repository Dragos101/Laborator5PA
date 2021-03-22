package ro.info.uaic;

import java.awt.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Catalog implements Serializable{
    private List<Multimedia> listaMultimedia;
    private Desktop desktop;
    private File fisier;

    Catalog(){
        listaMultimedia = new LinkedList<>();
        desktop = null;
        fisier = new File("");

    }

    /**
     * Adaug in listaMultimedia item-ul item
     * @param item
     */
    public void add(Multimedia item){
        listaMultimedia.add(item);
    }
    /**
     * printeaza listaMultimedia
     */
    public void list(){
        for(int i = 0; i < listaMultimedia.size(); ++i)
            System.out.println(listaMultimedia.get(i).getName() + " " + listaMultimedia.get(i).getPath() + " " + listaMultimedia.get(i).getDate());
    }
    /**
     * Compara name1 cu name2. returneaza 1 daca sunt egale / 0 daca nu
     * @param name1
     * @param name2
     * @return
     */
    public int compareNames(String name1, String name2){
        if(name1.compareTo(name2) == 0) return 1;
        return 0;
    }
    /**
     * Cauta numele nume in listaMultimedia. Daca gaseste fisierul cu numele dorit se returneaza pozitia in listaMultimedia
     * Altfel returneaza -1 - nu se gaseste in listaMultimedia
     * @param nume
     * @return
     */
    public int getItemByName(String nume){
        for(int i = 0; i < listaMultimedia.size(); ++i)
            if(compareNames(listaMultimedia.get(i).getName(), nume) == 1) return i;
        return -1;
    }
    /**
     * nume - este numele fisierului pe care vreau sa-l deschid
     * dupa caut numele in listaMultimedia pentru a gasi pozitia pe care se afla
     * fisierul are path-ul fisierului pe care vreau sa-l deschid
     * @param nume
     */
    public void play(String nume){
        int pozitie;
        try{
            if(Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
                pozitie = getItemByName(nume);
                fisier = new File(listaMultimedia.get(pozitie).getPath());
                desktop.open(fisier);
            }
        }
        catch (Exception evt){
            System.out.println(evt.toString());
        }
    }
    /**
     * Salveaza catalogul de la in fisierul de la locatioa pathToFile
     * @param catalog
     * @param pathToFile
     */
    public void save(Catalog catalog, String pathToFile) throws CatalogLoadException {
        try{
            FileOutputStream fout = new FileOutputStream(pathToFile);
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(catalog);
            out.flush();
            out.close();
        }
        catch(Exception evt){
            throw new CatalogLoadException();
        }
    }
    /**
     * citeste informatiile salvate in fisierul unde s-a salvat un catalog
     * si il returneaza
     * @param pathToFile
     */
    public void load(String pathToFile) throws CatalogLoadException {
        try{
            FileInputStream fileInputStream = new FileInputStream(pathToFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Catalog p2 = (Catalog) objectInputStream.readObject();
            objectInputStream.close();
            p2.list();
        }
        catch(Exception evt){
            throw new CatalogLoadException();
        }
    }
    /**
     * getter pentru listaMultimedia
     * @return
     */
    public List<Multimedia> getListaMultimedia(){return listaMultimedia;}
    /**
     * setter listaMultimedia
     * @param lista
     */
    public void setListaMultimedia(List<Multimedia> lista){this.listaMultimedia = lista;}

}
