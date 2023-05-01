package com.example.app_great_taste;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Tela07 extends Activity {

	TextView txt1, txt2, txt3, txt4;
	ListView lista;
	
	int[] img = { R.drawable.jacquin, R.drawable.celbit,
			R.drawable.leon_nilce, R.drawable.alan,
			R.drawable.paola, R.drawable.guaxinim,
			R.drawable.fogaca };
	String[] nome = { "Érick Jacquin", "Rafael Lange",
			"Leon e Nilce", "Alan Ferreira Pereira", "Paola Carosella", "Rafael Montes Cunha", "Henrique Fogaça" };
	String[] preferencia = { "Carnes", "Saudáveis  ", "Saudáveis",
			"Sobremesas", "Vegetarianas", "Sobremesas ", "Carnes" };
	String[] receitas = { "5", "3", "4", "5", "6", "5", "2" };
	String[] comentario = { "Cozinhar é minha paixão.", " Utilizei toda minha criatividade nessas receitas. ", "Confira as nossas receitas feitas com todo carinho pelo grande talento supremo.", "Aqui você verá as melhores receitas do mundo aprovadas pelo Inmetro.", "Espero que gostem :)",  "Receitinhas cheias de amor <3", "Receitas para proficionais, não indico para amadores." };
	
	public class AdapImg extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return img.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {

				View view = getLayoutInflater().inflate(R.layout.modelo_lista_chefe, null);
				ImageView imagem = (ImageView) view.findViewById(R.id.imageView1);
				TextView texto = (TextView) view.findViewById(R.id.textView2);
				TextView texto2 = (TextView) view.findViewById(R.id.textView4);
				TextView texto3 = (TextView) view.findViewById(R.id.textView6);
				TextView texto4 = (TextView) view.findViewById(R.id.textView8);
				
				imagem.setImageResource(img[arg0]);
				texto.setText(nome[arg0]);
				texto2.setText(preferencia[arg0]);
				texto3.setText(receitas[arg0]);
				texto4.setText(comentario[arg0]);
				return view;
		}
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela07);
		
		lista = (ListView) findViewById(R.id.listView1);
		AdapImg obj = new AdapImg();
		lista.setAdapter(obj);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela07, menu);
		return true;
	}

}
