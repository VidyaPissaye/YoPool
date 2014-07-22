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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeNew extends ActionBarActivity {
	
	Button button1, button2, button3, button4, button5, button6;
	TextView textview2,textview3,textview4;
	EditText edittext1, edittext2, edittext3;
	RadioGroup radioButton2;
	int flag=-1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_new);
		addListenerOnButtonOne();
		addListenerOnButtonTwo();
		addListenerOnButtonThree();
		addListenerOnButtonFour();
		addListenerOnButtonFive();
		addListenerOnButtonSix();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome_new, menu);
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
	
	public void addListenerOnButtonTwo() {
	   	 
    	button2 = (Button) findViewById(R.id.button2);
    	textview2 = (TextView)this.findViewById(R.id.textView2);
    	textview3 = (TextView)this.findViewById(R.id.textView3);
    	textview4 = (TextView)this.findViewById(R.id.textView4);
    	button4 = (Button) findViewById(R.id.button4);
    	edittext1 = (EditText)this.findViewById(R.id.editText1);
    	edittext2 = (EditText)this.findViewById(R.id.editText2);
    	edittext3 = (EditText)this.findViewById(R.id.editText3);
    	
    	button2.setOnClickListener(new OnClickListener() {
     
    	  @Override
    	  public void onClick(View v) {
    		
    			textview2.setVisibility(View.VISIBLE);
    			textview3.setVisibility(View.VISIBLE);
    			textview4.setVisibility(View.VISIBLE);
    			button4.setVisibility(View.VISIBLE);
    			edittext1.setVisibility(View.VISIBLE);
    			edittext2.setVisibility(View.VISIBLE);
    			edittext3.setVisibility(View.VISIBLE);
    		
     
    	  }
    	});
    }
	
	public void addListenerOnButtonThree() {
	   	 
    	button3 = (Button) findViewById(R.id.button3);
    	button5 = (Button) findViewById(R.id.button5);
    	button6 = (Button) findViewById(R.id.button6);
        radioButton2 = (RadioGroup) findViewById(R.id.radioButton2);
    	
    
    	
    	button3.setOnClickListener(new OnClickListener() {
     
    	  @Override
    	  public void onClick(View v) {
    		
    			button5.setVisibility(View.VISIBLE);
    			button6.setVisibility(View.VISIBLE);
    			radioButton2.setVisibility(View.VISIBLE);
    	  }
    	});
    }
	
	public void addListenerOnButtonFour() {
		final Context context = this;
    	button4 = (Button) findViewById(R.id.button4);
    	button4.setOnClickListener(new OnClickListener() {
     
    	  @Override
    	  public void onClick(View v) {
    		  //if passenger
    		if(flag==1){
    			Intent intent = new Intent(context, DriverSelect.class);
                startActivity(intent); 
    		}
    		else if (flag==0){
    			Toast.makeText(getApplicationContext(), 
                        "Thank you!! You will hear about your passengers 10 min prior to your departure!!", Toast.LENGTH_LONG).show();
    		}
    			
    	  }
    	});
    }
	
	public void addListenerOnButtonSix() {
		final Context context = this;
	   	 
    	button6 = (Button) findViewById(R.id.button6);
    	
    	button6.setOnClickListener(new OnClickListener() {
     
    	  @Override
    	  public void onClick(View v) {
    		
    		  if(flag==0){
    			  Toast.makeText(getApplicationContext(), 
                          "Thank you!! We just cancelled your availability!!", Toast.LENGTH_LONG).show();
          
    		  }
    		  else if(flag==1) {
    			  Toast.makeText(getApplicationContext(), 
                          "Thank you!! We just cancelled your booking!!", Toast.LENGTH_LONG).show();
    		  }
     
    	  }
    	});
    }
	
	public void addListenerOnButtonFive() {
		final Context context = this;
	   	 
    	button5 = (Button) findViewById(R.id.button5);
    	
    	button5.setOnClickListener(new OnClickListener() {
     
    	  @Override
    	  public void onClick(View v) {
    		
    		  if(flag==0){
    		  Intent intent = new Intent(context, UpdateDriverDetails.class);
              startActivity(intent);   
          
    		  }
    		  else if(flag==1) {
    			  Intent intent = new Intent(context, UpdatePassengerDetails.class);
                  startActivity(intent);  
    		  }
     
    	  }
    	});
    }
	
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.driver:
	            if (checked)
	                flag=0;
	            break;
	        case R.id.passenger:
	            if (checked)
	                flag=1;
	            break;
	    }
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
}
