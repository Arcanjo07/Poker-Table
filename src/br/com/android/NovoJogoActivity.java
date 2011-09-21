package br.com.android;

import br.com.android.R.id;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NovoJogoActivity extends Activity{

	private Button btCancel;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newgame);
		
		btCancel = (Button) findViewById(id.newGameBtCancel);
		
		btCancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				finish();
			}
		});
		
	}
}
