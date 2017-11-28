package com.example.chongieball.lottieandcalligraphydemo;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.airbnb.lottie.LottieAnimationView;

/**
 * Created by chongieball on 28/11/17.
 */

public class AnimationFragment extends Fragment {
    private LottieAnimationView lav;
    private Bundle bundle;

    private static final String DATA = "data";

    public AnimationFragment(){}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        bundle = getArguments();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animation, container,
                false);

        lav = view.findViewById(R.id.animation_view);

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        switch (bundle.getInt(DATA)) {
            case 1:
                openAnimation("happybirthday.json");
                break;
            case 2:
                openAnimation("motorcycle.json");
                break;
            case 3:
                openAnimation("plane.json");
                break;
        }
    }

    private void openAnimation(String file) {
        lav.setAnimation("animations/" + file);
        lav.loop(true);
        lav.playAnimation();
    }
}
