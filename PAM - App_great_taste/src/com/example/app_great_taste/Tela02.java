package com.example.app_great_taste;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tela02 extends Activity {
	
	Bundle id = new Bundle();
	Bundle bundle_img = new Bundle();
	Bundle bundle_nome = new Bundle();
	Bundle bundle_tempo = new Bundle();
	Bundle bundle_usuario = new Bundle();
	Bundle bundle_tipo = new Bundle();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela02);
		
		final TextView titulo = (TextView) findViewById(R.id.textView6);
		final Button carnes = (Button) findViewById(R.id.carnes);
		final Button sobremesas = (Button) findViewById(R.id.sobremesas);
		final Button vegetarianas = (Button) findViewById(R.id.vegetarianas);
		final Button saudaveis = (Button) findViewById(R.id.saudaveis);
		final Button orientais = (Button) findViewById(R.id.orientais);
		
		carnes.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				id.putInt("valor", 1);
				Intent it = new Intent(Tela02.this,Tela03.class);
				it.putExtras(id);
				startActivity(it);
				
			}
		});
		
		sobremesas.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				id.putInt("valor", 2);
				Intent it = new Intent(Tela02.this,Tela03.class);
				it.putExtras(id);
				startActivity(it);
				
			}
		});
		
		vegetarianas.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				id.putInt("valor", 3);
				Intent it = new Intent(Tela02.this,Tela03.class);
				it.putExtras(id);
				startActivity(it);
				
			}
		});
		
		saudaveis.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				id.putInt("valor", 4);
				Intent it = new Intent(Tela02.this,Tela03.class);
				it.putExtras(id);
				startActivity(it);
			}
		});
		
		orientais.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {

				id.putInt("valor",5);
				Intent it = new Intent(Tela02.this,Tela03.class);
				it.putExtras(id);
				startActivity(it);
				
			}
		});
		
		Typeface font = Typeface.createFromAsset(getAssets(), "planetchalk.ttf");
		titulo.setTypeface(font);
		carnes.setTypeface(font);
		sobremesas.setTypeface(font);
		vegetarianas.setTypeface(font);
		saudaveis.setTypeface(font);
		orientais.setTypeface(font);
		
	}
	public void minha_conta(View v){
		
		Intent conta = new Intent(Tela02.this, Tela06.class);
		startActivity(conta);
		
	}
	
	public void notificacao(View v){
		
		NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    	PendingIntent p= PendingIntent.getActivity(Tela02.this, 0, new Intent(Tela02.this,Tela04.class), 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(Tela02.this);
        /*
        bundle_img.putInt("val_img", R.drawable.bolo_de_carne1);
		bundle_nome.putString("val_nome", "Bolo de Carne");
		bundle_tempo.putString("val_tempo",
				"01:00h");
		bundle_usuario.putString("val_usuario","Tudogostoso");
		p.
		p.putExtras(bundle_nome);
		p.putExtras(bundle_tempo);
		p.putExtras(bundle_usuario);
		int tipo = 0;
		bundle_tipo.putInt("val_tipo", tipo);
		receita.putExtras(bundle_tipo);
		break;*/
        
        builder.setTicker("Nova receita publicada");
        builder.setContentTitle("Bolo de carne");
        builder.setContentText("Confira a nova receita postada por Cozinhaadois.");
        builder.setSmallIcon(R.drawable.receitas);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bolo_de_carne1));
        builder.setContentIntent(p);
        Notification n = builder.build();
        nm.notify(R.drawable.bolo_de_carne1,n);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela02, menu);
		return true;
	}

}
