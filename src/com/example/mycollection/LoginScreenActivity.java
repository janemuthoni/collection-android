package com.example.mycollection;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
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
import android.widget.Toast;

public class LoginScreenActivity extends Activity implements OnClickListener {
	//declaring Global variables.-
	TextView   tvuserrname,tvpassword;
	EditText   etpassword ,etusername;
	Button     btnBack,btnToast ;
	CheckBox   checkpasswrd;
	
public static final String PREF_NAME = "mypress";
SharedPreferences sharedpreferences;
 SharedPreferences.Editor editor; 
	@Override						
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);								
		setContentView(R.layout.loginform);
		
		//initialization  variables.
		sharedpreferences = getSharedPreferences(PREF_NAME, 0);
		editor = sharedpreferences.edit();
		
		etusername =(EditText)findViewById(R.id.etusername);
		etpassword =(EditText)findViewById(R.id.etpassword);
		
		checkpasswrd =(CheckBox)findViewById(R.id.checkbox);
		
		
		tvuserrname =(TextView)findViewById(R.id.textviewusername);
		
		btnBack = (Button)findViewById(R.id.buttonback);
		btnBack.setOnClickListener(this);
		
		btnToast =(Button)findViewById(R.id.buttonToast);
		btnToast.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		
		case  R.id.buttonToast:
String  Username = etusername.getText().toString();
String   password=  etpassword.getText().toString();




///stores the data in the share preferences.
editor.putString("keyusername", Username);
editor.putString(password, password);

editor.commit();

if (etusername.getText().toString().equals("") && etpassword.getText().toString().equals("")) {
	Toast.makeText(getApplicationContext(), "please enter your username", Toast.LENGTH_LONG).show();


}
else if (etusername.getText().toString () .equals("")) {
	Toast.makeText(getApplicationContext(), "please enter your username", Toast.LENGTH_LONG).show();	
	
} else if (etpassword.getText().toString() .equals("")) {
	Toast.makeText(getApplicationContext(), "please enter your password", Toast.LENGTH_LONG).show();

}else if (!etusername.getText().toString() .equals(Username)) {
	Toast.makeText(getApplicationContext(), "please enter your username", Toast.LENGTH_LONG).show();	
	
}else if (!etpassword.getText().toString().equals(password)) {
	Toast.makeText(getApplicationContext(), "please enter correct password", Toast.LENGTH_LONG).show();	
	
}else if (etusername.getText().toString().equals("") && etpassword.getText().toString().equals("")){
	Toast.makeText(getApplicationContext(), "login succesfully", Toast.LENGTH_LONG).show();	
}

break;		
		case  R.id.buttonback:
			
			startActivity(new Intent(getApplicationContext(),ListScreenActivity.class));

		}
			
			
		
			
		}
		
	

	
}
