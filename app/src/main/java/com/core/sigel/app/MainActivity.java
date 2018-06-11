package com.core.sigel.app;

import android.app.Activity;
import android.os.Bundle;

import com.core.sigel.sibase.model.FlowChart;
import com.core.sigel.sibase.view.FLowLineView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sigel
 */
public class MainActivity extends Activity {

    private FLowLineView mFLowLineView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFLowLineView = findViewById(R.id.flow_view);
        List<FlowChart> charts = new ArrayList<>();
        FlowChart chart = new FlowChart();
        chart.setTopName("节点");
        chart.setName("节点");
        chart.setBottomName("张月明1000000000");
        chart.setTime("2018-09-09 00:00:00");
        charts.add(chart);
        charts.add(chart);
        charts.add(chart);
        charts.add(chart);
        mFLowLineView.setDoubleBottom(true);
        mFLowLineView.setTextSize(10);
        mFLowLineView.setFlowCharts(charts);
        mFLowLineView.setTag(1);
    }
}
