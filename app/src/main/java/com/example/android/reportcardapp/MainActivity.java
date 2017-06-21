package com.example.android.reportcardapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ReportCard> grades = new ArrayList<ReportCard>();
        grades.add(new ReportCard("Haseeb Ahmed", "B-","A+","B+","C+"));
        grades.add(new ReportCard("Faizan Azhar", "F-","F-","F-","F-"));
        grades.add(new ReportCard("Mueid Ur Rehman", "A+","B-","C+",""));

        ReportCardAdaptor adapter = new ReportCardAdaptor(this,grades);
        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(adapter);

    }
}
