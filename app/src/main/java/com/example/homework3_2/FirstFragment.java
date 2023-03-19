package com.example.homework3_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Random;

public class FirstFragment extends Fragment {

    private Button button2, button3, button4;

    private final String[] randomTexts = {"Lorem ipsum", "dolor sit", "amet", "consectetur", "adipiscing elit"};
    private final String[] randomElements = {"true", "3.1234", "false"};
    private final String[] randomNumber = {"2", "10", "12", "14", "18", "200", "2000", "23332"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button2 = requireActivity().findViewById(R.id.second_fragment_button);
        button3 = requireActivity().findViewById(R.id.third_fragment_button);
        button4 = requireActivity().findViewById(R.id.fourth_fragment_button);

        button2.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString("randomText", getRandomText());
            bundle.putString("evenNumbers", getRandomNumber());
            bundle.putString("miscData", getRandomElements());
            FourthFragment fragment = new FourthFragment();
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().
                    beginTransaction().
                    addToBackStack(null).
                    replace(R.id.container, fragment).
                    commit();
        });

        button3.setOnClickListener(view12 -> {
            Bundle bundle = new Bundle();
            bundle.putString("randomText", getRandomText());
            bundle.putString("evenNumbers", getRandomNumber());
            bundle.putString("miscData", getRandomElements());
            ThirdFragment fragment = new ThirdFragment();
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().
                    beginTransaction().
                    addToBackStack(null).
                    replace(R.id.container, fragment).
                    commit();
        });

        button4.setOnClickListener(view13 -> {
            Bundle bundle = new Bundle();
            bundle.putString("randomText", getRandomText());
            bundle.putString("evenNumbers", getRandomNumber());
            bundle.putString("miscData", getRandomElements());
            FourthFragment fragment = new FourthFragment();
            fragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().
                    beginTransaction().
                    addToBackStack(null).
                    replace(R.id.container, fragment).
                    commit();
        });
    }

    private String getRandomText() {
        return randomTexts[new Random().nextInt(randomTexts.length)];
    }

    private String getRandomElements() {
        return randomElements[new Random().nextInt(randomElements.length)];
    }

    private String getRandomNumber() {
        return randomNumber[new Random().nextInt(randomNumber.length)];
    }

}