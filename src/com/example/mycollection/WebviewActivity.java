package com.example.mycollection;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;



public class WebviewActivity extends Activity {
	
	WebView webView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		
		///initialize the variables.
	
	webView = (WebView)findViewById(R.id.wv);
	webView.getSettings().setJavaScriptEnabled(true);
	webView.loadUrl("http://www.facebook.com");
	}
}