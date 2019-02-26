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
package com.amazonaws.opensdk.protect.client;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.opensdk.BaseRequest;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerImpl;
import com.amazonaws.client.ClientHandlerParams;

/**
 * Client handler for Open SDK generated clients. Handles exception translation and delegates to the default implementation of
 * {@link ClientHandler}.
 */
@ThreadSafe
@Immutable
public class SdkClientHandler extends ClientHandler {

    private final ClientHandler delegateHandler;

    public SdkClientHandler(ClientHandlerParams handlerParams) {
        this.delegateHandler = new ClientHandlerImpl(handlerParams);
    }

    @Override
    public <Input, Output> Output execute(
            ClientExecutionParams<Input, Output> executionParams) {
        return delegateHandler.execute(addRequestConfig(executionParams));
    }

    @Override
    public void shutdown() {
        delegateHandler.shutdown();
    }

    private <Input, Output> ClientExecutionParams<Input, Output> addRequestConfig(ClientExecutionParams<Input, Output> params) {
        return params.withRequestConfig(new RequestConfigAdapter((BaseRequest) params.getInput()));
    }

}
