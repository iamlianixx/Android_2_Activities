package usc.sibi.contactsdatabase;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class ContactsMainActivity extends Activity {

	
	TextView tvHeader;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contacts_main);
		tvHeader = (TextView)findViewById(R.id.tvCHeader);
		tvHeader.setText("Contacts");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_contacts_main, menu);
		return true;
	}

}
