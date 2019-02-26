/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.client;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.Request;
import com.amazonaws.RequestConfig;
import com.amazonaws.SdkBaseException;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.transform.Marshaller;

/**
 * Encapsulates parameters needed for a particular API call. Captures input and output pojo types.
 *
 * @param <Input>  Input POJO type.
 * @param <Output> Output POJO type.
 */
@SdkProtectedApi
@NotThreadSafe
public class ClientExecutionParams<Input, Output> {

    private Input input;
    private Marshaller<Request<Input>, Input> marshaller;
    private HttpResponseHandler<Output> responseHandler;
    private HttpResponseHandler<? extends SdkBaseException> errorResponseHandler;
    private RequestConfig requestConfig;

    public Marshaller<Request<Input>, Input> getMarshaller() {
        return marshaller;
    }

    public ClientExecutionParams<Input, Output> withMarshaller(
            Marshaller<Request<Input>, Input> marshaller) {
        this.marshaller = marshaller;
        return this;
    }

    public Input getInput() {
        return input;
    }

    public ClientExecutionParams<Input, Output> withInput(Input input) {
        this.input = input;
        return this;
    }

    public HttpResponseHandler<Output> getResponseHandler() {
        return responseHandler;
    }

    public ClientExecutionParams<Input, Output> withResponseHandler(
            HttpResponseHandler<Output> responseHandler) {
        this.responseHandler = responseHandler;
        return this;
    }

    public HttpResponseHandler<? extends SdkBaseException> getErrorResponseHandler() {
        return errorResponseHandler;
    }

    public ClientExecutionParams<Input, Output> withErrorResponseHandler(
            HttpResponseHandler<? extends SdkBaseException> errorResponseHandler) {
        this.errorResponseHandler = errorResponseHandler;
        return this;
    }

    public RequestConfig getRequestConfig() {
        return requestConfig;
    }

    public ClientExecutionParams<Input, Output> withRequestConfig(RequestConfig requestConfig) {
        this.requestConfig = requestConfig;
        return this;
    }
}
