package com.example.yopool;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class UpdatePassengerDetails extends ActionBarActivity {
	
	Button button3, button2, button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_passenger_details);
		addListenerOnButtonThree();
		addListenerOnButtonTwo();
		addListenerOnButtonOne();
	}
	
	public void addListenerOnButtonThree() {
		button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(new OnClickListener() {
	 
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), 
	                       "You logged out YoPool successfully!!", Toast.LENGTH_LONG).show();
				finish();
			}
		});
	}
	
	public void addListenerOnButtonTwo() {
   	 
		final Context context = this;
		button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
			    Intent intent = new Intent(context, DriverSelect.class);
                            startActivity(intent);   
			}
		});
	}
	
	public void addListenerOnButtonOne() {
	   	 
		final Context context = this;
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), 
	                       "Updated details successfully!!", Toast.LENGTH_LONG).show();
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.update_passenger_details, menu);
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
}
