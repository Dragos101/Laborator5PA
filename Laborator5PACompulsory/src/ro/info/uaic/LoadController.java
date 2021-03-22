package ro.info.uaic;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadController implements Load{
    private String path;

    LoadController(){
        path = null;
    }

    /**
     * incarca un catalog de la o destinatie path
     */
    public void load(){
        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Catalog p2 = (Catalog) objectInputStream.readObject();
            objectInputStream.close();
            p2.list();
        }
        catch(Exception evt){
            System.out.println(evt.toString());
        }
    }
    /**
     * setter pentru path
     * @param path
     */
    public void setPath(String path){this.path = path;}
}
