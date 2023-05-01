package com.example.app_great_taste;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;

public class Tela01 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tela01);
        
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				mostrarlogin();
				
			}
      },3000);
        
    }
			private void mostrarlogin() {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Tela01.this,Tela05.class);
				startActivity(intent);
				finish();
			}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela01, menu);
        return true;
    }
    
}
