package filtre;

import java.util.ArrayList;
import java.util.List;

public class MasaList {
    private ArrayList<MasaFiltre> list = new ArrayList<>();
    private MasaFiltre m1 = new MasaFiltre(1000, true, false, false);
    private MasaFiltre m2 = new MasaFiltre(1000, true, true, false);
    private MasaFiltre m3 = new MasaFiltre(1000, true, true, true);
    private MasaFiltre m4 = new MasaFiltre(2000, false, true, true);
    private MasaFiltre m5 = new MasaFiltre(3000, true, false, true);
    private MasaFiltre m6 = new MasaFiltre(1000, false, false, false);

    public MasaList() {
        list = new ArrayList<MasaFiltre>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
    }

    public List<MasaFiltre> getList() {
        return list;
    }
}
