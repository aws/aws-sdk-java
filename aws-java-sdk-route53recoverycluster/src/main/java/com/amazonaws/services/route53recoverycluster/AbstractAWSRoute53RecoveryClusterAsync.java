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
package com.amazonaws.services.route53recoverycluster;

import javax.annotation.Generated;

import com.amazonaws.services.route53recoverycluster.model.*;

/**
 * Abstract implementation of {@code AWSRoute53RecoveryClusterAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSRoute53RecoveryClusterAsync extends AbstractAWSRoute53RecoveryCluster implements AWSRoute53RecoveryClusterAsync {

    protected AbstractAWSRoute53RecoveryClusterAsync() {
    }

    @Override
    public java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest request) {

        return getRoutingControlStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoutingControlStateResult> getRoutingControlStateAsync(GetRoutingControlStateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRoutingControlStateRequest, GetRoutingControlStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRoutingControlsResult> listRoutingControlsAsync(ListRoutingControlsRequest request) {

        return listRoutingControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingControlsResult> listRoutingControlsAsync(ListRoutingControlsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRoutingControlsRequest, ListRoutingControlsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(UpdateRoutingControlStateRequest request) {

        return updateRoutingControlStateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStateResult> updateRoutingControlStateAsync(UpdateRoutingControlStateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStateRequest, UpdateRoutingControlStateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(UpdateRoutingControlStatesRequest request) {

        return updateRoutingControlStatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlStatesResult> updateRoutingControlStatesAsync(UpdateRoutingControlStatesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlStatesRequest, UpdateRoutingControlStatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
