package listy.listaDwukierunkowa;

public class Main {
    public static void main(String[] args) {
        ListaDwukierunkowa listaDwukierunkowa = new ListaDwukierunkowa();
        listaDwukierunkowa.add(new ElementListyDwukierunkowej("jeden"));
        listaDwukierunkowa.add(new ElementListyDwukierunkowej("dwa"));
        listaDwukierunkowa.add(new ElementListyDwukierunkowej("trzy"));
        listaDwukierunkowa.add(new ElementListyDwukierunkowej("cztery"));
        listaDwukierunkowa.add(new ElementListyDwukierunkowej("pięć"));

        listaDwukierunkowa.printAllend();
        System.out.println("----");
        listaDwukierunkowa.printAllstart();
    }
}
