package com.example.mycollection;
import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListScreenActivity extends Activity implements OnItemClickListener  {
	
	//declaring variables.
	private ListView listView;
	private ArrayAdapter<String> stringArrayAdapter;
	String []  lists={"Additon","Subtraction","login form","Decreament","Increament","Button toast","countries","webview"};

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		
		// Initialization
		listView =(ListView) findViewById(R.id.list);
		ArrayList<String> Lists = new ArrayList<String>();
		Lists.addAll(Arrays.asList(lists));
		
		// Design the ListView
		stringArrayAdapter =  new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,Lists);
		listView.setAdapter(stringArrayAdapter);
		listView.setOnItemClickListener(this);
		
		
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		String ListData= listView.getItemAtPosition(position).toString();
		switch (position) {
		case 0:
			startActivity(new Intent(getApplicationContext(),AdditionScreenActivity.class));
			Toast.makeText(getApplicationContext(), "welcome to addition page", Toast.LENGTH_LONG).show();
			break;
			
		case 1:
			startActivity(new Intent(getApplicationContext(),SubtractionActivity.class));
			Toast.makeText(getApplicationContext(), "welcome to  add screen", Toast.LENGTH_LONG).show();
			break;
		case 2:
             startActivity(new Intent(getApplicationContext(),LoginScreenActivity.class));
            Toast.makeText(getApplicationContext(), "welcome to login screen ", Toast.LENGTH_LONG).show();
         break;
			
		case 3:
			
			startActivity(new Intent(getApplicationContext(),IncreamentActivity.class));
			Toast.makeText(getApplicationContext(), "welcome to Decreamemt ", Toast.LENGTH_LONG).show();
			
		case  4:
			startActivity(new Intent(getApplicationContext(),ButtonToastActivity.class));
			Toast.makeText(getApplicationContext(), "welcome to Button Toast", Toast.LENGTH_LONG).show();
			
			break;
		case 5:
			startActivity(new Intent(getApplicationContext(),CountriesActivity.class));
			Toast.makeText(getApplicationContext(), "welcome to countries", Toast.LENGTH_LONG).show();
		
		case  6:
			startActivity(new Intent(getApplicationContext(),WebviewActivity.class));
         
		default:
			break;
		}
	
		
	




















	
	}
	
	
	
	
	
   
    
}
