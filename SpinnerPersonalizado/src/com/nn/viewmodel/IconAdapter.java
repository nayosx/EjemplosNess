package com.nn.viewmodel;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.nn.spinnerpersonalizado.R;

public class IconAdapter extends BaseAdapter{
	private ArrayList<Iconos> list;
	private Context context;
	
	
	public IconAdapter(ArrayList<Iconos> list, Context context) {
		this.list = list;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = null;
		ImageView icono;
		
		view = LayoutInflater.from(context).inflate(R.layout.iconlayout, null);
		icono = (ImageView) view.findViewById(R.id.icon);
		icono.setImageResource(list.get(position).getIcono());
		return view;
	}

}
