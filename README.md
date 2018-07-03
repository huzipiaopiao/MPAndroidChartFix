# MPAndroidChartFix
[ ![Download](https://api.bintray.com/packages/teadoglibrary/MPAndroidChartFix/MPAndroidChartFix/images/download.svg) ](https://bintray.com/teadoglibrary/MPAndroidChartFix/MPAndroidChartFix/_latestVersion)

MPAndroidChart的辅助类，解决MPAndroidChart中的一些小细节，现已实现：解决原生PieChart值重合的问题

# 使用方法：
## 1、依赖配置
在项目最外面的build.gradle文件中，allprojects节点下的repositories中添加：
```
maven{ url  "https://dl.bintray.com/teadoglibrary/MPAndroidChartFix" }
```
再在app的build.gradle文件中，dependencies节点下添加：

`compile 'com.teaanddogdog:mpandroidchartutil:1.0.0'`

版本建议根据最新版本修改

### 本库需要依赖MPAndroidChart使用，所以app的build.gradle文件中，dependencies节点下还要添加MPAndroidChart库：
`compile 'com.github.PhilJay:MPAndroidChart:v3.0.3'`

## 2、代码中使用
和原生的PieChart用法相同，只是多了几个模式，需在xml中设置，暂没有提供代码中设置的方法：
mp_chart_out_value_place_mode:有3种模式：

### 1.app:mp_chart_out_value_place_mode="AVG"，左右等分可用空间，推荐用这个模式，默认也是这个模式

### 2.app:mp_chart_out_value_place_mode="Top_Align"，左右上对齐，下面不保证，下面可能会被挤出去（不推荐，还存在bug，PieChart转动时部分值显示不了）

### 3.app:mp_chart_out_value_place_mode="Simple"，右侧上对齐，右侧下面可能会被挤出去；左侧下对齐，左侧上面可能会被挤出去（不推荐，还存在bug，PieChart转动时部分值显示不了）

使用了自定义属性，注意在根节点内添加：xmlns:app="http://schemas.android.com/apk/res-auto"

```
<com.teaanddogdog.mpandroidchartutil.PieChartFixCover
            android:id="@+id/pie_chart"
            android:layout_width="450dp"
            android:layout_height="450dp"
            app:mp_chart_out_value_place_mode="AVG"
            />
```

## 3、图例
![图示](https://github.com/huzipiaopiao/MPAndroidChartFix/blob/master/img/demo_img1.png)
