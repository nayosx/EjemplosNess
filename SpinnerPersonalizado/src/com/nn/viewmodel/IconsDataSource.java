package com.nn.viewmodel;

import java.util.ArrayList;

public class IconsDataSource {
	
	public static ArrayList<Iconos> getIconos(){
		ArrayList<Iconos> listIcons = new ArrayList<Iconos>();
		for(int i:S.DRAWABLES){
			Iconos icono = addToListIcons(i);
			listIcons.add(icono);
		}
		return listIcons;
	}

	private static Iconos addToListIcons(int i) {
		// TODO Auto-generated method stub
		Iconos icon = new Iconos();
		icon.setIcono(i);
		return icon;
	}
}
