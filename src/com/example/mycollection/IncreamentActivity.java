package com.example.mycollection;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class IncreamentActivity extends Activity implements OnClickListener {
	TextView tventernumber,Result ,tv;
	Button   btnincreament,btndecreament;
	EditText etnumberone;
	int value;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.increament);
		
		etnumberone =(EditText)findViewById(R.id.etnumberone);
		tventernumber = (TextView)findViewById(R.id.enternumber);
		
		btnincreament =(Button)findViewById(R.id.buttonincreament);
		btnincreament.setOnClickListener(this);
		
		btndecreament =(Button)findViewById(R.id.buttondecreament);
		btndecreament.setOnClickListener(this);
			}

	@Override
	public void onClick(View v) {
		boolean showText = true;
		switch (v.getId()) {
		case R.id.buttonincreament:
			
			value = Integer.parseInt(etnumberone.getText().toString());
			if(showText){
			 value ++;
			 tvResult.setText(String.valueOf("Result: " + value));
			break;
			 case R.id.buttondecreament:
				 

		default:
			break;
		}
	
		
	}

}
	