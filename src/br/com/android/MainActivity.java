package br.com.android;

import br.com.android.R.id;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

	private Button login;
	private Button settings;
	private Button about;
	private Button exit;
	
	private Intent intent;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		login = (Button) findViewById(id.mainBtLogin);
		settings = (Button) findViewById(id.mainBtSettings);
		about = (Button) findViewById(id.mainBtAbout);
		exit = (Button) findViewById(id.mainBtExit);
		
		exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MainActivity.this.finish();
				
			}
		});
		
		settings.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				intent = new Intent(MainActivity.this, SettingsActivity.class);
				startActivity(intent);
				
			}
		});
		
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
					
				intent = new Intent(MainActivity.this, LoginActivity.class);
				startActivity(intent);
			}
		});
		
		about.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				intent = new Intent(MainActivity.this, AboutActivity.class);
				startActivity(intent);
			}
		});
		
	}
	
	

}
