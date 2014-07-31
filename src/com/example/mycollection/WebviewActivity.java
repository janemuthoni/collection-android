package com.example.mycollection;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebView.FindListener;

public class WebviewActivity extends Activity {
	
	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		
		///initialize the variables.
		
	webView =(WebView) FindViewById(R.id.wv);
	webView.getSettings().setJavaScriptEnabled(true);
	}
}