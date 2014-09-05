package com.example.usandofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Detalles extends Fragment {
	ViewGroup root;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		root = (ViewGroup) inflater.inflate(R.layout.detalle, null);
		return root;
		
	}
	public void mostrar(int arg){
		//Toast.makeText(getActivity(), ""+arg, Toast.LENGTH_SHORT).show();
		TextView titulo = (TextView) root.findViewById(R.id.textdetalle);
		titulo.setText(""+arg);
	}
}
