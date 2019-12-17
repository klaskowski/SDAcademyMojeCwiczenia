package listy.listaDwukierunkowa;

public class ListaDwukierunkowa {

    ElementListyDwukierunkowej temp;
    ElementListyDwukierunkowej start;
    ElementListyDwukierunkowej end;


    public void add(ElementListyDwukierunkowej elementListyDwukierunkowej) {
        if (this.temp == null) {
            this.temp = elementListyDwukierunkowej;
            this.start= elementListyDwukierunkowej;

        } else {
            temp.setNext(elementListyDwukierunkowej);
            elementListyDwukierunkowej.setPrev(temp);
            temp = elementListyDwukierunkowej;
            this.end = elementListyDwukierunkowej;
        }


    }

    public void printAllend() {
        ElementListyDwukierunkowej elementListyDwukierunkowej = end;
        while (elementListyDwukierunkowej != null) {
            System.out.println(elementListyDwukierunkowej.getNazwa());
            elementListyDwukierunkowej = elementListyDwukierunkowej.getPrev();
        }
    }
    public void printAllstart() {
        ElementListyDwukierunkowej elementListyDwukierunkowej = start;
        while (elementListyDwukierunkowej != null) {
            System.out.println(elementListyDwukierunkowej.getNazwa());
            elementListyDwukierunkowej = elementListyDwukierunkowej.getNext();
        }
    }
}
