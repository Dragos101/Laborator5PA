package ro.info.uaic;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveController implements Save{
    private Catalog catalog;
    private String path;

    SaveController(){
        catalog = null;
        path = null;
    }

    /**
     * Salveaza catalogul intr-ul fisierul la destinatia path
     */
    public void save(){
        try{
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(catalog);
            out.flush();
            out.close();
        }
        catch(Exception evt){
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
     * setter path
     * @param path
     */
    public void setPath(String path){this.path = path;}
}
