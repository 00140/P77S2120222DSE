package mx.edu.tesoem.p77s2120222dse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ObjetoActivity extends AppCompatActivity {

    TextView lblnombre2,lbledad2;
    Button btnregresa2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto);

        lblnombre2 = findViewById(R.id.lblnombre2);
        lbledad2 = findViewById(R.id.lbledad2);
        btnregresa2 = findViewById(R.id.btnregresa2);

        Datos datos = getIntent().getParcelableExtra("datos");
        lblnombre2.setText(datos.getNombre());
        lbledad2.setText(String.valueOf(datos.getEdad()));

        btnregresa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}