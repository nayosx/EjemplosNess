package com.nn.spinnerpersonalizado;

import com.nn.viewmodel.IconAdapter;
import com.nn.viewmodel.IconsDataSource;
import com.nn.viewmodel.S;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener{

	private IconAdapter adaptador;
	private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner1);
        adaptador = new IconAdapter(IconsDataSource.getIconos(), this);
        spinner.setAdapter(adaptador);
        spinner.setOnItemSelectedListener(this);
    }
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), S.NAME_ICONS[position], Toast.LENGTH_SHORT).show();
		
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
}
