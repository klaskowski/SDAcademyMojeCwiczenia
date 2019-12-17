package listy.listaDwukierunkowaSortowana;

public class Main {
    public static void main(String[] args) {

        ListaDwukierunkowaSortowana listaDwukierunkowaSortowana = new ListaDwukierunkowaSortowana();

        listaDwukierunkowaSortowana.add(new ElementListy(1));
        listaDwukierunkowaSortowana.add(new ElementListy(5));
        listaDwukierunkowaSortowana.add(new ElementListy(2));
        listaDwukierunkowaSortowana.add(new ElementListy(3));
        listaDwukierunkowaSortowana.add(new ElementListy(8));
        listaDwukierunkowaSortowana.add(new ElementListy(7));

        listaDwukierunkowaSortowana.printAllodPrzodu();
        System.out.println("-------------------------");
        listaDwukierunkowaSortowana.printAllodTylu();
    }
}
