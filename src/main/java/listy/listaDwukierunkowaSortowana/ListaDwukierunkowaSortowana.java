package listy.listaDwukierunkowaSortowana;


public class ListaDwukierunkowaSortowana {
    ElementListy start;
    ElementListy end;
    ElementListy temp;


    public void add(ElementListy elementListy) {
        if (start == null) {
            start = elementListy;
            end = elementListy;

        } else {
            temp = start;

            while (temp.getNumer() < elementListy.getNumer()) {
                if (temp.getNext() == null) {
                    elementListy.setPrev(temp);
                    elementListy.setNext(temp.getNext());
                    temp.setNext(elementListy);
                    end = elementListy;
                } else {
                    temp = temp.getNext();
                }
            }
            if (temp.getNumer()>elementListy.getNumer()){
                elementListy.setPrev(temp.getPrev());
                elementListy.setNext(temp);
                temp.getPrev().setNext(elementListy);
                temp.setPrev(elementListy);
            }
        }
    }

    public void printAllodPrzodu() {
        temp = start;
        while (temp != null) {
            System.out.println(temp.getNumer());
            temp = temp.getNext();
        }
    }
    public void printAllodTylu(){
        temp = end;
        while (temp != null) {
            System.out.println(temp.getNumer());
            temp = temp.getPrev();
        }
    }
}
