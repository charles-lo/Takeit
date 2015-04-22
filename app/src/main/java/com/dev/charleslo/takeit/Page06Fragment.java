package com.dev.charleslo.takeit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class Page06Fragment extends Fragment {


    public Page06Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page_06, container, false);
        rootView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((TakeItActivity)getActivity()).replaceFragment(new Page07Fragment());
            }
        });
        return rootView;
    }
}
