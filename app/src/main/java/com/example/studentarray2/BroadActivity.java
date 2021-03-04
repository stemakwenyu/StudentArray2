package com.example.studentarray2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BroadActivity extends AppCompatActivity {
    ListView Marks;
    Button btn;
    int total=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad);
        Marks = findViewById(R.id.lstStudentmarks);
        btn = findViewById(R.id.btn);
        lmarkslist();

    }
    public  void lmarkslist()
    {
       try{
           Marks mks = new Marks();
          // int total = 0;
           List<Map<String, String>> prolist = new ArrayList<Map<String, String>>();
           String[] from = {"SNO", "Name", "Regno","English","Maths","Kiswahili","Chemistry","Physics","Biology","History","Geography","CRE","BStudies","Agriculture","Computer","Total","Position"} ;
           int[] views = {R.id.sno, R.id.name, R.id.reg,R.id.eng,R.id.math,R.id.kis,R.id.chem,R.id.phy,R.id.bio,R.id.hist,R.id.geo,R.id.cr,R.id.bs,R.id.agri,R.id.comp,R.id.total,R.id.postn};

           List<Marks> lstMarks = mks.GetMarks();

           for (int i=0; i<lstMarks.size(); i++)
           {
            Map<String, String> marknum = new HashMap<>();
               marknum.put("SNO", ""+lstMarks.get(i).sno);
               marknum.put("Name", "" + lstMarks.get(i).name);
               marknum.put("Regno", "" + lstMarks.get(i).regno);
               marknum.put("English", "" + lstMarks.get(i).english);
               marknum.put("Maths", "" + lstMarks.get(i).maths);
               marknum.put("Kiswahili", "" + lstMarks.get(i).kisw);
               marknum.put("Chemistry", "" + lstMarks.get(i).chemistry);
               marknum.put("Physics", "" + lstMarks.get(i).physics);
               marknum.put("Biology", "" + lstMarks.get(i).biology);
               marknum.put("History", "" + lstMarks.get(i).history);
               marknum.put("Geography", "" + lstMarks.get(i).geography);
               marknum.put("CRE", "" + lstMarks.get(i).cre);
               marknum.put("BStudies", "" + lstMarks.get(i).bstudies);
               marknum.put("Agriculture", "" + lstMarks.get(i).agriculture);
               marknum.put("Computer", "" + lstMarks.get(i).computer);
               marknum.put("Total", "" + lstMarks.get(i).addTotal());
               marknum.put("Position", "" + lstMarks.get(i).position);

                prolist.add(marknum);

           }
           final SimpleAdapter simpleAdapter = new SimpleAdapter(BroadActivity.this,
                   prolist, R.layout.listiview, from,
                   views);
           Marks.setAdapter(simpleAdapter);
       } catch (Exception ex) {
           Toast.makeText(BroadActivity.this, ex.getMessage().toString(),
                   Toast.LENGTH_LONG).show();

       }

    }

/*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BroadActivity.this, String.valueOf(total), Toast.LENGTH_SHORT).show();
            }
        });*/


        }


