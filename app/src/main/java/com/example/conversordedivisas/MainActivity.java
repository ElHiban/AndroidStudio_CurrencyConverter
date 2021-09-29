package com.example.conversordedivisas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Here we initialize the controls
    private Button btn_usd;
    private Button btn_jpy;
    private Button btn_gbp;
    private EditText et_euros;
    private TextView tv_result;

    //Constants
    private final double EUROS_LIBRA = 0.90;
    private final double EUROS_YEN = 120.3;
    private final double EUROS_DOLAR = 1.10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link();
        gbp_onClick();
        usd_onClick();
        jpy_onClick();
    }

    public void link(){
        btn_usd=findViewById(R.id.usd_button);
        btn_jpy=findViewById(R.id.jpy_button);
        btn_gbp=findViewById(R.id.gbp_button);
        et_euros=findViewById(R.id.insert_number);
        tv_result=findViewById(R.id.resultado);
    }

    public void gbp_onClick(){
        btn_gbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                double euros = Double.parseDouble(et_euros.getText().toString());
                double gbp_total = euros*EUROS_LIBRA;
                tv_result.setText("El resultado es: "+
                        String.format("%.2f", gbp_total)+"£");
            }
        });
    }

    public void usd_onClick(){
        btn_usd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                double euros = Double.parseDouble(et_euros.getText().toString());
                double usd_total = euros*EUROS_DOLAR;
                tv_result.setText("El resultado es: "+
                        String.format("%.2f", usd_total)+"$");
            }
        });
    }

    public void jpy_onClick(){
        btn_jpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //What to do
                double euros = Double.parseDouble(et_euros.getText().toString());
                double jpy_total = euros*EUROS_YEN;
                tv_result.setText("El resultado es: "+
                        String.format("%.2f", jpy_total)+"¥");
            }
        });
    }
}