package filtre;

import java.util.Scanner;

public class KullanıcıVeri {
    private Scanner scan = new Scanner(System.in);
    private int tempBahis;
    private boolean hızlı;
    private boolean tek;
    private boolean rovans;

    public void veriBahis() {
        System.out.println(" Bahis Aralığı, Lütfen 200 ile 5000 Arasında Bir Değer Giriniz");
        this.tempBahis = scan.nextInt();
    }

    public void veriHızlı() {
        System.out.println(" Hızlı , E Veya H");
        while (true) {
            scan.nextLine();
            String tempHızlı = scan.nextLine();
            if (tempHızlı.equalsIgnoreCase("E")) {
                this.hızlı = true;
                break;
            } else if (tempHızlı.equalsIgnoreCase("H")) {
                this.hızlı = false;
                break;
            } else
                System.out.println("Yeniden değer giriniz ");
        }
    }

    public void veriTek() {

        System.out.println("Teke Tek , E Veya H");
        while (true) {
            String tempTekeTek = scan.nextLine();
            if (tempTekeTek.equalsIgnoreCase("E")) {
                tek = true;
                break;
            } else if (tempTekeTek.equalsIgnoreCase("H")) {
                tek = false;
                break;
            } else
                System.out.println("Yeniden değer giriniz ");
        }
    }

    public void veriRovans() {
        System.out.println("Rövanş , Evet Veya Hayır");
        while (true) {
            String tempRovans = scan.nextLine();
            if (tempRovans.equalsIgnoreCase("E")) {
                rovans = true;
                break;
            } else if (tempRovans.equalsIgnoreCase("H")) {
                rovans = false;
                break;
            } else
                System.out.println("Yeniden değer giriniz ");
        }
    }

    public int getTempBahis() {
        return tempBahis;
    }

    public boolean isHızlı() {
        return hızlı;
    }

    public boolean isTek() {
        return tek;
    }

    public boolean isRovans() {
        return rovans;
    }
}
