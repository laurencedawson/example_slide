package com.laurencedawson.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Sample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sample);
		
		DrawerGarment mDrawerGarment = new DrawerGarment(this, R.layout.drawer);
		mDrawerGarment.setDecorContentBackgroundColor(0xffeeeeee);
		mDrawerGarment.reconfigureViewHierarchy();
	}
}
