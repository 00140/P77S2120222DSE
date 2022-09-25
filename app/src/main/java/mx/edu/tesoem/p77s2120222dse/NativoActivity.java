package mx.edu.tesoem.p77s2120222dse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NativoActivity extends AppCompatActivity {

    TextView lblnombre1, lbledad1;
    Button btnregresa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nativo);

        lblnombre1 = findViewById(R.id.lblnombre1);
        lbledad1 = findViewById(R.id.lbledad1);
        btnregresa1 = findViewById(R.id.btnregresa1);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        int edad = parametros.getInt("edad");

        lblnombre1.setText(nombre);
        lbledad1.setText(String.valueOf(edad));

        btnregresa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}