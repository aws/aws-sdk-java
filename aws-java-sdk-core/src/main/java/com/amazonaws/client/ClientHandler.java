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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Client interface to invoke an API.
 */
@SdkProtectedApi
public abstract class ClientHandler {

    /**
     * Execute's a web service request. Handles marshalling and unmarshalling of data and making the
     * underlying HTTP call(s).
     *
     * @param executionParams Parameters specific to this invocation of an API.
     * @param <Input>         Input POJO type
     * @param <Output>        Output POJO type
     * @return Unmarshalled output POJO type.
     */
    public abstract <Input, Output> Output execute(
            ClientExecutionParams<Input, Output> executionParams);

    /**
     * Shutdown and release any underlying resources.
     */
    public abstract void shutdown();
}
