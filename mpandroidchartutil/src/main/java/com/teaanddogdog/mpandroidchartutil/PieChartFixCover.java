package com.teaanddogdog.mpandroidchartutil;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.github.mikephil.charting.charts.PieChart;
import com.teaanddogdog.mpandroidchartutil.renderer.PieChartRendererFixCover;

/**
 * @author banbury
 * @version v1.0
 * @created 2018/7/2_14:35.
 * @description 修复饼图 值在外部显示时，部分值会重叠的问题
 */

public class PieChartFixCover extends PieChart {
    private String mode;

    public PieChartFixCover(Context context) {
        this(context, null);
    }

    public PieChartFixCover(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PieChartFixCover(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        getAttrs(attrs);
    }

    private void getAttrs(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.MPAndroidChartUtil);
            mode = a.getString(R.styleable.MPAndroidChartUtil_mp_chart_out_value_place_mode);
            a.recycle();
        }
        ((PieChartRendererFixCover) mRenderer).setMode(mode);
    }


    @Override
    protected void init() {
        super.init();
        //此处把mRenderer替换成我们自己的PieChartRenderer
        mRenderer = new PieChartRendererFixCover(this, mAnimator, mViewPortHandler);
    }

}
