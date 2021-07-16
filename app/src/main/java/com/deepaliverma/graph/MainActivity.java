package com.deepaliverma.graph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.PointsGraphSeries;

public class MainActivity extends AppCompatActivity {
EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.et);
    }

    public void Click(View view) {
        String a= et.getText().toString();
        if(a.length()>0){
            String Chopped = a.substring(4, 5);
            Double x=Double.parseDouble(Chopped);
            GraphView graph = (GraphView) findViewById(R.id.graph);

            for(int i=0;i<500;i++) {
                x=x+0.1;
                double y=Math.sin(x);
                PointsGraphSeries<DataPoint> series = new PointsGraphSeries<>(new DataPoint[]{
                        new DataPoint(x,y)
                });
                graph.addSeries(series);
            }
        }
        else{
            Toast.makeText(this,"enter in editText", Toast.LENGTH_LONG).show();
        }
    }

    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button:
                
                break;
            case R.id.button2:

                break;
        }
    }
}