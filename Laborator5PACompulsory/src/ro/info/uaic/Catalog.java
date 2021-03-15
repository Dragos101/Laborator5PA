package ro.info.uaic;

import java.util.LinkedList;
import java.util.List;

public class Catalog {
    List<Multimedia> listaMultimedia;

    Catalog(){
        listaMultimedia = new LinkedList<>();
    }

    /**
     * adauga melodia s in listaMultimedia
     * @param s
     */
    public void add(Song s){
        listaMultimedia.add(s);
    }
    /**
     * adauga poza p in listaMultimedia
     * @param p
     */
    public void add(Photo p){ listaMultimedia.add(p); }
    /**
     * printeaza listaMultimedia
     */
    public void print(){
        for(int i = 0; i < listaMultimedia.size(); ++i)
            System.out.println(listaMultimedia.get(i).getName() + " " + listaMultimedia.get(i).getPath() + " " + listaMultimedia.get(i).getDate());
    }


}
