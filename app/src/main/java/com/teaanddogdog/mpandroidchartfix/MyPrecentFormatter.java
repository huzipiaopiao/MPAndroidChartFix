package com.teaanddogdog.mpandroidchartfix;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

/**
 * @author banbury
 * @version v1.0
 * @created 2018/8/3_17:50.
 * @description
 */

public class MyPrecentFormatter extends PercentFormatter {


    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return super.getFormattedValue(value, entry, dataSetIndex, viewPortHandler) + (String) entry.getData();
//        return super.getFormattedValue(value, entry, dataSetIndex, viewPortHandler) + "test";
    }

}
