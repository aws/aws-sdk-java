package com.amazonaws.services.apigateway.internal;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;

public final class AcceptJsonRequestHandler extends RequestHandler2 {

    @Override
    public void beforeRequest(Request<?> request) {
        request.addHeader("Accept", "application/json");
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
        // No-op.
    }

    @Override
    public void afterError(
            Request<?> request,
            Response<?> response,
            Exception e) {

        // No-op.
    }
}
