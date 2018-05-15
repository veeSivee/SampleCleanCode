package com.vi.basiccleancode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.vi.basiccleancode.model.MerchantData;
import com.vi.basiccleancode.model.UserData;
import com.vi.basiccleancode.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private EditText etName, etEmail;

    private MainContract.Presenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private MainContract.Presenter getPresenter() {
        return new MainPresenter();
    }

    private void init() {
        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);

        mainPresenter = getPresenter();
        mainPresenter.setView(this);

        mainPresenter.getDataMerchant();
    }

    public void saveDataUser(View view) {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        mainPresenter.saveDateUser(name, email);
    }

    public void clearUi(View view) {
        clearView();
    }

    private void clearView() {
        etName.setText("");
        etEmail.setText("");
    }

    public void getDataUser(View view) {
        mainPresenter.getDataUser();
    }

    @Override
    public void finishSaveDataUser() {
        Toast.makeText(this, "Save Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccessGetDataUser(UserData userData) {
        etName.setText(userData.getName());
        etEmail.setText(userData.getEmail());
    }

    @Override
    public void onFailed(String message) {
        clearView();
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSuccessGetMerchant(MerchantData data) {

    }
}
