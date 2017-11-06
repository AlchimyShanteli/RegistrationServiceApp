package com.example.erza.registrationserviceapp.fragments.main;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.erza.registrationserviceapp.R;

import com.example.erza.registrationserviceapp.fragments.authenticationfragment.AuthenticationFragment;
import com.example.erza.registrationserviceapp.fragments.profilefragment.ProfileFragment;
import com.example.erza.registrationserviceapp.fragments.logoutfragment.LogoutFragment;


/**
 * Created by erza on 11/2/17.
 */

public class RegistrationActivity extends AppCompatActivity {

    AuthenticationFragment authenticationFragment;
    ProfileFragment profileFragment;
    LogoutFragment logoutFragment;
    android.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_registration);

        authenticationFragment = new AuthenticationFragment();
        profileFragment = new ProfileFragment();
        logoutFragment = new LogoutFragment();


    }

    public void onClick(View view) {

        fragmentTransaction = getFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.buttonRegister:
                fragmentTransaction.add(R.id.frgmCont, authenticationFragment);
                break;
            case R.id.buttonLogin:
                fragmentTransaction.add(R.id.frgmCont, profileFragment);
                break;
            case R.id.buttonLogout:
                fragmentTransaction.add(R.id.frgmCont, logoutFragment);
                break;
        }
        fragmentTransaction.commit();


    }
}
