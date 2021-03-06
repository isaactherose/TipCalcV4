package com.example.tipcalcv4;
//test git 
import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	public EditText topEdit;
	public TextView tipAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         topEdit = (EditText) findViewById(R.id.topEdit);
        tipAmount = (TextView) findViewById(R.id.tipAmount);
        topEdit.setInputType(InputType.TYPE_CLASS_NUMBER);
        topEdit.setImeOptions(EditorInfo.IME_ACTION_DONE);

        
        
        
        
        

    }
    
    String roundTwoDecimals(double d)
    {

        DecimalFormat twoDForm = new DecimalFormat("#.00");
        return String.valueOf(twoDForm.format(d));
    }
      
    public void tenPercentCalculate(View v){
    	//fire when ten percent button clicked
    	double percent = .1;
    	double number = (Double.parseDouble(topEdit.getText().toString()))*percent;
    	//fire when ten percent button clicked
    	//double roundedMoney = roundTwoDecimals(number);
    	tipAmount.setText("$" + roundTwoDecimals(number));
    	 
    }
    public void fifteenPercentCalculate(View v){

    	//fire when ten percent button clicked
    	double percent = .15;
    	double number = (Double.parseDouble(topEdit.getText().toString()))*percent;
    	//fire when ten percent button clicked
    	tipAmount.setText("$" + roundTwoDecimals(number));

    }
    public void twentyPercentCalculate(View v){
    	double percent = .2;
    	double number = (Double.parseDouble(topEdit.getText().toString()))*percent;
    	//fire when ten percent button clicked
    	tipAmount.setText("$" + roundTwoDecimals(number));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
