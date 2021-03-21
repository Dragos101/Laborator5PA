package ro.info.uaic;

import java.io.Serializable;

public class Photo implements Multimedia, Serializable {
    private String name, path, date;

    Photo(){
        this.name = null;
        this.path = null;
        this.date = null;
    }

    /**
     * Setter pentru nume
     * @param nume
     */
    public void setName(String nume){
        this.name = nume;
    }
    /**
     * getter pentru nume
     * @return
     */
    public String getName(){
        return name;
    }
    /**
     * setter pentru path
     * @param path
     */
    public void setPath(String path){
        this.path = path;
    }
    /**
     * getter pentru path
     * @return
     */
    public String getPath(){
        return path;
    }
    /**
     * setter pentru date
     * @param date
     */
    public void setDate(String date){
        this.date = date;
    }
    /**
     * getter pentru date
     * @return
     */
    public String getDate(){
        return date;
    }
}
