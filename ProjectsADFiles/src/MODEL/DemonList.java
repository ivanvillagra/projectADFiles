package MODEL;

import java.util.ArrayList;
import java.util.List;

public class DemonList {
    private List<Demon> demonList;

    public DemonList() {
        this.demonList = new ArrayList<>();
    }

    public List<Demon> getDemonList() {
        return demonList;
    }

    public void setDemonList(List<Demon> demonList) {
        this.demonList = demonList;
    }
}
