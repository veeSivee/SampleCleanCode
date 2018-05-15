package com.vi.basiccleancode;

import com.vi.basiccleancode.model.MerchantData;
import com.vi.basiccleancode.model.UserData;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public interface MainContract {

    interface View {

        void finishSaveDataUser ();

        void onSuccessGetDataUser (UserData userData);

        void onFailed (String message);

        void onSuccessGetMerchant(MerchantData data);
    }

    interface Presenter {

        void setView (MainContract.View view);

        void saveDateUser (String name, String email);

        void getDataUser();

        void getDataMerchant();
    }
}
