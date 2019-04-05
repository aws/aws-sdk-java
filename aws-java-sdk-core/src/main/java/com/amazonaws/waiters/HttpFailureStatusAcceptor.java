/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.waiters;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.SdkProtectedApi;

@SdkProtectedApi
public class HttpFailureStatusAcceptor<Output> extends WaiterAcceptor<Output> {

    private final int expectedStatusCode;
    private final WaiterState waiterState;

    public HttpFailureStatusAcceptor(int expectedStatusCode, WaiterState waiterState) {
        this.expectedStatusCode = expectedStatusCode;
        this.waiterState = waiterState;
    }

    @Override
    public boolean matches(AmazonServiceException ase) {
        return expectedStatusCode == ase.getStatusCode();
    }

    @Override
    public WaiterState getState() {
        return waiterState;
    }
}
