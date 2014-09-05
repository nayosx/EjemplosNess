package com.example.usandofragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Lista extends Fragment implements OnItemClickListener{

	ListView lista;
	Activity activity;
	OnListItemClickListener listacallback;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		ViewGroup root = (ViewGroup) inflater.inflate(R.layout.lista, null);
		init(root);
		return root;
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		this.activity = activity;
		try {
			listacallback = (OnListItemClickListener) getActivity();
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnFileSelectedListener");
        }
	}

	private void init(ViewGroup root) {
		// TODO Auto-generated method stub
		
		String [] simpletext = {"uno", "dos", "tres"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(activity,android.R.layout.simple_list_item_1, simpletext);
		lista = (ListView) root.findViewById(R.id.listView1);
		lista.setAdapter(adapter);
		lista.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		listacallback.onListClick(position+1);
	}

}
