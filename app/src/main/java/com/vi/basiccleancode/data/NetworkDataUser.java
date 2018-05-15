package com.vi.basiccleancode.data;

import com.vi.basiccleancode.data.mock.MockUserEntity;
import com.vi.basiccleancode.data.response.UserEntity;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public class NetworkDataUser implements DataUserContract.repository {


    @Override
    public void getUserInfo(DataUserContract.biz listener) {
        //kalo ambil ke server
        //- ga ada data
        //- network error

        MockUserEntity mockUserEntity = new MockUserEntity();

        UserEntity userEntity = mockUserEntity.getMockUserEntity();

        //kalo ga mock, ada kemungkinan data null
        if (listener == null) return;

        if (userEntity != null && userEntity.success) {
            listener.onSuccessGetUserInfo(userEntity);
        } else {
            listener.onFailedGetUserInfo(new Throwable("data is null"));
        }
    }
}
