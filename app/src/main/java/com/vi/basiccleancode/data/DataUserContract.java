package com.vi.basiccleancode.data;

import com.vi.basiccleancode.data.response.UserEntity;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public interface DataUserContract {

    interface biz {

        void onSuccessGetUserInfo (UserEntity userEntity);

        void onFailedGetUserInfo(Throwable e);
    }

    interface repository {

        void getUserInfo(biz listener);
    }
}
