package com.core.sigel.sibase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.core.sigel.sibase.model.FlowChart;
import com.core.sigel.sibase.view.FLowLineView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sigel
 */
public class BaseMainActivity extends AppCompatActivity {

    private FLowLineView mFLowLineView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_main);
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
