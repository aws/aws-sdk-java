package com.amazonaws.services.logs.internal;

import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;

public class AcceptJsonRequestHandler extends AbstractRequestHandler {

    @Override
    public void beforeRequest(Request<?> request) {
        request.addHeader("Accept", "application/json");
    }

}
