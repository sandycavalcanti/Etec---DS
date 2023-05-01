package com.example.app_great_taste;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Tela06 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela06);
		
		final Button btn1 = (Button) findViewById(R.id.button1);
		final TextView titulo = (TextView) findViewById(R.id.textView1);
		final TextView texto1 = (TextView) findViewById(R.id.textView2);
		final TextView texto2 = (TextView) findViewById(R.id.textView3);
		final TextView texto3 = (TextView) findViewById(R.id.textView4);
		final TextView texto4 = (TextView) findViewById(R.id.textView5);
		final TextView radio11 = (TextView) findViewById(R.id.radiosim);
		final TextView radio12 = (TextView) findViewById(R.id.radionao);
		final TextView radio0 = (TextView) findViewById(R.id.radio0);
		final TextView radio1 = (TextView) findViewById(R.id.radio1);
		final TextView radio2 = (TextView) findViewById(R.id.radio2);
		final TextView radio3 = (TextView) findViewById(R.id.radio3);
		Typeface font = Typeface.createFromAsset(getAssets(), "planetchalk.ttf");
		titulo.setTypeface(font);
		texto1.setTypeface(font);
		texto2.setTypeface(font);
		texto3.setTypeface(font);
		texto4.setTypeface(font);
		radio11.setTypeface(font);
		radio12.setTypeface(font);
		radio0.setTypeface(font);
		radio1.setTypeface(font);
		radio2.setTypeface(font);
		radio3.setTypeface(font);
		btn1.setTypeface(font);
		
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				AlertDialog.Builder alerta = new AlertDialog.Builder(Tela06.this);
						alerta.setTitle("Cadastro finalizado com sucesso.");
						alerta.setMessage("Parabens!! Agora você é um chefe Great Taste!!");
						alerta.setNeutralButton("Uuhuul!!", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface arg0, int arg1) {
								
								Intent it = new Intent(Tela06.this, Tela05.class);
								startActivity(it);
								
							}
						});
						
						
						alerta.show();
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela06, menu);
		return true;
	}

}
