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
public class FragmentAnother extends Fragment implements View.OnClickListener {

    private View root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_another,null);
        root.findViewById(R.id.btnBack).setOnClickListener(this);
        return root;
    }

    @Override
    public void onClick(View v) {
        getFragmentManager().beginTransaction()
                .setCustomAnimations(R.animator.enter_back,R.animator.exit_back,R.animator.enter_back,R.animator.exit_back)
                .addToBackStack("FragmentMain")
                .replace(R.id.fragment, new FragmentMain())
                .commit();
    }
}
