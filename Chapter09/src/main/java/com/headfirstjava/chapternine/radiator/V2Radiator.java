package com.headfirstjava.chapternine.radiator;

import java.util.ArrayList;

public class V2Radiator {

    public V2Radiator() {

    }

    public V2Radiator(ArrayList arrayList) {

        for (int x = 0; x < 5; x++) {
            arrayList.add(new SimUnit("V2Radiator"));
        }
    }
}
