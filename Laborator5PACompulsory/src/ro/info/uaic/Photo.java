package ro.info.uaic;

public class Photo implements Multimedia{
    private String nume, path, date;

    Photo(){
        this.nume = null;
        this.path = null;
        this.date = null;
    }

    /**
     * Setter pentru nume
     * @param nume
     */
    public void setName(String nume){
        this.nume = nume;
    }
    /**
     * getter pentru nume
     * @return
     */
    public String getName(){
        return nume;
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
    public String getNume(){
        return date;
    }
}
