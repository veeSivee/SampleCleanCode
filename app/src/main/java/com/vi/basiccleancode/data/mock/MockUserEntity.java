package com.vi.basiccleancode.data.mock;

import com.vi.basiccleancode.data.response.ErrorResponse;
import com.vi.basiccleancode.data.response.UserEntity;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public class MockUserEntity {

    public UserEntity getMockUserEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.success = true;
        userEntity.errorResponse = new ErrorResponse("", "");
        userEntity.name = "mock name";
        userEntity.email = "hi@gmail.com";
        userEntity.address = "Jl. bla bla bla";
        userEntity.dateOfBirth = "12/12/2012";
        userEntity.phoneNumber = "085xxxxxxxxxxx";
        return userEntity;
    }
}
