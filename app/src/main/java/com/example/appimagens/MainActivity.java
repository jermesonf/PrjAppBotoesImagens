package com.example.appimagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagem; //esse objeto é java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagem = findViewById(R.id.imgQuadro); //aqui estou dizendo que o objeto java importado na linha 9 se ligue ao imagem que esta no layout
    }//fim

    //métodos aqui
    public void trocar1 (View V)
    {
        imagem.setImageResource(R.drawable.cachorinhos);
    }

    public void trocar2 (View V)
    {
        imagem.setImageResource(R.drawable.disco);
    }

    public void trocar3 (View V)
    {
        imagem.setImageResource(R.drawable.minie);
    }

    public void trocar4 (View V)
    {
        imagem.setImageResource(R.drawable.terra);
    }
}//fim classe