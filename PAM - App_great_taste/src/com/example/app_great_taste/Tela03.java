package com.example.app_great_taste;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Tela03 extends Activity {

	public static int[] img;
	public static String[] nomes, usuarios, tempos;
	public static int[] tamanho = new int[5];
	public static int val = 1;
	public static int tipo;

	public static int[] img_carne = { R.drawable.bife_a_role1,
			R.drawable.bife_a_parmegiana1, R.drawable.escondidinho1,
			R.drawable.bolo_de_carne1, R.drawable.lasanha_carne1 };
	public static String[] nome_carne = { "Bife a rolê", "Bife parmegiana",
			"Escondidinho de frango", "Bolo de carne", "Lasanha de carne moida" };
	public static String[] usuario_carne = { "Ederalimentos", "Cozinhaadois",
			"Minhareceita", "Cozinhaadois", "Coolicias" };
	public static String[] tempo_carne = { "00:40h", "01:30h", "01:00h",
			"01:00h", "00:40h" };

	public static int[] img_sobremesas = { R.drawable.banoffee1,
			R.drawable.torta_limao1, R.drawable.petitgateau1,
			R.drawable.torta_bis1, R.drawable.pave_ninho1 };
	public static String[] nome_sobremesas = { "Banoffee", "Torta de limão",
			"Petit gateau", "Torta de Bis", "Pavê de Leite Ninho com morango" };
	public static String[] usuario_sobremesas = { "TudoGostoso",
			"ReceitasNestle", "CyberCook", "CyberCook", "ReceitasNestle" };
	public static String[] tempo_sobremesas = { "00:30h", "01:40h", "00:30h",
			"00:30h", "01:10h" };

	public static int[] img_vegetarianas = { R.drawable.lasanha_berinjela1,
			R.drawable.dadinho_tapioca1, R.drawable.hamburguer_cogumelos1,
			R.drawable.quibe_abobora1, R.drawable.pastel_palmito1 };
	public static String[] nome_vegetarianas = {
			"Lasanha de berinjela simples", "Dadinho de tapioca com queijo ",
			"Hambúrguer de cogumelos com cevada", "Quibe de abóbora",
			"Pastel de palmito" };
	public static String[] usuario_vegetarianas = { "AnaMariaBraga",
			"CyberCook", "SaboreieAVida", "TudoGostoso", "SaboresAjinomoto" };
	public static String[] tempo_vegetarianas = { "00:25h", "01:00h", "00:20h",
			"00:45h", "01:30h" };

	public static int[] img_saudaveis = { R.drawable.ratatouille1,
			R.drawable.pao_fuba, R.drawable.panqueca_abobrinha1,
			R.drawable.peito_frango1, R.drawable.smoothie_morango_banana1 };
	public static String[] nome_saudaveis = { "Ratatouille", "Pão de fubá",
			"Panqueca de abobrinha", "Peito de frango com pimentão", "Smoothie de morango e banana" };
	public static String[] usuario_saudaveis = { "ReceitasNestle",
			"TudoGostoso", "TudoGostoso", "Receiteria", "TudoGostoso" };
	public static String[] tempo_saudaveis = { "01:20h", "02:30h", "00:40h",
			"00:15h", "00:10h" };

	public static int[] img_orientais = { R.drawable.lamen1,
			R.drawable.tteokbokki1, R.drawable.mapo_tofu1,
			R.drawable.rolinho_primavera1, R.drawable.yakissoba1 };
	public static String[] nome_orientais = { "Lámen japonês", "Tteokbokki",
			"Mapo tofu", "Rolinho primavera", "Yakissoba" };
	public static String[] usuario_orientais = { "TudoReceitas", "SaborNaMesa",
			"Cookidoo", "TudoGostoso", "CyberCook" };
	public static String[] tempo_orientais = { "00:30h", "00:30h", "00:15h",
			"00:40h", "00:30h" };

	Bundle bundle_img = new Bundle();
	Bundle bundle_nome = new Bundle();
	Bundle bundle_tempo = new Bundle();
	Bundle bundle_usuario = new Bundle();
	Bundle bundle_tipo = new Bundle();

	/*
	 * bundle.putIntArray("img", img); Intent it = new
	 * Intent(Tela03.this,Tela04.class); it.putExtras(bundle);
	 * startActivity(it);
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_tela03);

		Bundle id = getIntent().getExtras();
		int valor = id.getInt("valor");

		switch (valor) {
		case 1:
			img = img_carne;
			nomes = nome_carne;
			usuarios = usuario_carne;
			tempos = tempo_carne;
			val = valor;
			break;
		case 2:
			img = img_sobremesas;
			nomes = nome_sobremesas;
			usuarios = usuario_sobremesas;
			tempos = tempo_sobremesas;
			val = valor;
			break;
		case 3:
			img = img_vegetarianas;
			nomes = nome_vegetarianas;
			usuarios = usuario_vegetarianas;
			tempos = tempo_vegetarianas;
			val = valor;
			break;
		case 4:
			img = img_saudaveis;
			nomes = nome_saudaveis;
			usuarios = usuario_saudaveis;
			tempos = tempo_saudaveis;
			val = valor;
			break;
		case 5:
			img = img_orientais;
			nomes = nome_orientais;
			usuarios = usuario_orientais;
			tempos = tempo_orientais;
			val = valor;
			break;
		default:
			break;
		}

		ListView lista = (ListView) findViewById(R.id.listView1);

		AdapImg obj = new AdapImg(Tela03.this, img, nomes, tempos, usuarios);
		lista.setAdapter(obj);

		lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View arg1,
					int position, long id) {
				Intent receita = new Intent(Tela03.this, Tela04.class);

				if (val == 1) {
					switch (position) {
					case 0:
						bundle_img.putInt("val_img", img_carne[position]);
						bundle_nome.putString("val_nome", nome_carne[position]);
						bundle_tempo.putString("val_tempo",
								tempo_carne[position]);
						bundle_usuario.putString("val_usuario",
								usuario_carne[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 0;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 1:
						bundle_img.putInt("val_img", img_carne[position]);
						bundle_nome.putString("val_nome", nome_carne[position]);
						bundle_tempo.putString("val_tempo",
								tempo_carne[position]);
						bundle_usuario.putString("val_usuario",
								usuario_carne[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 1;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 2:
						bundle_img.putInt("val_img", img_carne[position]);
						bundle_nome.putString("val_nome", nome_carne[position]);
						bundle_tempo.putString("val_tempo",
								tempo_carne[position]);
						bundle_usuario.putString("val_usuario",
								usuario_carne[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 2;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 3:
						bundle_img.putInt("val_img", img_carne[position]);
						bundle_nome.putString("val_nome", nome_carne[position]);
						bundle_tempo.putString("val_tempo",
								tempo_carne[position]);
						bundle_usuario.putString("val_usuario",
								usuario_carne[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 3;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 4:
						bundle_img.putInt("val_img", img_carne[position]);
						bundle_nome.putString("val_nome", nome_carne[position]);
						bundle_tempo.putString("val_tempo",
								tempo_carne[position]);
						bundle_usuario.putString("val_usuario",
								usuario_carne[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 4;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					default:
						break;
					}
				} else if (val == 2) {
					switch (position) {
					case 0:
						bundle_img.putInt("val_img", img_sobremesas[position]);
						bundle_nome.putString("val_nome",
								nome_sobremesas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_sobremesas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_sobremesas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 5;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 1:
						bundle_img.putInt("val_img", img_sobremesas[position]);
						bundle_nome.putString("val_nome",
								nome_sobremesas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_sobremesas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_sobremesas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 6;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 2:
						bundle_img.putInt("val_img", img_sobremesas[position]);
						bundle_nome.putString("val_nome",
								nome_sobremesas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_sobremesas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_sobremesas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 7;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 3:
						bundle_img.putInt("val_img", img_sobremesas[position]);
						bundle_nome.putString("val_nome",
								nome_sobremesas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_sobremesas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_sobremesas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 8;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 4:
						bundle_img.putInt("val_img", img_sobremesas[position]);
						bundle_nome.putString("val_nome",
								nome_sobremesas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_sobremesas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_sobremesas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 9;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;

					default:
						break;
					}
				} else if (val == 3) {
					switch (position) {
					case 0:
						bundle_img
								.putInt("val_img", img_vegetarianas[position]);
						bundle_nome.putString("val_nome",
								nome_vegetarianas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_vegetarianas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_vegetarianas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 10;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 1:
						bundle_img
								.putInt("val_img", img_vegetarianas[position]);
						bundle_nome.putString("val_nome",
								nome_vegetarianas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_vegetarianas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_vegetarianas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 11;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 2:
						bundle_img
								.putInt("val_img", img_vegetarianas[position]);
						bundle_nome.putString("val_nome",
								nome_vegetarianas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_vegetarianas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_vegetarianas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 12;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 3:
						bundle_img
								.putInt("val_img", img_vegetarianas[position]);
						bundle_nome.putString("val_nome",
								nome_vegetarianas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_vegetarianas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_vegetarianas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 13;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 4:
						bundle_img
								.putInt("val_img", img_vegetarianas[position]);
						bundle_nome.putString("val_nome",
								nome_vegetarianas[position]);
						bundle_tempo.putString("val_tempo",
								tempo_vegetarianas[position]);
						bundle_usuario.putString("val_usuario",
								usuario_vegetarianas[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 14;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					default:
						break;
					}
				} else if (val == 4) {
					switch (position) {
					case 0:
						bundle_img.putInt("val_img", img_saudaveis[position]);
						bundle_nome.putString("val_nome",
								nome_saudaveis[position]);
						bundle_tempo.putString("val_tempo",
								tempo_saudaveis[position]);
						bundle_usuario.putString("val_usuario",
								usuario_saudaveis[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 15;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 1:
						bundle_img.putInt("val_img", img_saudaveis[position]);
						bundle_nome.putString("val_nome",
								nome_saudaveis[position]);
						bundle_tempo.putString("val_tempo",
								tempo_saudaveis[position]);
						bundle_usuario.putString("val_usuario",
								usuario_saudaveis[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 16;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 2:
						bundle_img.putInt("val_img", img_saudaveis[position]);
						bundle_nome.putString("val_nome",
								nome_saudaveis[position]);
						bundle_tempo.putString("val_tempo",
								tempo_saudaveis[position]);
						bundle_usuario.putString("val_usuario",
								usuario_saudaveis[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 17;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 3:
						bundle_img.putInt("val_img", img_saudaveis[position]);
						bundle_nome.putString("val_nome",
								nome_saudaveis[position]);
						bundle_tempo.putString("val_tempo",
								tempo_saudaveis[position]);
						bundle_usuario.putString("val_usuario",
								usuario_saudaveis[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 18;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 4:
						bundle_img.putInt("val_img", img_saudaveis[position]);
						bundle_nome.putString("val_nome",
								nome_saudaveis[position]);
						bundle_tempo.putString("val_tempo",
								tempo_saudaveis[position]);
						bundle_usuario.putString("val_usuario",
								usuario_saudaveis[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 19;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					default:
						break;
					}
				} else {
					switch (position) {
					case 0:
						bundle_img.putInt("val_img", img_orientais[position]);
						bundle_nome.putString("val_nome",
								nome_orientais[position]);
						bundle_tempo.putString("val_tempo",
								tempo_orientais[position]);
						bundle_usuario.putString("val_usuario",
								usuario_orientais[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 20;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 1:
						bundle_img.putInt("val_img", img_orientais[position]);
						bundle_nome.putString("val_nome",
								nome_orientais[position]);
						bundle_tempo.putString("val_tempo",
								tempo_orientais[position]);
						bundle_usuario.putString("val_usuario",
								usuario_orientais[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 21;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 2:
						bundle_img.putInt("val_img", img_orientais[position]);
						bundle_nome.putString("val_nome",
								nome_orientais[position]);
						bundle_tempo.putString("val_tempo",
								tempo_orientais[position]);
						bundle_usuario.putString("val_usuario",
								usuario_orientais[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 22;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 3:
						bundle_img.putInt("val_img", img_orientais[position]);
						bundle_nome.putString("val_nome",
								nome_orientais[position]);
						bundle_tempo.putString("val_tempo",
								tempo_orientais[position]);
						bundle_usuario.putString("val_usuario",
								usuario_orientais[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 23;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					case 4:
						bundle_img.putInt("val_img", img_orientais[position]);
						bundle_nome.putString("val_nome",
								nome_orientais[position]);
						bundle_tempo.putString("val_tempo",
								tempo_orientais[position]);
						bundle_usuario.putString("val_usuario",
								usuario_orientais[position]);
						receita.putExtras(bundle_img);
						receita.putExtras(bundle_nome);
						receita.putExtras(bundle_tempo);
						receita.putExtras(bundle_usuario);
						tipo = 24;
						bundle_tipo.putInt("val_tipo", tipo);
						receita.putExtras(bundle_tipo);
						break;
					default:
						break;
					}
				}
				startActivity(receita);

			}
		});
		
		/*
		 * class CustomAdapter extends ArrayAdapter<String> { CustomAdapter() {
		 * super(Tela03.this, R.layout.activity_tela03, R.id.label, items); }
		 * 
		 * public View getView(final int position, View convertView, ViewGroup
		 * parent) { View row=super.getView(position, convertView, parent);
		 * deleteImg=(ImageView)row.findViewById(R.id.icon);
		 * 
		 * deleteImg.setImageResource(R.drawable.delete);
		 * deleteImg.setOnClickListener(new OnClickListener() { String s =
		 * items[position];
		 * 
		 * @Override public void onClick(View v) { Toast.makeText(context, s,
		 * Toast.LENGTH_SHORT).show(); } });
		 * 
		 * return(row); }
		 */
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tela_lista, menu);
		return true;
	}

	class AdapImg extends ArrayAdapter<String> {

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		Context context;
		int[] imgs;
		String[] myNome;
		String[] myTempo;
		String[] myUsuario;

		AdapImg(Context c, int[] img, String[] nomes, String[] tempos,
				String[] usuarios) {
			super(c, R.layout.modelo_lista, R.id.textView1, nomes);
			this.context = c;
			this.imgs = img;
			this.myNome = nomes;
			this.myTempo = tempos;
			this.myUsuario = usuarios;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			Bundle id = getIntent().getExtras();
			int valor = id.getInt("valor");

			switch (valor) {
			case 1:
				img = img_carne;
				nomes = nome_carne;
				usuarios = usuario_carne;
				tempos = tempo_carne;
				val = 1;
				break;
			case 2:
				img = img_sobremesas;
				nomes = nome_sobremesas;
				usuarios = usuario_sobremesas;
				tempos = tempo_sobremesas;
				val = 2;
				break;
			case 3:
				img = img_vegetarianas;
				nomes = nome_vegetarianas;
				usuarios = usuario_vegetarianas;
				tempos = tempo_vegetarianas;
				val = 3;
				break;
			case 4:
				img = img_saudaveis;
				nomes = nome_saudaveis;
				usuarios = usuario_saudaveis;
				tempos = tempo_saudaveis;
				val = 4;
				break;
			case 5:
				img = img_orientais;
				nomes = nome_orientais;
				usuarios = usuario_orientais;
				tempos = tempo_orientais;
				val = 5;
				break;
			default:
				break;
			}

			/*
			 * LayoutInflater layoutInflater =
			 * (LayoutInflater)getApplicationContext
			 * ().getSystemService(Context.LAYOUT_INFLATER_SERVICE); View
			 * modelo_lista = layoutInflater.inflate(R.layout.modelo_lista,
			 * parent, false); ImageView images =
			 * modelo_lista.findViewById(R.id.imageView1);
			 */

			View view = getLayoutInflater()
					.inflate(R.layout.modelo_lista, null);
			ImageView imagem = (ImageView) view.findViewById(R.id.imageView1);
			TextView texto = (TextView) view.findViewById(R.id.textView1);
			TextView texto2 = (TextView) view.findViewById(R.id.textView2);
			TextView texto3 = (TextView) view.findViewById(R.id.textView3);

			imagem.setImageResource(img[position]);
			texto.setText(nomes[position]);
			texto2.setText(usuarios[position]);
			texto3.setText(tempos[position]);

			Typeface font = Typeface.createFromAsset(getAssets(), "planetchalk.ttf");
			texto.setTypeface(font);
			texto2.setTypeface(font);
			texto3.setTypeface(font);
			
			return view;

			/* return super.getView(position, convertView, parent); */
		}

	}

}
