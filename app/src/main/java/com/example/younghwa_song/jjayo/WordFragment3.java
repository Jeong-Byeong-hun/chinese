package com.example.younghwa_song.jjayo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class WordFragment3  extends Fragment {

    public WordFragment3() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.word3, container, false);

        // 프래그먼트 그림판
//        MyView m = new MyView(getActivity());
//        darwLayout = (LinearLayout) view.findViewById(R.id.draw_layout);
//        darwLayout.addView(m);

        return view;
    }
}