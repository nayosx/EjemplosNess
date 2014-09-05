package com.example.usandofragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements OnListItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	@Override
	public void onListClick(int arg) {
		// TODO Auto-generated method stub
		Detalles detalle = (Detalles) this.getFragmentManager().findFragmentById(R.id.fragment2);
		detalle.mostrar(arg);
	}
}
