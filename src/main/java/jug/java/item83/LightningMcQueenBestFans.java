package jug.java.item83;

import jug.kotlin.MazdaMX5;

import java.util.List;

public class LightningMcQueenBestFans {

    private volatile List<MazdaMX5> list;

    public List<MazdaMX5> getList() {
        var res = list;
        if (res == null) {
            synchronized (this) {
                res = list;
                if (res == null) {
                    res = List.of(new MazdaMX5("Mia"), new MazdaMX5(("Tia")));
                    list = res;
                }
            }
        }
        return res;
    }
}
