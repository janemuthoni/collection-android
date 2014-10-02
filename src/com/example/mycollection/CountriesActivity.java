package com.example.mycollection;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class CountriesActivity extends Activity implements OnClickListener, OnItemClickListener {
	Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.countries);
//spinner element.		
spinner1 =(Spinner)findViewById(R.id.spinner1);
//initializing screen on item click listener.
spinner1.setOnItemClickListener(this);
		
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("japan");
		 list.add("dubai");
		 list.add("Idhonesia");
		 list.add("Argentina");
		 list.add("Germany");
		 list.add("Ghana");
		 list.add("Tanznia");
		 list.add("Rwanda");
		 
ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
//design of the layout.
dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
          spinner1.setAdapter(dataAdapter);
		
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
	String item = parent.getItemAtPosition(position).toString();
	

		
		
	}
	@Override
	public void onClick(View v) {
		
		
	}

	
}

		