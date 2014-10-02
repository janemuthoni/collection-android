package com.example.mycollection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class IncreamentActivity extends Activity implements OnClickListener {
	TextView tventernumber,tvResult ,tv;
	Button   btnincreament,btndecreament;
	EditText etnumberone;
	int value;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.increament);
		
		etnumberone =(EditText)findViewById(R.id.etnumberone);
		tvResult =(TextView)findViewById(R.id.tvResult);
		
		btnincreament =(Button)findViewById(R.id.buttonincreament);
		btnincreament.setOnClickListener(this);
		
		btndecreament =(Button)findViewById(R.id.buttondecreament);
		btndecreament.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		int value = 0;
		switch (v.getId()) {
		case R.id.buttonincreament:
		value = Integer.parseInt(etnumberone.getText().toString());
		value++; 
		etnumberone.setText("" + value); // this is to update text
		tvResult.setText("The result is:" + value); //update label
		break;
		case R.id.buttondecreament:

		value = Integer.parseInt(etnumberone.getText().toString());
		value--;
		etnumberone.setText("" + value); // update text
		tvResult.setText("The results:" + value); // update label
		break;

		default:
		break;
		}
	
	}
}
	

	