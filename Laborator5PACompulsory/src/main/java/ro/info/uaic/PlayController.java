package ro.info.uaic;

import java.awt.*;
import java.io.File;

public class PlayController implements Play{
    private Catalog catalog;
    private String name;
    private Desktop desktop;
    private File file;

    PlayController(){
        catalog = new Catalog();
        desktop = null;
        file = null;
        name = null;
    }

    public void play(){
        int pozitie, ok = 0;
        /**
         * se verifica daca au fost initializate
         */
        try{
            if(name != null)
                if(catalog != null) ok = 1;
        }
        catch (Exception evt){
            System.out.println("Ceva nu a fost initializat inainte sa se dea play\nInitializeaza name si catalogul pentru a putea accesa comanda play");

        }
        try{
            if(Desktop.isDesktopSupported()) {
                desktop = Desktop.getDesktop();
                pozitie = catalog.getItemByName(name);
                file = new File(catalog.getListaMultimedia().get(pozitie).getPath());
                desktop.open(file);
            }
        }
        catch (Exception evt){
            System.out.println(evt.toString());
        }
    }
    /**
     * setter pentru catalog
     * @param catalog
     */
    public void setCatalog(Catalog catalog){
        this.catalog = catalog;
    }
    /**
     * setter pentru numele fisierului
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
}
