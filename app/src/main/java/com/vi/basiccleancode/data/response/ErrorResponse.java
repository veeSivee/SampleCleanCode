package com.vi.basiccleancode.data.response;

/**
 * Created by taufiqotulfaidah on 3/25/18.
 */

public class ErrorResponse {

    public String id;

    public String message;

    public ErrorResponse(String id, String message) {
        this.id = id;
        this.message = message;
    }
}
