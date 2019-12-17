package listy.listaDwukierunkowa;

public class ElementListyDwukierunkowej {
    ElementListyDwukierunkowej next;
    ElementListyDwukierunkowej prev;
    String nazwa;

    public ElementListyDwukierunkowej(String nazwa) {
        this.nazwa = nazwa;
    }

    public ElementListyDwukierunkowej getNext() {
        return next;
    }

    public void setNext(ElementListyDwukierunkowej next) {
        this.next = next;
    }

    public ElementListyDwukierunkowej getPrev() {
        return prev;
    }

    public void setPrev(ElementListyDwukierunkowej prev) {
        this.prev = prev;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
