package alice.andre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_resta, btn_suma, btn_punto, btn_multi, btn_dividir, btn_borrar, btn_resultado;
    private TextView tv_result;
    private String cadena = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);
        btn_resta = (Button) findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(this);
        btn_suma = (Button) findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(this);
        btn_punto = (Button) findViewById(R.id.btn_punto);
        btn_punto.setOnClickListener(this);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_multi.setOnClickListener(this);
        btn_dividir = (Button) findViewById(R.id.btn_dividir);
        btn_dividir.setOnClickListener(this);
        btn_borrar = (Button) findViewById(R.id.btn_borrar);
        btn_borrar.setOnClickListener(this);
        btn_resultado = (Button) findViewById(R.id.btn_resultado);
        btn_resultado.setOnClickListener(this);

        tv_result = (TextView) findViewById(R.id.tv_result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Button aux;

        if ( v.getId() != R.id.btn_resultado && v.getId() != R.id.btn_borrar && v.getId() != R.id.tv_result  ){
            aux = (Button)  findViewById(v.getId());
            cadena=cadena + aux.getText().toString();
            Toast.makeText(getApplicationContext(),aux.getText().toString(), Toast.LENGTH_LONG ).show();
            tv_result.setText(cadena);
        }
        else if (v.getId() == R.id.btn_resultado){
            

        }

    }
}
