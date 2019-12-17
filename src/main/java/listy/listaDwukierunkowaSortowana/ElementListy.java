package listy.listaDwukierunkowaSortowana;

public class ElementListy {
    private ElementListy next;
    private ElementListy prev;
    private int numer;

    public ElementListy(int numer) {
        this.numer = numer;
    }

    public ElementListy getNext() {
        return next;
    }

    public void setNext(ElementListy next) {
        this.next = next;
    }

    public ElementListy getPrev() {
        return prev;
    }

    public void setPrev(ElementListy prev) {
        this.prev = prev;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }
}
