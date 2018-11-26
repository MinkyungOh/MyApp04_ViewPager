package com.example.omin.myapp04_viewpager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment {

    public static ImageFragment newInstance(int imageUrl) {
        
        Bundle args = new Bundle();
        args.putInt("imageUrl", imageUrl);
        
        ImageFragment fragment = new ImageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.imagefragment, container, false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imagefragment_imageview);
        imageView.setImageResource(getArguments().getInt("imageUrl"));

        return view;
    }
}
