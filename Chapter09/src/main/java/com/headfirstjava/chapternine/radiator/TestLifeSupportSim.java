package com.headfirstjava.chapternine.radiator;

import java.util.ArrayList;

public class TestLifeSupportSim {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        V2Radiator v2Radiator = new V2Radiator(arrayList);
        V3Radiator v3Radiator = new V3Radiator(arrayList);

        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(arrayList);
        }
    }
}
