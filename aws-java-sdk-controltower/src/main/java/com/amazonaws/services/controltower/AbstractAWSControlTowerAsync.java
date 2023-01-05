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
package com.amazonaws.services.controltower;

import javax.annotation.Generated;

import com.amazonaws.services.controltower.model.*;

/**
 * Abstract implementation of {@code AWSControlTowerAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSControlTowerAsync extends AbstractAWSControlTower implements AWSControlTowerAsync {

    protected AbstractAWSControlTowerAsync() {
    }

    @Override
    public java.util.concurrent.Future<DisableControlResult> disableControlAsync(DisableControlRequest request) {

        return disableControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableControlResult> disableControlAsync(DisableControlRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableControlRequest, DisableControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableControlResult> enableControlAsync(EnableControlRequest request) {

        return enableControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableControlResult> enableControlAsync(EnableControlRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableControlRequest, EnableControlResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetControlOperationResult> getControlOperationAsync(GetControlOperationRequest request) {

        return getControlOperationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetControlOperationResult> getControlOperationAsync(GetControlOperationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetControlOperationRequest, GetControlOperationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEnabledControlsResult> listEnabledControlsAsync(ListEnabledControlsRequest request) {

        return listEnabledControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnabledControlsResult> listEnabledControlsAsync(ListEnabledControlsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEnabledControlsRequest, ListEnabledControlsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
