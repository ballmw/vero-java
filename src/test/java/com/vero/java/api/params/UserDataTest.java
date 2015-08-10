package com.vero.java.api.params;

/**
 * @author szagriichuk.
 */
public class UserDataTest extends ComplexParamTest {

    @Override
    Param<?> getParameter(VeroData<String> value) {
        return new UserData(value);
    }
}