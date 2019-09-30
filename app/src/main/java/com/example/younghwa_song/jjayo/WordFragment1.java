package com.example.younghwa_song.jjayo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;


public class WordFragment1 extends Fragment {
    TextView word, speak, meaning;
    public WordFragment1() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.word1, container, false);
        String wordAct = getArguments().getString("qwe");
        String wordAct2 = getArguments().getString("asd");
        String wordAct3 = getArguments().getString("zxc");


        word = (TextView)view.findViewById(R.id.word);
        speak = (TextView)view.findViewById(R.id.speak);
        meaning = (TextView)view.findViewById(R.id.meaning);
        word.setText(wordAct);
        speak.setText(wordAct2);
        meaning.setText(wordAct3);
        // 프래그먼트 그림판
//        MyView m = new MyView(getActivity());
//        darwLayout = (LinearLayout) view.findViewById(R.id.draw_layout);
//        darwLayout.addView(m);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

}
