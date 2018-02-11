package com.fabriciohsilva.silverwolfwebsolutions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.Empresa  = (ImageView) findViewById(R.id.EmpresaID);
        this.mViewHolder.Servicos = (ImageView) findViewById(R.id.ServicoID);
        this.mViewHolder.Clientes = (ImageView) findViewById(R.id.ClientesID);
        this.mViewHolder.Contato  = (ImageView) findViewById(R.id.ContatoID);

        this.mViewHolder.Empresa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }//end public void onClick(View v)
        });//end this.mViewHolder.Empresa.setOnClickListener

        this.mViewHolder.Servicos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }//end public void onClick(View v)
        });//end this.mViewHolder.Servicos.setOnClickListener

        this.mViewHolder.Clientes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }//end public void onClick(View v)
        });//end this.mViewHolder.Clientes.setOnClickListener

        this.mViewHolder.Contato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }//end public void onClick(View v)
        });//end this.mViewHolder.Contato.setOnClickListener

    }//end protected void onCreate(Bundle savedInstanceState)

    private static class ViewHolder {
        ImageView Empresa;
        ImageView Servicos;
        ImageView Clientes;
        ImageView Contato;

    }//end private static class mviewHolder

}//end public class MainActivity extends Activity