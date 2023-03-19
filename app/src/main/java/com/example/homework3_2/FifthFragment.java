package com.example.homework3_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FifthFragment extends Fragment {


    private TextView res1, res2, res3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        res1 = requireActivity().findViewById(R.id.first_result);
        res2 = requireActivity().findViewById(R.id.second_result);
        res3 = requireActivity().findViewById(R.id.third_result);

        String result1 = getArguments().getString("key1");
        res1.setText(result1);

        String result2 = getArguments().getString("key2");
        res2.setText(result2);

        String result3 = getArguments().getString("key3");
        res3.setText(result3);
    }
}