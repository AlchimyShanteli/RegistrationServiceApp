package com.example.erza.registrationserviceapp.fragments.logoutfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.erza.registrationserviceapp.R;


/**
 * Created by erza on 11/2/17.
 */

public class LogoutFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_logout, container, false);
    }
}
