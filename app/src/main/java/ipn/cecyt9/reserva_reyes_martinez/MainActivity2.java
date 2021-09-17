package ipn.cecyt9.reserva_reyes_martinez;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends Activity {

    String nombre = "", fecha = "", hora = "";
    int personas = 0;
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");

        muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
                + " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");

    }

    public void hacerOtraReserva(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }

}