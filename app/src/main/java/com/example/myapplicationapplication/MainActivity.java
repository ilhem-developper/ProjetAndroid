package com.example.myapplicationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText PI;
    private RadioGroup radiogroup;
    private RadioButton r1,r2;
    private CheckBox c1;
    private Button btn1,btn2;
    private TextView Resultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.PI = (EditText) this.findViewById(R.id.PrixInitial);
        this.radiogroup = (RadioGroup) this.findViewById(R.id.RGB);
        this.r1 = (RadioButton) this.findViewById(R.id.RB1);
        this.r2 = (RadioButton) this.findViewById(R.id.RB2);
        this.c1 = (CheckBox) this.findViewById(R.id.Chk);
        this.btn1 = (Button) this.findViewById(R.id.Calc);
        this.btn2 = (Button) this.findViewById(R.id.Raz);
        this.Resultat = (TextView) this.findViewById(R.id.res);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PI.setText("");
                radiogroup.clearCheck();
                c1.setChecked(false);
                Resultat.setText("");
                PI.setFocusable(true);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked())
                {
                    float s1 = 119;
                    float s2 = 100;
                    float s3 = Integer.parseInt(PI.getText().toString());
                    float s4 = s3*s1/s2;
                    String res = String.valueOf(s4);
                    Resultat.setText(res);
                }
                if (r2.isChecked())
                {
                    float s1 = 112;
                    float s2 = 100;
                    float s3 = Integer.parseInt(PI.getText().toString());
                    float s4 = s3*s1/s2;
                    String res = String.valueOf(s4);
                    Resultat.setText(res);
                }
                if (c1.isChecked())
                {
                    float s1 = 90;
                    float s2 = 100;
                    float s3 = Integer.parseInt(PI.getText().toString());
                    float s4 = s3*s1/s2;
                    String res = String.valueOf(s4);
                    Resultat.setText(res);
                }
                if ((r1.isChecked()) && (c1.isChecked()))
                {
                    float s1 = 119;
                    float s2 = 100;
                    float s3 = Integer.parseInt(PI.getText().toString());
                    float s4 = s3*s1/s2;
                    float s5 = 90;
                    float s6 = s4*s5/s2;
                    String res = String.valueOf(s6);
                    Resultat.setText(res);
                }
                if ((r2.isChecked()) && (c1.isChecked()))
                {
                    float s1 = 112;
                    float s2 = 100;
                    float s3 = Integer.parseInt(PI.getText().toString());
                    float s4 = s3*s1/s2;
                    float s5 = 90;
                    float s6 = s4*s5/s2;
                    String res = String.valueOf(s6);
                    Resultat.setText(res);
                }
            }
        });
    }
}













