/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.internal;

import java.net.URI;
import java.net.URISyntaxException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.services.machinelearning.model.PredictRequest;

/**
 * Predict calls are sent to a predictor-specific endpoint. This handler
 * extracts the PredictRequest's PredictEndpoint "parameter" and swaps it in as
 * the endpoint to send the request to.
 */
public class PredictEndpointHandler extends RequestHandler2 {

    @Override
    public void beforeRequest(Request<?> request) {
        if (request.getOriginalRequest() instanceof PredictRequest) {
            PredictRequest pr = (PredictRequest) request.getOriginalRequest();
            if (pr.getPredictEndpoint() == null) {
                throw new AmazonClientException(
                        "PredictRequest.PredictEndpoint is required!");
            }

            try {

                request.setEndpoint(new URI(pr.getPredictEndpoint()));

            } catch (URISyntaxException e) {
                throw new AmazonClientException(
                        "Unable to parse PredictRequest.PredictEndpoint", e);
            }
        }
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
    }

    @Override
    public void afterError(Request<?> request, Response<?> response, Exception e) {
    }
}
