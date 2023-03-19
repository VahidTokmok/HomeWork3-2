package com.example.homework3_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private TextView text1,text2,text3;
    private Button button5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text1 = requireActivity().findViewById(R.id.first_text);
        text2 = requireActivity().findViewById(R.id.second_text);
        text3 = requireActivity().findViewById(R.id.third_text);
        button5 = requireActivity().findViewById(R.id.fifth_fragment_button);

        String result = getArguments().getString("randomText");
        text1.setText(result);

        String result1 = getArguments().getString("evenNumbers");
        text2.setText(result1);

        String result2 = getArguments().getString("miscData");
        text3.setText(result2);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("key1", result);
                bundle.putString("key2", result1);
                bundle.putString("key3", result2);
                FifthFragment fragment = new FifthFragment();
                fragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().
                        beginTransaction().
                        addToBackStack(null).
                        replace(R.id.container, fragment).
                        commit();
            }
        });
    }

}