package com.example.multiplosexercicios;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multiplosexercicios.apresentacao.mnaPrimo;
import com.example.multiplosexercicios.apresentacao.mnaTemperatura;

//import  com.example.multiplosexercicios.apresentacao.*;

public class MainActivity extends AppCompatActivity
{
    private Button btnTemperatura;
    private Button btnPrimo;
    private Intent intTemperatura;
    private Intent intPrimo;
    private Context ctxMnaPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        configuracao();
        eventos();
    }

    private void configuracao()
    {
        btnTemperatura = findViewById(R.id.btnTemperatura);
        btnPrimo = findViewById(R.id.btnPrimo);

        ctxMnaPrincipal = getApplicationContext();

        intTemperatura = new Intent(ctxMnaPrincipal, mnaTemperatura.class);
        intPrimo = new Intent(ctxMnaPrincipal, mnaPrimo.class);
    }

    private void eventos()
    {
        btnTemperatura.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intTemperatura);
            }
        });

        btnPrimo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intPrimo);
            }
        });
    }
}