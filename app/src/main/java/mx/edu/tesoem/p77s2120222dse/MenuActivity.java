package mx.edu.tesoem.p77s2120222dse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MenuActivity extends AppCompatActivity {
    EditText txtnombre,txtedad;
    Button btnnat,btnobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);

        btnnat = findViewById(R.id.btnnat);
        btnobj = findViewById(R.id.btnobj);

        btnnat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtnombre.getText().toString();
                int edad = Integer.valueOf(txtedad.getText().toString());

                Intent intent = new Intent(MenuActivity.this,NativoActivity.class);
                intent.putExtra("nombre",nombre);
                intent.putExtra("edad",edad);
                startActivity(intent);
            }
        });

        btnobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = txtnombre.getText().toString();
                int edad = Integer.valueOf(txtedad.getText().toString());

                Datos datos = new Datos(nombre,edad);

                Intent intent = new Intent(MenuActivity.this,ObjetoActivity.class);
                intent.putExtra("datos",datos);
                startActivity(intent);
            }
        });
    }
}