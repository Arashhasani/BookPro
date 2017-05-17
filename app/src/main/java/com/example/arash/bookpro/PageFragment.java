package com.example.arash.bookpro;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Arash on 5/17/2017.
 */

public class PageFragment extends Fragment {
    private int mpage;
    public static final String arg_page="arg_page";
    public static PageFragment newInstance(int page){
        Bundle args = new Bundle();
        args.putInt(arg_page , page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mpage=getArguments().getInt(arg_page);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page,container,false);
        return view;
    }
}
