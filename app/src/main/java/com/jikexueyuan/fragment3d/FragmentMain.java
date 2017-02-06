package com.jikexueyuan.fragment3d;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by huyiqing on 2017/1/9.
 */
public class FragmentMain extends Fragment implements View.OnClickListener {

    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_main,null);

        root.findViewById(R.id.btnJump).setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        getFragmentManager().beginTransaction()
                .setCustomAnimations(R.animator.enter,R.animator.exit,R.animator.enter,R.animator.exit)
                .addToBackStack("FragmentAnother")
                .replace(R.id.fragment, new FragmentAnother())
                .commit();
    }
}
