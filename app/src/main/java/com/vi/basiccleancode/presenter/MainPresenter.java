package com.vi.basiccleancode.presenter;

import com.vi.basiccleancode.MainContract;
import com.vi.basiccleancode.data.DataUserContract;
import com.vi.basiccleancode.data.NetworkDataUser;
import com.vi.basiccleancode.data.response.UserEntity;
import com.vi.basiccleancode.model.MerchantData;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public class MainPresenter implements MainContract.Presenter, DataUserContract.biz {

    private MainContract.View view;

    private DataUserContract.repository repository;

    @Override
    public void setView(MainContract.View view) {
        this.view = view;
        repository = new NetworkDataUser();
    }

    @Override
    public void saveDateUser(String name, String email) {
        //
    }

    @Override
    public void getDataUser() {
        repository.getUserInfo(this);
    }

    @Override
    public void getDataMerchant() {
        //
        view.onSuccessGetMerchant(new MerchantData());
    }

    @Override
    public void onSuccessGetUserInfo(UserEntity userEntity) {

    }

    @Override
    public void onFailedGetUserInfo(Throwable e) {

    }
}
