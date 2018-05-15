package com.vi.basiccleancode.presenter;

import com.vi.basiccleancode.data.response.UserEntity;
import com.vi.basiccleancode.model.UserData;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public class DataMapper {

    public static UserData transform (UserEntity userEntity) {
        UserData userData = new UserData();
        if (userEntity != null) {
            userData.setName(userEntity.name);
            userData.setEmail(userEntity.email);
        }
        return userData;
    }
}
