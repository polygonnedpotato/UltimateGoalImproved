package com.qualcomm.ftcrobotcontroller.ui.main;

import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.qualcomm.ftcrobotcontroller.R;
// TODO: make this ACTUALLY work.
public class TestscreenFragment extends Fragment {

    public static TestscreenFragment newInstance() {
        return new TestscreenFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

}