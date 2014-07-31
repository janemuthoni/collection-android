package com.example.mycollection;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class ButtonToastActivity extends Activity implements OnClickListener {
 Button btnback,btntoast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttontoast);

		btntoast =(Button)findViewById(R.id.buttontoast);
		btntoast.setOnClickListener(this);
		
		btnback=(Button)findViewById(R.id.buttonback);
		btnback.setOnClickListener(this);
}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttontoast:
         Toast.makeText(getApplicationContext(), "welcome", Toast.LENGTH_LONG).show();
         
         break;
		case R.id.buttonback:
			startActivity(new Intent(getApplicationContext(), ListScreenActivity.class));

		default:
			break;
		}
	}
}