package listy.listaJednokierunkowa;

public class ElementListyJednokierunkowej {
    ElementListyJednokierunkowej poprzedniElementListyJednokierunkowej;
    String numer;

    public ElementListyJednokierunkowej(String numer) {
        this.numer = numer;
    }

    public ElementListyJednokierunkowej getPoprzedniElementListyJednokierunkowej() {
        return poprzedniElementListyJednokierunkowej;
    }

    public void setPoprzedniElementListyJednokierunkowej(ElementListyJednokierunkowej poprzedniElementListyJednokierunkowej) {
        this.poprzedniElementListyJednokierunkowej = poprzedniElementListyJednokierunkowej;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }
}
