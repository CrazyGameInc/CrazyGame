package ru.crazy.crazygame001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AuthorsActivity extends AppCompatActivity implements View.OnClickListener{

    TextView emPavel;
    TextView emMasha;
    TextView emLera;
    TextView emUra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authors);

        emPavel = (TextView) findViewById(R.id.tvEmPavel);
        emMasha = (TextView) findViewById(R.id.tvEmMasha);
        emLera = (TextView) findViewById(R.id.tvEmLera);
        emUra = (TextView) findViewById(R.id.tvEmUra);

        emPavel.setOnClickListener(this);
        emMasha.setOnClickListener(this);
        emLera.setOnClickListener(this);
        emUra.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.tvEmPavel:
                Intent emailintent = new Intent(Intent.ACTION_SEND);
                emailintent.setType("text/plain");
                emailintent.putExtra(Intent.EXTRA_EMAIL, new String[] {"prafair@yandex.ru" });
                emailintent.putExtra(Intent.EXTRA_SUBJECT, "Приложение Crazy Game");
                emailintent.putExtra(Intent.EXTRA_TEXT,"Здравствуйте!");
                startActivity(Intent.createChooser(emailintent, "Отправить e-mail..."));
                break;
        }

    }
}
