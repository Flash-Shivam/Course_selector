package com.shivam.course_selector;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Float;

public class MainActivity extends AppCompatActivity {



    private static final String[] Course = new String[]{
      "HUL212","HUL213","HUL232","HUL239"
    };
    RadioGroup rg ;
    RadioButton rb;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg =  findViewById(R.id.Radio_group);
        tv = findViewById(R.id.view_selected);
        Button button_apply = findViewById(R.id.button);
        Button z = findViewById(R.id.gn);

        button_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioId = rg.getCheckedRadioButtonId();

                rb = findViewById(radioId);

                tv.setText("Your Choice " + rb.getText());
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AutoCompleteTextView ed = findViewById(R.id.Auto);
                TextView x = findViewById(R.id.cn);
                String q= ed.getText().toString();
                if(q.equals("HUL212"))
                {
                    x.setText("Microeconomics");
                }
                else  if(q.equals("HUL213"))
                {
                    x.setText("Macroeconomics");
                }
                else if(q.equals("HUL232"))
                {
                    x.setText("Modern Indian Fiction in Translation");
                }
                else if(q.equals("HUL239"))
                {
                    x.setText("Indian Fiction in English");
                }

            }
        });



        AutoCompleteTextView ed = findViewById(R.id.Auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,Course   );
        ed.setAdapter(adapter);





    }

    public void checkButton(View v) {
        int radioId = rg.getCheckedRadioButtonId();

        rb = findViewById(radioId);

        Toast.makeText(this, "Selected Radio Button" + rb.getText(), Toast.LENGTH_SHORT).show();
    }


    public void switchp(View view) {

        Intent changescreen = new Intent(this,SecondScreen.class);



        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String q= ed.getText().toString();
        RadioButton rb;
        RadioGroup rg;
        rg =  findViewById(R.id.Radio_group);
        int radioId = rg.getCheckedRadioButtonId();
        rb = findViewById(radioId);
        String p = rb.getText().toString();

        changescreen.putExtra("callAc",q+" "+p);
      //  Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        startActivity(changescreen);
    }



    public void feedit(View view) {

       // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent chanescreen = new Intent(this,ThirdScreen.class);

        chanescreen.putExtra("callAct","j");



        startActivity(chanescreen);
    }
}

