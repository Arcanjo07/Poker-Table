package br.com.android;

import br.com.android.R.id;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity{

	private Button btLogin, btCancel;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.telalogin);
		
		btLogin = (Button) findViewById(id.telaLoginBtLogin);
		btCancel = (Button) findViewById(id.telaLoginBtCancel);
		
		btLogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent intent = new Intent(LoginActivity.this, MenuLogadoActivity.class);
				startActivity(intent);
			}
		});
		
		btCancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				finish();
			}
		});
		
	}
}
