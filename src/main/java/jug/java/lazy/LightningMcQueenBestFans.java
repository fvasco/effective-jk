package jug.java.lazy;

import jug.kotlin.MazdaMX5;

import java.lang.invoke.VarHandle;
import java.util.List;

public class LightningMcQueenBestFans {

    private Object list = new Object();

    public List<MazdaMX5> getList() {
        var res = list;
        if (!(res instanceof List)) {
            synchronized (res) {
                res = list;
                if (!(res instanceof List)) {
                    res = List.of(new MazdaMX5("Mia"), new MazdaMX5(("Tia")));
                    VarHandle.releaseFence();
                    list = res;
                }
            }
        }
        return (List<MazdaMX5>) res;
    }
}
