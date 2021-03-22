package ro.info.uaic;

public class CatalogLoadException extends  Exception{
    private String mesaj;

    CatalogLoadException(){
        mesaj = null;
    }

    public CatalogLoadException(String message) {
        super();
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return mesaj;
    }
    public void setMessage(String message) {
        this.mesaj = message;
    }

}
