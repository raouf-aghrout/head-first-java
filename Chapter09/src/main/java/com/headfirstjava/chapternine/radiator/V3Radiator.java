package com.headfirstjava.chapternine.radiator;

import java.util.ArrayList;

public class V3Radiator extends V2Radiator {

    public V3Radiator(ArrayList arrayList) {
        // super(arrayList);

        for (int g = 0; g < 10; g++) {
            arrayList.add(new SimUnit("V3Radiator"));
        }
    }
}
