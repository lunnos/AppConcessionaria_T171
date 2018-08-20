package com.luan.appconcessionaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spMarca;
    private RadioButton rbPassageiro, rbCarga;
    private CheckBox cbNovo;
    private EditText etModelo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etModelo = (EditText) findViewById(R.id.etModelo);
        spMarca = (Spinner) findViewById(R.id.spMarca);
        cbNovo = (CheckBox) findViewById(R.id.cbNovo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate( R.menu.menu, menu );

        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_limpar){
            //implementar aqui o limpar
        }

        if ( item.getItemId() == R.id.menu_sair){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    private void limpar(){

        etModelo.setText("");
        cbNovo.setText("");
        rbPassageiro.setSelected(false);
        rbCarga.setSelected(false);
        spMarca.setSelection( 0 );



    }

}
