/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotdata;

import javax.annotation.Generated;

import com.amazonaws.services.iotdata.model.*;

/**
 * Abstract implementation of {@code AWSIotDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIotDataAsync extends AbstractAWSIotData implements AWSIotDataAsync {

    protected AbstractAWSIotDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(DeleteThingShadowRequest request) {

        return deleteThingShadowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteThingShadowResult> deleteThingShadowAsync(DeleteThingShadowRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteThingShadowRequest, DeleteThingShadowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(GetThingShadowRequest request) {

        return getThingShadowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetThingShadowResult> getThingShadowAsync(GetThingShadowRequest request,
            com.amazonaws.handlers.AsyncHandler<GetThingShadowRequest, GetThingShadowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest request) {

        return publishAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(PublishRequest request,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(UpdateThingShadowRequest request) {

        return updateThingShadowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateThingShadowResult> updateThingShadowAsync(UpdateThingShadowRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateThingShadowRequest, UpdateThingShadowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
