package listy.listaJednokierunkowa;

public class Main {
    public static void main(String[] args) {
        ListaJednokierunkowa listaJednokierunkowa = new ListaJednokierunkowa();
        listaJednokierunkowa.add(new ElementListyJednokierunkowej("jeden"));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej("trzy"));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej("dwa"));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej("cztery"));
        listaJednokierunkowa.add(new ElementListyJednokierunkowej("pięć"));

        listaJednokierunkowa.printAll();
        System.out.println(listaJednokierunkowa.size());
    }
}
