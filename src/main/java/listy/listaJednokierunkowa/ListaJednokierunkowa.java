package listy.listaJednokierunkowa;

public class ListaJednokierunkowa {
    ElementListyJednokierunkowej elementListyJednokierunkowej;


    public void add(ElementListyJednokierunkowej elementListyJednokierunkowej) {
        if (this.elementListyJednokierunkowej == null) {
            elementListyJednokierunkowej.poprzedniElementListyJednokierunkowej = null;
            this.elementListyJednokierunkowej = elementListyJednokierunkowej;
        } else {
            elementListyJednokierunkowej.poprzedniElementListyJednokierunkowej = this.elementListyJednokierunkowej;
            this.elementListyJednokierunkowej = elementListyJednokierunkowej;
        }
    }

    public void printAll() {
        ElementListyJednokierunkowej temp = this.elementListyJednokierunkowej;
        do {
            System.out.println(elementListyJednokierunkowej.getNumer());
            this.elementListyJednokierunkowej = elementListyJednokierunkowej.poprzedniElementListyJednokierunkowej;

        } while (elementListyJednokierunkowej != null);
        this.elementListyJednokierunkowej=temp;
    }

    public int size(){
        ElementListyJednokierunkowej temp = this.elementListyJednokierunkowej;
        int licznik=0;
        do {
            this.elementListyJednokierunkowej = elementListyJednokierunkowej.poprzedniElementListyJednokierunkowej;
            licznik++;
        } while (elementListyJednokierunkowej != null);
        this.elementListyJednokierunkowej=temp;
        return licznik;
    }
}