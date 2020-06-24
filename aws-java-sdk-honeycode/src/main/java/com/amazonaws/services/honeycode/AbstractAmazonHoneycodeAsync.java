/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.honeycode;

import javax.annotation.Generated;

import com.amazonaws.services.honeycode.model.*;

/**
 * Abstract implementation of {@code AmazonHoneycodeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonHoneycodeAsync extends AbstractAmazonHoneycode implements AmazonHoneycodeAsync {

    protected AbstractAmazonHoneycodeAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest request) {

        return getScreenDataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetScreenDataResult> getScreenDataAsync(GetScreenDataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetScreenDataRequest, GetScreenDataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest request) {

        return invokeScreenAutomationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InvokeScreenAutomationResult> invokeScreenAutomationAsync(InvokeScreenAutomationRequest request,
            com.amazonaws.handlers.AsyncHandler<InvokeScreenAutomationRequest, InvokeScreenAutomationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
