package br.com.android;

import br.com.android.R.id;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuLogadoActivity extends Activity{

	private Button btNovoJogo, btLogout;
	private Intent intent;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menulogado);
		
		btNovoJogo = (Button) findViewById(id.menuLogadoBtNewGame);
		btLogout = (Button) findViewById(id.menuLogadoBtLogout);
		
		btNovoJogo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				intent = new Intent(MenuLogadoActivity.this, NovoJogoActivity.class);
				startActivity(intent);
				
			}
		});
		
		btLogout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
	
				finish();
				
			}
		});
	}
	
}
