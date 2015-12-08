package ru.crazy.crazygame001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    // первый коммент
    //выаываываывавыаыываыв
    Button btnAuthors;
    Button btnRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnAuthors = (Button) findViewById(R.id.btnAuthors);
        btnRules = (Button) findViewById(R.id.btnRules);

        btnAuthors.setOnClickListener(this);
        btnRules.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnAuthors:
                Intent authors = new Intent(this, AuthorsActivity.class);
                startActivity(authors);
                //finish();
                break;
            case R.id.btnRules:
                Intent rules = new Intent(this, RulesActivity.class);
                startActivity(rules);
                break;

        }


    }
}
