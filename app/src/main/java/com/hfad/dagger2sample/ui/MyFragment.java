package com.hfad.dagger2sample.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hfad.dagger2sample.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class MyFragment extends DaggerFragment implements MyContract.View {

    private TextView textView;

    @Inject
    public MyContract.Presenter mPresenter;


   /* public MyFragment() {
        // Required empty public constructor
    }*/
   /*public static MyFragment newInstance(){
       Bundle args = new Bundle();

       MyFragment fragment = new MyFragment();
       fragment.setArguments(args);

       return fragment;
   }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my, container, false);
        textView = (TextView) view.findViewById(R.id.fragment_textview);
        view.findViewById(R.id.fragment_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onButtonClicked();
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.onAttachView(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        mPresenter.onDetachView();
    }

    @Override
    public void onInit() {

    }

    @Override
    public void onInitError(String message) {

    }

    @Override
    public void changeTextView() {
        String str = getResources().getString(R.string.fragment_textview_text2);
        textView.setText(str);
    }

}
