# MPAndroidChartFix
[ ![Download](https://api.bintray.com/packages/teadoglibrary/MPAndroidChartFix/MPAndroidChartFix/images/download.svg) ](https://bintray.com/teadoglibrary/MPAndroidChartFix/MPAndroidChartFix/_latestVersion)

MPAndroidChart的辅助类，解决MPAndroidChart中的一些小细节，现已实现：解决原生PieChart值重合的问题

# 演示
#### 解决原生PieChart数据过多时，值在外面显示会重合的问题
![图示](https://github.com/huzipiaopiao/MPAndroidChartFix/blob/master/img/demo_img1.png)

# 使用方法：
## 1、依赖配置
- 在项目最外面的build.gradle文件中，allprojects节点下的repositories中添加：
`maven{ url "https://dl.bintray.com/teadoglibrary/MPAndroidChartFix" }`
- 再在app的build.gradle文件中，dependencies节点下添加，其中的版本建议根据最新版本修改：
`compile 'com.teaanddogdog:mpandroidchartutil:1.0.2'`
- 本库需要依赖MPAndroidChart使用，所以app的build.gradle文件中，dependencies节点下还要添加MPAndroidChart库：
`compile 'com.github.PhilJay:MPAndroidChart:v3.0.3'`

## 2、代码中使用

```
<com.teaanddogdog.mpandroidchartutil.PieChartFixCover
            android:id="@+id/pie_chart"
            android:layout_width="450dp"
            android:layout_height="450dp"
            app:mp_chart_out_value_place_mode="AVG"
            app:mp_chart_auto_adapt_text_size="true"
            />
```

和原生的PieChart用法相同，只是多了几个模式，需在xml中设置，暂没有提供代码中设置的方法：
使用了自定义属性，注意在根节点内添加：`xmlns:app="http://schemas.android.com/apk/res-auto"`

mp_chart_out_value_place_mode:有3种模式：
- （1）.`app:mp_chart_out_value_place_mode="AVG"`，左右等分可用空间，推荐用这个模式，默认也是这个模式，
此种模式下，提供了一个属性：`app:mp_chart_auto_adapt_text_size="true"`，如果设置为true，则值的字体大小会根据实际情况进行缩小，避免重叠，默认是false的
- ~~（2）.`app:mp_chart_out_value_place_mode="Top_Align"`，左右上对齐，下面不保证，下面可能会被挤出去（不推荐，感觉没用，所以已经删除了）~~
- （3）.`app:mp_chart_out_value_place_mode="Simple"`，右侧上对齐，右侧下面可能会被挤出去；左侧下对齐，左侧上面可能会被挤出去（不推荐，值有可能会被挤出去，如果要了解绘制原理，可以先看这个模式的绘制步骤）

## 3、说明：

- 本库是在MPAndroidChart版本为v3.0.3的基础上进行开发的
- 使用时，值的显示位置，请仅设置：mDataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);//值显示的位置
