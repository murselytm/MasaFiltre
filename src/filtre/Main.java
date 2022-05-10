package filtre;


import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] Args) {

        MasaList tempList = new MasaList();
        List<MasaFiltre> list1 = tempList.getList();

        //int bahis;
        boolean hızlı;
        boolean tek;
        boolean rovans;

        KullanıcıVeri veri = new KullanıcıVeri();

        veri.veriBahis();
        veri.veriHızlı();
        veri.veriTek();
        veri.veriRovans();

        int bahis = veri.getTempBahis();
        hızlı = veri.isHızlı();
        tek = veri.isTek();
        rovans = veri.isRovans();


        List<MasaFiltre> filtreSonucları = list1.stream().filter(i -> bahis == i.getBahis() && hızlı == i.isHızlı() && tek == i.isTekeTek() && rovans == i.isRovans()).collect(Collectors.toList());
        System.out.println(filtreSonucları);
    }
}
