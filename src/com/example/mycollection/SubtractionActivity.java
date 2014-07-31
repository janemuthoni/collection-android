package com.example.mycollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubtractionActivity extends Activity implements OnClickListener {


//declare 
 Button     btnAdd,btnBack ,btnsub;
 String     strnumberone,strnumbertwo,stranswer;
 EditText   etnumberone,etnumbertwo,etResult;
 TextView   tvResult;
 int        numberone,numbertwo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subtraction);
	
/// initializing 
etnumberone =(EditText)findViewById(R.id.etnumberone);
etnumbertwo =(EditText)findViewById(R.id.etnumbertwo);
		
tvResult = (TextView)findViewById(R.id.tvResult);
	
  btnsub=(Button)findViewById(R.id.buttonsub);
  btnsub.setOnClickListener(this);
  
  btnAdd =(Button) findViewById(R.id.buttonadd);
  btnAdd.setOnClickListener(this);
  
  btnBack=(Button)findViewById(R.id.buttonback);
  btnBack.setOnClickListener(this);
  
 
}
	

@Override
public void onClick(View v) {
	switch (v.getId()) {
	case  R.id.buttonsub:
		 
		  //change integer String   
		  strnumberone=(etnumberone).getText().toString();
		  strnumbertwo=(etnumbertwo).getText().toString();
		   
		//convert String to Integer.
		  numberone=Integer.parseInt(strnumberone);
		  numbertwo=Integer.parseInt(strnumbertwo);
		  
 
   int answer= addition(numberone, numbertwo);
  String Result=String.valueOf(answer);
  tvResult.setText(Result);
 Toast.makeText(getApplicationContext(), "welcome to sub", Toast.LENGTH_LONG).show();
 break;
 
	case R.id.buttonadd:
		//change integer String   
		  strnumberone=(etnumberone).getText().toString();
		  strnumbertwo=(etnumbertwo).getText().toString();
		   
		//convert String to Integer.
		  numberone=Integer.parseInt(strnumberone);
		  numbertwo=Integer.parseInt(strnumbertwo);	
	
		int answer1=subtraction(numberone, numbertwo);
		String Result1=String.valueOf(answer1);
		tvResult.setText(Result1);
Toast.makeText(getApplicationContext(), "welcome to login Screen", Toast.LENGTH_LONG).show();
		
 break;
	case R.id.buttonback:
		startActivity(new Intent(getApplicationContext(), ListScreenActivity.class));
		
		

	default:
		break;
	}
}


public  int subtraction(int numberone, int numbertwo) {
	         int answer=(numberone+numbertwo);
	         return answer;
}


public int addition(int numberone, int numbertwo) {
	       int answer=(numberone-numbertwo);
	           return answer;
}		
}