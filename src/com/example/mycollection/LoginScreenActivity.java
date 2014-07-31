package com.example.mycollection;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreenActivity extends Activity implements OnClickListener, OnCheckedChangeListener {
	//declaring Global variables.-
	TextView   tvuserrname,tvpassword;
	EditText   etpassword ,etusername;
	Button     btnBack,btnToast ;
	CheckBox   checkpasswrd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginform);
		
		//initialization  variables
		etusername =(EditText)findViewById(R.id.etusername);
		etpassword =(EditText)findViewById(R.id.etpassword);
		
		checkpasswrd =(CheckBox)findViewById(R.id.checkbox);
		checkpasswrd.setOnCheckedChangeListener(this);
		
		tvuserrname =(TextView)findViewById(R.id.textviewusername);
		
		btnBack = (Button)findViewById(R.id.buttonback);
		btnBack.setOnClickListener(this);
		
		btnToast =(Button)findViewById(R.id.buttonToast);
		btnToast.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonback:
			
startActivity(new Intent(getApplicationContext(),ListScreenActivity.class));
break;
		case  R.id.buttonToast:
String  Username="Akirachixa";
String   password= "girls599999";

if (etuser.getText().toString().equals("") && etpass.getText().toString().equals("")) {

	
	
}
else if (etusername.getText().toString.equals("")) {
	
} else if {

}
			
			
		default:
			break;
		}
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (!isChecked) {
			
			etpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
			
		} else {
			etpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
			

		}
		
	}
	

}
