/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemakeredgemanager;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakeredgemanager.model.*;

/**
 * Abstract implementation of {@code AmazonSagemakerEdgeManagerAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonSagemakerEdgeManagerAsync extends AbstractAmazonSagemakerEdgeManager implements AmazonSagemakerEdgeManagerAsync {

    protected AbstractAmazonSagemakerEdgeManagerAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetDeviceRegistrationResult> getDeviceRegistrationAsync(GetDeviceRegistrationRequest request) {

        return getDeviceRegistrationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetDeviceRegistrationResult> getDeviceRegistrationAsync(GetDeviceRegistrationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRegistrationRequest, GetDeviceRegistrationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendHeartbeatResult> sendHeartbeatAsync(SendHeartbeatRequest request) {

        return sendHeartbeatAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendHeartbeatResult> sendHeartbeatAsync(SendHeartbeatRequest request,
            com.amazonaws.handlers.AsyncHandler<SendHeartbeatRequest, SendHeartbeatResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
