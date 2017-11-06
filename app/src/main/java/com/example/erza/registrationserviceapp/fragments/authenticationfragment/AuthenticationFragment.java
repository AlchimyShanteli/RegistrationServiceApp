package com.example.erza.registrationserviceapp.fragments.authenticationfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.erza.registrationserviceapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by erza on 11/2/17.
 */

public class AuthenticationFragment extends Fragment implements AuthenticationView {

    @BindView(R.id.mailInputText) EditText mail;
    @BindView(R.id.passwordInputText) EditText password;
    @BindView(R.id.confirmPassword) EditText confirmPassword;
    @BindView(R.id.buttonRegister) EditText register;
    @BindView(R.id.buttonLogin) EditText login;
    @BindView(R.id.buttonLogout) EditText logout;


    private AuthenticationFragment presenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_authentication, container, false);
        ButterKnife.bind(this, view);
                return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new AuthenticationFragment();
    }


    @Override
    public Fragment getFragment() {
        return this;
    }


}

