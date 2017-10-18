package com.example.twpruanhong.sortabletabletest;

import android.content.Context;
import android.icu.text.NumberFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.data.Car;

import java.util.List;

import de.codecrafters.tableview.TableDataAdapter;

/**
 * Created by TWPRUANHONG on 2017/3/9.
 */

public class CarDataAdapter extends TableDataAdapter<Car> {
    private static int TEXT_SIZE = 14;
//    private static NumberFormat PRICE_FORMATTER = NumberFormat.getNumberInstance();

    public CarDataAdapter(Context context,List<Car> data) {
        super(context,data);
    }

    @Override
    public View getCellView(int rowIndex, int columnIndex, ViewGroup parentView) {
        Car car = getRowData(rowIndex);
        View renderView = null;
        switch (columnIndex) {
            case 0:
                renderView = renderProducerLogo(car,parentView);
                break;
            case 1:
                renderView = renderName(car);
                break;
            case 2:
                renderView = renderPower(car,parentView);
                break;
            case 3:
                renderView = renderPrice(car);
                break;
            case 4:
                renderView = renderName(car);
                break;
            case 5:
                renderView = renderName(car);
                break;
            case 6:
                renderView = renderName(car);
                break;
        }
        return renderView;
    }

    private View renderProducerLogo(Car car,ViewGroup parentView) {
        View view = getLayoutInflater().inflate(R.layout.table_cell_image,parentView,false);
        ImageView imageView = (ImageView) view.findViewById(R.id.cell_image);
        imageView.setImageResource(car.getProducer().getLogoRes());
        return view;
    }

    private View renderName(Car car) {
        return renderString(car.getName());
    }

    private View renderPower(Car car,ViewGroup parentView) {
        View view = getLayoutInflater().inflate(R.layout.table_cell_power,parentView,false);
        TextView kwText = (TextView) view.findViewById(R.id.kw_view);
        TextView psText = (TextView) view.findViewById(R.id.ps_view);
        kwText.setText(car.getKw() + "kW");
        psText.setText(car.getPs() + "PS");
        return view;
    }

    private View renderPrice(Car car) {
        String priceString = car.getPrice() + "$";
        return renderString(priceString);
    }

    private View renderString(String value) {
        TextView textView = new TextView(getContext());
        textView.setText(value);
        textView.setTextSize(TEXT_SIZE);
        textView.setPadding(20,10,20,10);
        return  textView;
    }
}
