package com.example.twpruanhong.sortabletabletest;

import android.content.Context;
import android.util.AttributeSet;

import com.example.data.Car;
import com.example.data.CarComparators;

import de.codecrafters.tableview.SortableTableView;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;
import de.codecrafters.tableview.toolkit.SortStateViewProviders;
import de.codecrafters.tableview.toolkit.TableDataRowColorizers;

/**
 * Created by TWPRUANHONG on 2017/3/9.
 */

public class SortableCarView extends SortableTableView<Car> {
    public SortableCarView(Context context) {
        this(context,null);
    }

    public SortableCarView(Context context, AttributeSet attributes) {
        this(context,attributes,0);
    }

    public SortableCarView(Context context, AttributeSet attributes, int styleAttributes) {
        super(context, attributes, styleAttributes);

//        SimpleTableHeaderAdapter simpleTableHeaderAdapter = new SimpleTableHeaderAdapter(context,"品牌","名称","功耗","价格","开始时间","结束时间","办理期限");
        SimpleTableHeaderAdapter simpleTableHeaderAdapter = new SimpleTableHeaderAdapter(context,"工作名称","送交人员","接收部门","接收/办理人员","开始时间","结束时间","办理期限");
        simpleTableHeaderAdapter.setTextSize(12);
        setHeaderAdapter(simpleTableHeaderAdapter);
        int rowColorEven = context.getResources().getColor(R.color.aqua);
        int rowColorOdd = context.getResources().getColor(R.color.springgreen);
        setDataRowColorizer(TableDataRowColorizers.alternatingRows(rowColorEven,rowColorOdd));

        setHeaderSortStateViewProvider(SortStateViewProviders.brightArrows());
        setColumnWeight(0,1);
        setColumnWeight(1,1);
        setColumnWeight(2,1);
        setColumnWeight(3,1);
        setColumnWeight(4,1);
        setColumnWeight(5,1);
        setColumnWeight(6,1);

        setColumnComparator(1,CarComparators.getCarNameComparator());
        setColumnComparator(3, CarComparators.getCarPriceComparator());
    }
}
