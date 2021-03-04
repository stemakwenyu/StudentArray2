package com.example.studentarray2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndividualActivity extends AppCompatActivity {
    ListView Marks;
    Button btn;
    int total = 0;
    int std=0;
    ListView listView;
    TextView txt_SNO, txtName, txtRegno, txtEnglish,txtMaths, txtKiswahili, txtChemistry,txtPhysics, txtBiology, txtHistory, txtGeography, txtCRE, txtBStudies, txtAgriculture, txtComputer, txtTotal, txtPosition;
    private ArrayList<Map<String, String>> prolist;
    private String[] from;
    private int[] views;
    private List<com.example.studentarray2.Marks> lstMarks;
    String results;
    Button btnShare;
    private com.example.studentarray2.Marks mks;
    private int ind =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual);
        Marks = findViewById(R.id.lstStudentmarks);
        btn = findViewById(R.id.btn);
        lmarkslist(0);

        Marks=findViewById(R.id.lstIndividuamarks);
        txt_SNO = findViewById(R.id.sno);
        txtName = findViewById(R.id.name);
        txtRegno = findViewById(R.id.reg);
        txtEnglish = findViewById(R.id.eng);
        txtMaths = findViewById(R.id.ma);
        txtKiswahili = findViewById(R.id.kis);
        txtChemistry = findViewById(R.id.chem);
        txtPhysics = findViewById(R.id.phy);
        txtBiology = findViewById(R.id.bio);
        txtHistory = findViewById(R.id.hist);
        txtGeography = findViewById(R.id.geo);
        txtCRE = findViewById(R.id.cr);
        txtBStudies = findViewById(R.id.bs);
        txtAgriculture = findViewById(R.id.agri);
        txtComputer = findViewById(R.id.comp);
        txtTotal = findViewById(R.id.total);
        txtPosition = findViewById(R.id.postn);
        btnShare = findViewById(R.id.btn);

        lmarkslist(ind);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                steve(ind);
                Toast.makeText(IndividualActivity.this, results, Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void lmarkslist(int std) {
        try {
            ind =std;
             mks = new Marks();

             prolist = new ArrayList<Map<String, String>>();
            from = new String[]{"SNO\n", "Name", "Regno", "English", "Maths", "Kiswahili", "Chemistry", "Physics", "Biology", "History", "Geography", "CRE", "BStudies", "Agriculture", "Computer", "Total", "Position"};
            views = new int[]{R.id.sno, R.id.name, R.id.reg, R.id.eng, R.id.math, R.id.kis, R.id.chem, R.id.phy, R.id.bio, R.id.hist, R.id.geo, R.id.cr, R.id.bs, R.id.agri, R.id.comp, R.id.total, R.id.postn};

             lstMarks = mks.GetMarks();

            //for (int std = 0; std= 1; std++) {
                Map<String, String> marknum = new HashMap<>();
                marknum.put("SNO", "" + lstMarks.get(std).sno);
                marknum.put("Name", "" + lstMarks.get(std).name);
                marknum.put("Regno", "" + lstMarks.get(std).regno);
                marknum.put("English", "" + lstMarks.get(std).english);
                marknum.put("Maths", "" + lstMarks.get(std).maths);
                marknum.put("Kiswahili", "" + lstMarks.get(std).kisw);
                marknum.put("Chemistry", "" + lstMarks.get(std).chemistry);
                marknum.put("Physics", "" + lstMarks.get(std).physics);
                marknum.put("Biology", "" + lstMarks.get(std).biology);
                marknum.put("History", "" + lstMarks.get(std).history);
                marknum.put("Geography", "" + lstMarks.get(std).geography);
                marknum.put("CRE", "" + lstMarks.get(std).cre);
                marknum.put("BStudies", "" + lstMarks.get(std).bstudies);
                marknum.put("Agriculture", "" + lstMarks.get(std).agriculture);
                marknum.put("Computer", "" + lstMarks.get(std).computer);
                marknum.put("Total", "" + lstMarks.get(std).addTotal());
                marknum.put("Position", "" + lstMarks.get(std).position);

                prolist.add(marknum);

           // }
            final SimpleAdapter simpleAdapter = new SimpleAdapter(IndividualActivity.this,
                    prolist, R.layout.listiview, from,
                    views);
            Marks.setAdapter(simpleAdapter);
        } catch (Exception ex) {
            Toast.makeText(IndividualActivity.this, ex.getMessage().toString(),
                    Toast.LENGTH_LONG).show();

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuitems, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.Ste:
                lmarkslist(0);
                Marks.setVisibility(View.VISIBLE);

                return true;
            case R.id.Dn:
                lmarkslist(1);
                Marks.setVisibility(View.VISIBLE);

                return true;
            case R.id.Sam:
                lmarkslist(2);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.Frd:
                lmarkslist(3);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.Rich:
                lmarkslist(4);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.Mart:
                lmarkslist(5);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.Jan:
                lmarkslist(6);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.Mich:
                lmarkslist(7);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.Mabr:
                lmarkslist(8);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case  R.id.total:
                lmarkslist(9);
                Marks.setVisibility(View.VISIBLE);
                return true;
            case R.id.postn:
                lmarkslist(10);
                Marks.setVisibility(View.VISIBLE);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

        }
        public void steve(int i){
        Marks mks = lstMarks.get(i);
        results ="Results: \n"+ "\nName: " +mks.getName() +"\nRegNo: " +mks.regno +"\nEnglish: " +mks.getEnglish()+"\nMaths: " +mks.getMaths()+"\nKiswahili: " +mks.getKisw()+"\nChemistry: " +mks.getChemistry()+"\nPhysics: " +mks.getPhysics()+"\nBiology: " +mks.getBiology()+"\nHistory: " +mks.getHistory()
                +"\nGeography: " +mks.getGeography()+"\nCRE: " +mks.getCre()+"\nB/Studies: " +mks.getBstudies()+"\nAgriculture: " +mks.getAgriculture()+"\nComputer: " +mks.getComputer()+"\nTotal: " +mks.getTotal() + "\nPosition: " +mks.getPosition();
        message();
        }
        public void message(){
        String[]mail = {"0707041070"};
            Intent intent = new Intent((Intent.ACTION_SEND));
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_PHONE_NUMBER, mail);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Student Marks");
            intent.putExtra(Intent.EXTRA_TEXT, results);
            if (intent.resolveActivity(getPackageManager()) != null)
            {
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this, "No application to use", Toast.LENGTH_SHORT);
            }

        }

    }

