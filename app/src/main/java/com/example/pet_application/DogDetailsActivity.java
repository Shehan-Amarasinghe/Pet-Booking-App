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

public class DogDetailsActivity extends AppCompatActivity {
private String[][] dog_details1 =
        {
                {"Dog Name : Max", "Age : 3yrs", "Breed : labrador", "Sex : Male", "Color : White","Rs.15000"},
                {"Dog Name : Cooper", "Age : 2yrs", "Breed : labrador", "Sex : Male", "Color : White","Rs.18000"},
                {"Dog Name : Luna", "Age : 1yrs", "Breed : labrador", "Sex : Female", "Color : Black","Rs.14000"},
                {"Dog Name : Daisy", "Age : 3yrs", "Breed : labrador", "Sex : Female", "Color : White","Rs.16000"},
                {"Dog Name : Milo", "Age : 2yrs", "Breed : labrador", "Sex : Male", "Color : White","Rs.16500"},
        };

    private String[][] dog_details2 =
            {
                    {"Dog Name : Piper", "Age : 3yrs", "Breed : German shepherd", "Sex : Male", "Color : White","Rs.13000"},
                    {"Dog Name : Winnie", "Age : 2yrs", "Breed : German shepherd", "Sex : Male", "Color : White","Rs.17000"},
                    {"Dog Name : Willow", "Age : 1yrs", "Breed : German shepherd", "Sex : Male", "Color : Black","Rs.15000"},
                    {"Dog Name : Ginger", "Age : 3yrs", "Breed : German shepherd", "Sex : Male", "Color : White","Rs.18000"},
                    {"Dog Name : Nova", "Age : 2yrs", "Breed : German shepherd", "Sex : Male", "Color : White","Rs.20000"},
            };

    private String[][] dog_details3 =
            {
                    {"Dog Name : Paisley", "Age : 3yrs", "Breed : Golden retriever", "Sex : Male", "Color : Gold","Rs.40000"},
                    {"Dog Name : Coop", "Age : 2yrs", "Breed : Golden retriever", "Sex : Male", "Color : Gold","Rs.45000"},
                    {"Dog Name : Luni", "Age : 1yrs", "Breed : Golden retriever", "Sex : Female", "Color : Gold","Rs.42000"},
                    {"Dog Name : Hazel", "Age : 3yrs", "Breed : Golden retriever", "Sex : Female", "Color : Gold","Rs.43000"},
                    {"Dog Name : Lexi", "Age : 2yrs", "Breed : Golden retriever", "Sex : Male", "Color : Gold","Rs.47000"},
            };

    private String[][] dog_details4 =
            {
                    {"Dog Name : Nine", "Age : 3yrs", "Breed : Rottweiler", "Sex : Male", "Color : Black","Rs.60000"},
                    {"Dog Name : Rem", "Age : 2yrs", "Breed : Rottweiler", "Sex : Male", "Color : Black","Rs.65000"},
                    {"Dog Name : Luna", "Age : 1yrs", "Breed : Rottweiler", "Sex : Female", "Color : Black","Rs.55000"},
                    {"Dog Name : Denny", "Age : 3yrs", "Breed : Rottweiler", "Sex : Female", "Color : Black","Rs.54000"},
                    {"Dog Name : Muno", "Age : 2yrs", "Breed : Rottweiler", "Sex : Male", "Color : Black","Rs.57000"},
            };

    private String[][] dog_details5 =
            {
                    {"Dog Name : Ninn", "Age : 3yrs", "Breed : Husky", "Sex : Male", "Color : White","Rs.150000"},
                    {"Dog Name : Wooper", "Age : 1yrs", "Breed : Husky", "Sex : Male", "Color : White","Rs.125000"},
                    {"Dog Name : Luny", "Age : 1yrs", "Breed : Husky", "Sex : Male", "Color : White","Rs.135000"},
                    {"Dog Name : Dem", "Age : 2yrs", "Breed : Husky", "Sex : Male", "Color : White","Rs.155000"},
                    {"Dog Name : Semmy", "Age : 2yrs", "Breed : Husky", "Sex : Male", "Color : White","Rs.160000"},
            };
    TextView tv;
    Button btn;
    String[][] dog_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_details);

        tv = findViewById(R.id.titleDogDetailTitle);
        btn = findViewById(R.id.ButtonBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Labrador")==0)
            dog_details = dog_details1;
        else
        if (title.compareTo("German shepherd")==0)
            dog_details = dog_details2;
        else
        if (title.compareTo("Golden retriever")==0)
            dog_details = dog_details3;
        else
        if (title.compareTo("Rottweiler")==0)
            dog_details = dog_details4;
        else
        if (title.compareTo("Husky")==0)
            dog_details = dog_details5;
        else

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DogDetailsActivity.this,DogActivity.class));
            }
        });

        list = new ArrayList();
        for (int i=0; i<dog_details.length; i++){
            item = new HashMap<String,String>();
            item.put("line1", dog_details[i][0]);
            item.put("line2", dog_details[i][1]);
            item.put("line3", dog_details[i][2]);
            item.put("line4", dog_details[i][3]);
            item.put("line5","Puppy fees:"+ dog_details[i][4]+"/-");
            list.add(item);

        }

       sa = new SimpleAdapter(this,list,R.layout.multi_lines,new String[]{"line1","line2","line3","line4","line5"},
               new int[]{R.id.Line_a,R.id.Line_b,R.id.Line_c,R.id.Line_d,R.id.Line_e});

        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){
               Intent it = new Intent(DogDetailsActivity.this,BookingPetActivity.class);

//            item = new HashMap<String,String>();

            it.putExtra("text1",title);
            it.putExtra ("text2",dog_details[i][0]);
            it.putExtra("text3", dog_details[i][1]);
            it.putExtra("text4", dog_details[i][2]);
            it.putExtra("text5", dog_details[i][3]);
            it.putExtra("text6", dog_details[i][4]);
            startActivity(it);
         }
        });
    }
}