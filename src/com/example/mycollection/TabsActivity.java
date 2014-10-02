package com.example.mycollection;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabsActivity extends Activity {
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs);
	}
	//Instantiate class TabHost
TabHost tabHost=getTabHost();//holds the tabs
Resources resources = getResources();

//set tab one.
Intent homeActivity = new Intent().setClass(getApplicationContext(), HomeActivity.class);
TabSpec hometabSpec = tabHost.newTabSpec("Home")
.setIndicator("Home",resources.getDrawable(R.drawable.ic_launcher))
.setContent(homeActivity);

Intent contactsActivity = new Intent().setClass(getApplicationContext(), ContactActivity.class);
TabSpec contactstabSpec = tabHost.newTabSpec("Contact Us").setIndicator("Contact",resources.getDrawable(R.drawable.ic_launcher))
.setContent(contactsActivity);

Intent aboutActivity = new Intent().setClass(getApplicationContext(), AboutActivity.class);
TabSpec abouttabSpec = tabHost.newTabSpec("About Us")
.setIndicator("About",resources.getDrawable(R.drawable.ic_launcher))
.setContent(aboutActivity);

private TabHost getTabHost() {
	// TODO Auto-generated method stub
	return null;
}

//tab the Tabs

tabHost.addTab(hometabSpec);
tabHost.addTab(abouttabSpec);
tabHost.addTab(contactstabSpec);
	
	}

