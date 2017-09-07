package tr.com.emrahkahraman.checkbox;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityMain extends ActionBarActivity {

	private CheckBox chkTurkey;
	private CheckBox chkSpain;
	private CheckBox chkAzerbaijan;
	
	private Button btnDisplay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		chkTurkey=(CheckBox) findViewById(R.id.chkTurkey);
		chkSpain=(CheckBox) findViewById(R.id.chkSpain);
		chkAzerbaijan=(CheckBox) findViewById(R.id.chkAzerbaijan);
		
		btnDisplay=(Button) findViewById(R.id.btnDisplay);
		btnDisplay.setOnClickListener(clickListener);	
		
	}

	 private OnClickListener clickListener = new OnClickListener() 
	   {
		    public void onClick(View v) 
		    {
		    	switch (v.getId())
		    	{
		    	case R.id.btnDisplay:
			   
		    		StringBuffer result = new StringBuffer();
		    		result.append("Türkiye seçili : ").append(chkTurkey.isChecked());
		    		result.append("\nÝspanya seçili : ").append(chkSpain.isChecked());
		    		result.append("\nAzerbaycan seçili :").append(chkAzerbaijan.isChecked());
		     
		    		Toast.makeText(ActivityMain.this, result.toString(),
		    				Toast.LENGTH_LONG).show();
		    		
		    		break;
		    	}
		   }
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		int id = item.getItemId();
		if (id == R.id.action_settings) 
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
