package com.example.app_great_taste;


import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Tela05 extends Activity {
	
	Bundle id = new Bundle();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela05);
		
		final TextView texto = (TextView) findViewById(R.id.textView1);
		
		final Button receita = (Button)findViewById(R.id.button1);
		
		
		receita.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent it = new Intent(Tela05.this,Tela02.class);
				startActivity(it);
				
			}
		});
		
		final Button chefes = (Button) findViewById(R.id.button2);
		
		chefes.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent it = new Intent(Tela05.this, Tela07.class);
				startActivity(it);
				
			}
		});
		
		final Button favoritos = (Button)findViewById(R.id.button3);
		
		favoritos.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				id.putInt("valor", 1);
				Intent it = new Intent(Tela05.this,Tela03.class);
				it.putExtras(id);
				startActivity(it);
				
			}
		});
		
		final Button cadastrar_receita = (Button) findViewById(R.id.button4);
		
		cadastrar_receita.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent it = new Intent(Tela05.this, Tela08.class);
				startActivity(it);
				
			}
		});
		
		Typeface font = Typeface.createFromAsset(getAssets(), "planetchalk.ttf");
		texto.setTypeface(font);
		receita.setTypeface(font);
		chefes.setTypeface(font);
		favoritos.setTypeface(font);
		cadastrar_receita.setTypeface(font);
		
	}
	
	public void minha_conta(View v){
		
		Intent it = new Intent(Tela05.this, Tela06.class);
		startActivity(it);
		
	}
	
	public void notificacao(View v){
		
		NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
		
    	PendingIntent p= PendingIntent.getActivity(Tela05.this, 0, new Intent(Tela05.this,Tela04.class), 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(Tela05.this);
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
		getMenuInflater().inflate(R.menu.tela05, menu);
		return true;
	}

}
