package com.hfad.dagger2sample;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.hfad.dagger2sample.ui.MyFragment;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        MyFragment fragment = new MyFragment();
        ft.replace(R.id.main_container, fragment, null);
        ft.addToBackStack(null);
        ft.commit();
    }
}
