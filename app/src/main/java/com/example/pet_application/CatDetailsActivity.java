package com.example.pet_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class CatDetailsActivity extends AppCompatActivity {
    private String[][] cat_details1 =
            {
                    {"Cat Name : Sem", "Age : 3yrs", "Breed : exoticshorthair", "Sex : Male", "Color : White","Rs.15000"},
                    {"Cat Name : niev", "Age : 2yrs", "Breed : exoticshorthair", "Sex : Male", "Color : White","Rs.18000"},
                    {"Cat Name : Drese", "Age : 1yrs", "Breed : exoticshorthair", "Sex : Female", "Color : Black","Rs.14000"},
                    {"Cat Name : Nuse", "Age : 3yrs", "Breed : exoticshorthair", "Sex : Female", "Color : White","Rs.16000"},
                    {"Cat Name : Milne", "Age : 2yrs", "Breed : exoticshorthair", "Sex : Male", "Color : White","Rs.16500"},
            };

    private String[][] cat_details2 =
            {
                    {"Cat Name : Yoshi", "Age : 3yrs", "Breed : siamese", "Sex : Male", "Color : White","Rs.13000"},
                    {"Cat Name : Wend", "Age : 2yrs", "Breed : siamese", "Sex : Male", "Color : White","Rs.17000"},
                    {"Cat Name : Chucky", "Age : 1yrs", "Breed : siamese", "Sex : Male", "Color : Black","Rs.15000"},
                    {"Cat Name : Bob", "Age : 3yrs", "Breed : siamese", "Sex : Male", "Color : White","Rs.18000"},
                    {"Cat Name : Bey", "Age : 2yrs", "Breed : siamese", "Sex : Male", "Color : White","Rs.20000"},
            };

    private String[][] cat_details3 =
            {
                    {"Cat Name : Ase", "Age : 3yrs", "Breed : britishshorthair", "Sex : Male", "Color : Gold","Rs.40000"},
                    {"Cat Name : Rene", "Age : 2yrs", "Breed : britishshorthair", "Sex : Male", "Color : Gold","Rs.45000"},
                    {"Cat Name : Levs", "Age : 1yrs", "Breed : britishshorthair", "Sex : Female", "Color : Gold","Rs.42000"},
                    {"Cat Name : Mesher", "Age : 3yrs", "Breed : britishshorthair", "Sex : Female", "Color : Gold","Rs.43000"},
                    {"Cat Name : Leni", "Age : 2yrs", "Breed : britishshorthair", "Sex : Male", "Color : Gold","Rs.47000"},
            };

    private String[][] cat_details4 =
            {
                    {"Cat Name : Jimmy", "Age : 3yrs", "Breed : birman", "Sex : Male", "Color : Black","Rs.60000"},
                    {"Cat Name : Runny", "Age : 2yrs", "Breed : birman", "Sex : Male", "Color : Black","Rs.65000"},
                    {"Cat Name : Bren", "Age : 1yrs", "Breed : birman", "Sex : Female", "Color : Black","Rs.55000"},
                    {"Cat Name : Nern", "Age : 3yrs", "Breed : birman", "Sex : Female", "Color : Black","Rs.54000"},
                    {"Cat Name : Uren", "Age : 2yrs", "Breed : birman", "Sex : Male", "Color : Black","Rs.57000"},
            };

    private String[][] cat_details5 =
            {
                    {"Cat Name : Harvey", "Age : 3yrs", "Breed : persian", "Sex : Male", "Color : White","Rs.150000"},
                    {"Cat Name : Mikee", "Age : 1yrs", "Breed : persian", "Sex : Male", "Color : White","Rs.125000"},
                    {"Cat Name : Kren", "Age : 1yrs", "Breed : persian", "Sex : Male", "Color : White","Rs.135000"},
                    {"Cat Name : Reen", "Age : 2yrs", "Breed : persian", "Sex : Male", "Color : White","Rs.155000"},
                    {"Cat Name : Wren", "Age : 2yrs", "Breed : Hpersian", "Sex : Male", "Color : White","Rs.160000"},
            };
    TextView tv;
    Button btn;
    String[][] cat_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_details);

        tv = findViewById(R.id.titleCatDetailTitle);
        btn = findViewById(R.id.ButtonBack1);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("exoticshorthair")==0)
            cat_details = cat_details1;
        else
        if (title.compareTo("siamese")==0)
            cat_details = cat_details2;
        else
        if (title.compareTo("britishshorthair")==0)
            cat_details = cat_details3;
        else
        if (title.compareTo(" birman")==0)
            cat_details = cat_details4;
        else
        if (title.compareTo("persian")==0)
            cat_details = cat_details5;
        else

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(CatDetailsActivity.this,CatActivity.class));
                }
            });

        list = new ArrayList();
        for (int i=0; i<cat_details.length; i++){
            item = new HashMap<String,String>();
            item.put("line1", cat_details[i][0]);
            item.put("line2", cat_details[i][1]);
            item.put("line3", cat_details[i][2]);
            item.put("line4", cat_details[i][3]);
            item.put("line5","Puppy fees:"+ cat_details[i][4]+"/-");
            list.add(item);

        }

        sa = new SimpleAdapter(this,list,R.layout.multi_lines,new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.Line_a,R.id.Line_b,R.id.Line_c,R.id.Line_d,R.id.Line_e});

        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){
                Intent it = new Intent(CatDetailsActivity.this,BookingPetActivity.class);

//            item = new HashMap<String,String>();

                it.putExtra("text1",title);
                it.putExtra ("text2",cat_details[i][0]);
                it.putExtra("text3", cat_details[i][1]);
                it.putExtra("text4", cat_details[i][2]);
                it.putExtra("text5", cat_details[i][3]);
                it.putExtra("text6", cat_details[i][4]);
                startActivity(it);
            }
        });
    }
}