package com.example.erza.registrationserviceapp.fragments.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.erza.registrationserviceapp.R;

import com.example.erza.registrationserviceapp.fragments.authenticationfragment.AuthenticationFragment;
import com.example.erza.registrationserviceapp.fragments.profilefragment.ProfileFragment;
import com.example.erza.registrationserviceapp.fragments.logoutfragment.LogoutFragment;

import butterknife.ButterKnife;

/**
 * Created by erza on 11/2/17.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AuthenticationFragment authenticationFragment;
    ProfileFragment profileFragment;
    LogoutFragment logoutFragment;
    android.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_accout_register_main);

        ButterKnife.bind(this);

        authenticationFragment = new AuthenticationFragment();
        profileFragment = new ProfileFragment();
        logoutFragment = new LogoutFragment();

        initView();


    }

    private void initView() {
        findViewById(R.id.buttonRegister);
        findViewById(R.id.buttonLogin);


    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
        startActivity(intent);

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