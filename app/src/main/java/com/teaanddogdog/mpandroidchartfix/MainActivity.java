package com.teaanddogdog.mpandroidchartfix;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.LargeValueFormatter;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] lables1 = {"湿度传感器", "温度传感器", "震动传感器","test1"};
    String[] lables2 = {"井道", "电缆", "轿厢","test1"};
    private Random mRandom = new Random();
    private PieChart mPieChart1;
    private PieChart mPieChart2;
    private PieChart mPieChart3;
    private PieChart mPieChart4;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mPieChart1 = findViewById(R.id.pie_chart1);
        mPieChart2 = findViewById(R.id.pie_chart2);
        mPieChart3 = findViewById(R.id.pie_chart3);
        mPieChart4 = findViewById(R.id.pie_chart4);

        setPieChart(mPieChart1, lables1);
        setPieChart(mPieChart2, lables2);
        setPieChart(mPieChart3, lables2);
        setPieChart(mPieChart4, lables2);
    }


    private void setPieChart(PieChart pieChart, String[] alarm) {
        Description desc = new Description();
        desc.setEnabled(false);
//        desc.setText("PROVIDED_BY");
//        desc.setTextColor(getArgb());
//        desc.setYOffset(20);
        pieChart.setDescription(desc);
        Legend legend = pieChart.getLegend();
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        legend.setOrientation(Legend.LegendOrientation.VERTICAL);

//        pieChart.setRotationEnabled(false);
        pieChart.setRotationEnabled(true);
//        legend.setXOffset(-2);//调整legend向外2个dp
//        pieChart.setExtraRightOffset(30);//调整饼图右侧多30个dp，即向左移30dp

        List<PieEntry> entryList = new ArrayList<>();
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[3]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[0]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[1]));
        entryList.add(new PieEntry(mRandom.nextInt(200), alarm[2]));

        PieDataSet mDataSet = new PieDataSet(entryList, "");
        mDataSet.setSliceSpace(1);//各数据间的饼图间隔
        mDataSet.setColors(getArgb(), getArgb(), getArgb());//各数据的颜色
        mDataSet.setValueTextSize(10);//值的字体大小
        mDataSet.setValueTextColor(0xff000000);//值的颜色
        LargeValueFormatter valueFormatter = new LargeValueFormatter();
        valueFormatter.setAppendix("次");
        PercentFormatter percentFormatter = new PercentFormatter();
        mDataSet.setValueFormatter(percentFormatter);
        mDataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);//值显示的位置

        PieData data = new PieData(mDataSet);
        pieChart.setData(data);
        pieChart.setDrawEntryLabels(false);//是否在饼图上显示Lable
        pieChart.setUsePercentValues(true);//百分比显示
        pieChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                Toast.makeText(mContext, ((PieEntry) e).getLabel() + ":" + (int) e.getY() + "次", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected() {

            }
        });
        pieChart.animateY(2000);
        pieChart.invalidate();
    }

    private int getArgb() {
        return Color.argb(255, mRandom.nextInt(256), mRandom.nextInt(256), mRandom.nextInt(256));
    }
}
