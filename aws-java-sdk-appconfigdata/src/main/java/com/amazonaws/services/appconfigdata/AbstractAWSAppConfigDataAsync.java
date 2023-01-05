/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfigdata;

import javax.annotation.Generated;

import com.amazonaws.services.appconfigdata.model.*;

/**
 * Abstract implementation of {@code AWSAppConfigDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSAppConfigDataAsync extends AbstractAWSAppConfigData implements AWSAppConfigDataAsync {

    protected AbstractAWSAppConfigDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetLatestConfigurationResult> getLatestConfigurationAsync(GetLatestConfigurationRequest request) {

        return getLatestConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLatestConfigurationResult> getLatestConfigurationAsync(GetLatestConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLatestConfigurationRequest, GetLatestConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationSessionResult> startConfigurationSessionAsync(StartConfigurationSessionRequest request) {

        return startConfigurationSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationSessionResult> startConfigurationSessionAsync(StartConfigurationSessionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationSessionRequest, StartConfigurationSessionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
