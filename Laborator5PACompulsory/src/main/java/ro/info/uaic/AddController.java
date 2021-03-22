package ro.info.uaic;

public class AddController implements Add{
    Catalog catalog;

    AddController(){
        catalog = new Catalog();
    }

    /**
     * adauga item in catalog
     * @param item
     */
    public void add(Multimedia item){
        catalog.add(item);
    }
    /**
     * setter pentru catalog
     * @param catalog
     */
    public void setCatalog(Catalog catalog){
        this.catalog = catalog;
    }
}
