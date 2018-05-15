package com.vi.basiccleancode;

import com.vi.basiccleancode.model.UserData;

/**
 * Created by taufiqotulfaidah on 5/15/18.
 */

public interface MainView {

    void finishSaveDataUser ();

    void onSuccessGetDataUser (UserData userData);

    void onFailed (String message);
}
