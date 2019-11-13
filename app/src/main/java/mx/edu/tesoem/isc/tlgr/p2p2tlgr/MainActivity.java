package mx.edu.tesoem.isc.tlgr.p2p2tlgr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> listaEstado;
    String[] strEstados;
    Spinner objSpinner;
    ArrayAdapter<String> ListEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objSpinner = findViewById(R.id.spinnerDinamico);
        strEstados = new String[] {"CDMX","Estado de México","Veracruz","Oaxaca","Baja California Norte"};
        listaEstado = new ArrayList<String>();
        Collections.addAll(listaEstado,strEstados);
        ListEstados = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listaEstado);
        objSpinner.setAdapter(ListEstados);
    }
}
