package ro.info.uaic;

import java.util.LinkedList;

public class ListController implements List{
    private Catalog catalog;

    ListController(){
        catalog = new Catalog();
    }

    /**
     * Printeaza lista
     */
    public void list(){
        for(int i = 0; i < catalog.getListaMultimedia().size(); ++i)
            System.out.println(catalog.getListaMultimedia().get(i).getName() + " " + catalog.getListaMultimedia().get(i).getPath());
    }
    /**
     * setter pentru catalog
     * @param catalog
     */
    public void setCatalog(Catalog catalog){
        this.catalog = catalog;
    }
    /**
     * getter pentru catalog
     * @return
     */
    public Catalog getCatalog(){ return catalog; }
}
