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

import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkProtectedApi;

/**
 * Client level parameters for the {@link ClientHandler} implementation.
 */
@SdkProtectedApi
@NotThreadSafe
public class ClientHandlerParams {

    private AwsSyncClientParams clientParams;

    /**
     * By default we use strict hostname verification for SSL. S3 disables this due to wildcard
     * certificates.
     */
    private boolean disableStrictHostnameVerification = false;

    public AwsSyncClientParams getClientParams() {
        return clientParams;
    }

    public ClientHandlerParams withClientParams(AwsSyncClientParams clientParams) {
        this.clientParams = clientParams;
        return this;
    }

    public boolean isDisableStrictHostnameVerification() {
        return disableStrictHostnameVerification;
    }


    public ClientHandlerParams withDisableStrictHostnameVerification(
            boolean disableStrictHostnameVerification) {
        this.disableStrictHostnameVerification = disableStrictHostnameVerification;
        return this;
    }
}
