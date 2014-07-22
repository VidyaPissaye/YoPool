package com.example.yopool;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Registration extends ActionBarActivity {
	
	CheckBox chkIos;
	TextView textview_available;
	Spinner spinner;
	Button button1, button2;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		addListenerOnChkIos();
		addListenerOnButtonOne();
		addListenerOnButtonTwo();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registration, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	  public void addListenerOnButtonOne() {
			button1 = (Button) findViewById(R.id.button1);
			button1.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
					Toast.makeText(getApplicationContext(), 
	                        "You logged out YoPool successfully!!", Toast.LENGTH_LONG).show();
					finish();
				}
			});
		}
	  
	  public void addListenerOnButtonTwo() {
			button2 = (Button) findViewById(R.id.button2);
			button2.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View arg0) {
					Toast.makeText(getApplicationContext(), 
	                        "Welcome to YoPool!! You are registered successfully!!", Toast.LENGTH_LONG).show();
				}
			});
		}
	
	public void addListenerOnChkIos() {
   	 
    	chkIos = (CheckBox) findViewById(R.id.checkBox1);
    	textview_available = (TextView)this.findViewById(R.id.textView7);
    	spinner = (Spinner)this.findViewById(R.id.spinner1);
    	 
    	chkIos.setOnClickListener(new OnClickListener() {
     
    	  @Override
    	  public void onClick(View v) {
                    //is chkIos checked?
    		if (((CheckBox) v).isChecked()) {
    			textview_available.setVisibility(View.VISIBLE);
    			spinner.setVisibility(View.VISIBLE);			
    		}
     
    	  }
    	});
    }
}
