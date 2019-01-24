package com.example.tugas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);
    }

    public void TugasPertama(View view) {
        startActivity(new Intent(FirstLayout.this, MainActivity.class));
    }

    public void TugasKedua(View view) {
        startActivity(new Intent(FirstLayout.this, Tugas4.class));
    }

    public void TugasKetiga(View view) {
        startActivity(new Intent(FirstLayout.this, TugasTiga.class));
    }


    public void TugasKeEmpat(View view) {
        startActivity(new Intent(FirstLayout.this, TugasKeEmpat.class));
    }
}
